package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.TestJWTAuthorizationFilter;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.JWTAuthorizationFilter;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.nimbusds.jose.JOSEException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.security.sasl.AuthenticationException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class testDoFilterInternalExceptionHansling {
    @InjectMocks
    private JWTAuthorizationFilter jwtAuthorizationFilter;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private FilterChain filterChain;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoFilterInternal_ExceptionsHandling() throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, ParseException, JOSEException {
        //Mock del token JWT inválido
        String token = "InvalidToken";

        //Configuro el encabezado de autorización en la solicitud
        when(request.getHeader("Authorization")).thenReturn("Bearer " + token);

        //Configuro el comportamiento del servicio para lanzar una excepción al analizar el token JWT
        when(jwtUtilityService.parseJWT(token)).thenThrow(AuthenticationException.class); // Por ejemplo, podría ser una AuthenticationException

        //Verifico que se lance una excepción al ejecutar el método doFilterInternal
        assertThrows(AuthenticationException.class, () -> jwtAuthorizationFilter.doFilterInternal(request, response, filterChain));
    }
}
