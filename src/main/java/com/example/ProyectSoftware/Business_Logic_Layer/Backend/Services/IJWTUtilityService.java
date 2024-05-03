package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

//Importaciones necesarias para manejar excepciones y objetos relacionados con JWT
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.JWTClaimsSet;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;

//Interfaz que define métodos para generar y analizar tokens JWT
//corrected
public interface IJWTUtilityService {
    //Método para generar un token JWT dado un ID
    public String GenerateTheJWT(Integer id) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, JOSEException;

    //Método para analizar y validar un token JWT dado
    public JWTClaimsSet ParseTheJWT(String jwt) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, ParseException, JOSEException;
}