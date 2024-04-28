package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.nimbusds.jwt.JWTClaimsSet;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.text.ParseException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import java.io.IOException;


import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import com.nimbusds.jose.JOSEException;

import javax.security.sasl.AuthenticationException;

import static org.mockito.Mockito.*;

public class JWTAuthorizationFilterTest {

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
    public void testDoFilterInternal() throws ServletException, IOException, ParseException, InvalidKeySpecException, NoSuchAlgorithmException, JOSEException, java.text.ParseException {
        // Mock del token JWT
        String token = "dummyToken";

        // Mock de las reclamaciones del token JWT
        JWTClaimsSet claims = new JWTClaimsSet.Builder()
                .subject("user123")
                .build();

        // Configurar el comportamiento del servicio para devolver las reclamaciones del token JWT
        when(jwtUtilityService.parseJWT(token)).thenReturn(claims);

        // Configurar el encabezado de autorización en la solicitud
        when(request.getHeader("Authorization")).thenReturn("Bearer " + token);

        // Llamar al método doFilterInternal
        jwtAuthorizationFilter.doFilterInternal(request, response, filterChain);

        // Verificar que se haya creado correctamente la autenticación
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        assert authenticationToken != null;
        assert authenticationToken.getPrincipal().equals("user123");

        // Verificar que se haya llamado al siguiente filtro
        verify(filterChain, times(1)).doFilter(request, response);
    }

    @Test
    public void testDoFilterInternal_NoToken() throws ServletException, IOException {
        // Configurar el encabezado de autorización en la solicitud como nulo
        when(request.getHeader("Authorization")).thenReturn(null);

        // Llamar al método doFilterInternal
        jwtAuthorizationFilter.doFilterInternal(request, response, filterChain);

        // Verificar que no se haya creado ninguna autenticación
        assert SecurityContextHolder.getContext().getAuthentication() == null;

        // Verificar que se haya llamado al siguiente filtro
        verify(filterChain, times(1)).doFilter(request, response);
    }

    @Test
    public void testDoFilterInternal_ExceptionsHandling() throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, ParseException, JOSEException {
        // Mock del token JWT inválido
        String token = "invalidToken";

        // Configurar el encabezado de autorización en la solicitud
        when(request.getHeader("Authorization")).thenReturn("Bearer " + token);

        // Configurar el comportamiento del servicio para lanzar una excepción al analizar el token JWT
        when(jwtUtilityService.parseJWT(token)).thenThrow(AuthenticationException.class); // Por ejemplo, podría ser una AuthenticationException

        // Verificar que se lance una excepción al ejecutar el método doFilterInternal
        assertThrows(AuthenticationException.class, () -> jwtAuthorizationFilter.doFilterInternal(request, response, filterChain));
    }

}
