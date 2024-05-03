package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.JWTClaimsSet;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;

import java.io.IOException;
import java.util.Collections;
import java.security.spec.InvalidKeySpecException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

//Clase para filtrar y autorizar las solicitudes utilizando tokens JWT
//corrected
public class JWTAuthorizationFilter extends OncePerRequestFilter {

    @Autowired
    IJWTUtilityService ijwtUtilityService;

    //Constructor que toma una instancia de IJWTUtilityService
    public JWTAuthorizationFilter(IJWTUtilityService jwtUtilityService) {
        this.ijwtUtilityService = jwtUtilityService;
    }

    //Método para filtrar cada solicitud HTTP
    @Override
    public void doFilterInternal(HttpServletRequest HttpRequest, HttpServletResponse HttpResponse, FilterChain ChainFilter) throws ServletException, IOException {
        //Obtengo el encabezado Authorization de la solicitud
        String HeaderForRequest = HttpRequest.getHeader("Authorization");

        //Verifico si el encabezado es nulo o no comienza con "Bearer"
        if(HeaderForRequest == null || !HeaderForRequest.startsWith("Bearer ")){
            ChainFilter.doFilter(HttpRequest, HttpResponse);
            return;
        }

        //Extraer el token JWT de la cadena del encabezado
        String token = HeaderForRequest.substring(7);

        try{
            //Analizar y validar el token JWT utilizando el servicio IJWTUtilityService
            JWTClaimsSet ClaimSet = ijwtUtilityService.ParseTheJWT(token);
            //Crear un objeto de autenticación utilizando el sujeto del token JWT
            UsernamePasswordAuthenticationToken TokenAuthentication= new UsernamePasswordAuthenticationToken(ClaimSet.getSubject(), null, Collections.emptyList());
            //Establecer el contexto de seguridad con la autenticación creada
            SecurityContextHolder.getContext().setAuthentication(TokenAuthentication);

            //Manejar cualquier excepción que pueda ocurrir durante el proceso de validación del token JWT
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (JOSEException e) {
            throw new RuntimeException(e);
        }
    //Continuar con el siguiente filtro
    ChainFilter.doFilter(HttpRequest, HttpResponse);
    }
}
