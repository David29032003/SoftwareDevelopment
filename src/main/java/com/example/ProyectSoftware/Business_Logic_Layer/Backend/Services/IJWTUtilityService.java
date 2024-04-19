package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

// Importaciones necesarias para manejar excepciones y objetos relacionados con JWT
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.JWTClaimsSet;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;

// Interfaz que define métodos para generar y analizar tokens JWT
public interface IJWTUtilityService {
    // Método para generar un token JWT dado un ID
    // Este método puede arrojar excepciones de E/S (IOException),
    // NoSuchAlgorithmException, InvalidKeySpecException y JOSEException
    public String generateJWT(Integer id) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, JOSEException;

    // Método para analizar y validar un token JWT dado
    // Este método puede arrojar excepciones de E/S (IOException),
    // InvalidKeySpecException, NoSuchAlgorithmException, ParseException y JOSEException
    public JWTClaimsSet parseJWT(String jwt) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, ParseException, JOSEException;
}