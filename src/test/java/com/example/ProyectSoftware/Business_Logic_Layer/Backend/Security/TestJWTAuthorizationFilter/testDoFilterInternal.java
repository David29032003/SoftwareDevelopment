package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.TestJWTAuthorizationFilter;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.JWTAuthorizationFilter;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.nimbusds.jose.JOSEException;
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
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;

import static org.mockito.Mockito.*;

public class testDoFilterInternal {
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
    public void testDoFilterInternal() throws ServletException, IOException, ParseException, InvalidKeySpecException, NoSuchAlgorithmException, JOSEException, ParseException {
        //Mock del token JWT
        String token = "TokenForTest";

        //Mock de las reclamaciones del token JWT
        JWTClaimsSet claims = new JWTClaimsSet.Builder()
                .subject("TestUser1")
                .build();

        //Configuramos el comportamiento del servicio para devolver las reclamaciones del token JWT
        when(jwtUtilityService.parseJWT(token)).thenReturn(claims);

        //Configuramos el encabezado de autorización en la solicitud
        when(request.getHeader("Authorization")).thenReturn("Bearer " + token);

        // Llamar al método doFilterInternal
        jwtAuthorizationFilter.doFilterInternal(request, response, filterChain);

        //Verificamos que se haya creado correctamente la autenticación
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        assert authenticationToken != null;
        assert authenticationToken.getPrincipal().equals("TestUser1");

        //Verificamos que se haya llamado al siguiente filtro
        verify(filterChain, times(1)).doFilter(request, response);
    }
}
