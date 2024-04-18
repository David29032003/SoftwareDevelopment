package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.JWTClaimsSet;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Collections;

// Clase para filtrar y autorizar las solicitudes utilizando tokens JWT
public class JWTAuthorizationFilter extends OncePerRequestFilter {

    @Autowired
    IJWTUtilityService jwtUtilityService;

    // Constructor que toma una instancia de IJWTUtilityService
    public JWTAuthorizationFilter(IJWTUtilityService jwtUtilityService) {
        this.jwtUtilityService = jwtUtilityService;
    }

    // Método para filtrar cada solicitud HTTP
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Obtener el encabezado Authorization de la solicitud
        String header = request.getHeader("Authorization");

        // Verificar si el encabezado es nulo o no comienza con "Bearer"
        if(header == null || !header.startsWith("Bearer ")){
            filterChain.doFilter(request, response);
            return;
        }

        // Extraer el token JWT de la cadena del encabezado
        String token = header.substring(7);

        try{
            // Analizar y validar el token JWT utilizando el servicio IJWTUtilityService
            JWTClaimsSet claims = jwtUtilityService.parseJWT(token);
            // Crear un objeto de autenticación utilizando el sujeto del token JWT
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(claims.getSubject(), null, Collections.emptyList());
            // Establecer el contexto de seguridad con la autenticación creada
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);

            // Manejar cualquier excepción que pueda ocurrir durante el proceso de validación del token JWT
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (JOSEException e) {
            throw new RuntimeException(e);
        }
        // Continuar con el siguiente filtro
    filterChain.doFilter(request, response);
    }
}
