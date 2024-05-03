package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.TestJWTAuthorizationFilter;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.JWTAuthorizationFilter;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class testDoFilterInternalNoToken {
    @InjectMocks
    private JWTAuthorizationFilter jwtAuthorizationFilter;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @Mock
    private HttpServletRequest HttpRequest;

    @Mock
    private HttpServletResponse HttpResponse;

    @Mock
    private FilterChain filterChain;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoFilterInternalNoToken() throws ServletException, IOException {
        //Configuramos el encabezado de autorización en la solicitud como nulo
        when(HttpRequest.getHeader("Authorization")).thenReturn(null);
        //Llamo al método doFilterInternal
        jwtAuthorizationFilter.doFilterInternal(HttpRequest, HttpResponse, filterChain);
        //Verifico que no se haya creado ninguna autenticación
        assert SecurityContextHolder.getContext().getAuthentication() == null;

        //Verifico que se haya llamado al siguiente filtro
        verify(filterChain, times(1)).doFilter(HttpRequest, HttpResponse);
    }
}
