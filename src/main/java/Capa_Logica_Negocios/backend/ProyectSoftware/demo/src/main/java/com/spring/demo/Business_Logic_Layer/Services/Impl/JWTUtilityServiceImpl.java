package com.spring.demo.Business_Logic_Layer.Services.Impl;

import com.spring.demo.Business_Logic_Layer.Services.IJWTUtilityService;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.util.Base64;
import java.util.Date;

// Anotación para indicar que esta clase es un componente de servicio de Spring
@Service
public class JWTUtilityServiceImpl implements IJWTUtilityService {
    // Inyección de dependencias para cargar las claves privadas y públicas desde recursos
    @Value("classpath:jwtKeys/private_key.pem")
    private Resource privateKeyResource;
    @Value("classpath:jwtKeys/public_key.pem")
    private Resource publicKeyResource;

    // Método para generar un token JWT
    @Override
    public String generateJWT(Integer id) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, JOSEException {
        // Carga de la clave privada
        PrivateKey privateKey = loadPrivateKey(privateKeyResource);

        // Creación de un firmador para firmar el JWT
        JWSSigner signer = new RSASSASigner(privateKey);

        // Creación de los claims (datos) del JWT
        Date now = new Date();
        JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
                .subject(id.toString())
                .issueTime(now)
                .expirationTime(new Date(now.getTime() + 14400000))
                .build();

        // Creación del JWT firmado
        SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.RS256), claimsSet);
        signedJWT.sign(signer);

        // Serialización del JWT
        return signedJWT.serialize();
    }

    // Método para analizar y validar un token JWT
    @Override
    public JWTClaimsSet parseJWT(String jwt) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, ParseException, JOSEException {
        // Carga de la clave pública
        PublicKey publicKey = loadPublicKey(publicKeyResource);

        // Parseo del JWT
        SignedJWT signedJWT = SignedJWT.parse(jwt);

        // Verificación de la firma del JWT
        JWSVerifier verifier = new RSASSAVerifier((RSAPublicKey) publicKey);
        if(!signedJWT.verify(verifier)){
            throw new JOSEException("Invalid signature");
        }

        // Obtención de los claims del JWT
        JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
        // Verificación de la fecha de expiración del JWT
        if(claimsSet.getExpirationTime().before(new Date())){
            throw new JOSEException("Expired token");
        }

        return claimsSet;
    }

    // Método privado para cargar la clave privada desde un recurso
    private PrivateKey loadPrivateKey(Resource resource) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        // Lectura del archivo de la clave privada
        byte[] keyBytes = Files.readAllBytes(Paths.get(resource.getURI()));
        String privateKeyPEM = new String(keyBytes, StandardCharsets.UTF_8)
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s", "");

        // Decodificación de la clave privada
        byte[] decodedKey = Base64.getDecoder().decode(privateKeyPEM);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        // Generación de la clave privada
        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decodedKey));
    }

    // Método privado para cargar la clave pública desde un recurso
    private PublicKey loadPublicKey(Resource resource) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
        // Lectura del archivo de la clave pública
        byte[] keyBytes = Files.readAllBytes(Paths.get(resource.getURI()));
        String publicKeyPEM = new String(keyBytes, StandardCharsets.UTF_8)
                .replace("-----BEGIN PUBLIC KEY-----", "")
                .replace("-----END PUBLIC KEY-----", "")
                .replaceAll("\\s", "");

        // Decodificación de la clave pública
        byte[] decodedKey = Base64.getDecoder().decode(publicKeyPEM);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        // Generación de la clave pública
        return keyFactory.generatePublic(new X509EncodedKeySpec(decodedKey));
    }
}
