package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//Configuración de seguridad de Spring
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true)

public class SecurityConfig {
    //Inyección del servicio de utilidad JWT
    @Autowired
    private IJWTUtilityService jwtUtilityService;

    //Configuración del filtro de seguridad
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                //Deshabilita la protección CSRF
                .csrf(csrf ->
                        csrf.disable()
                        )
                //Configura las reglas de autorización HTTP
                .authorizeHttpRequests(authRequest ->
                        authRequest
                                //Permite todas las solicitudes a /user/**
                                .requestMatchers("/user/**").permitAll()
                                //Requiere autenticación para cualquier otra solicitud
                                .anyRequest().authenticated()
                )
                //Configura la gestión de sesiones
                .sessionManagement(sessionManager ->
                        sessionManager
                                //Establece la política de creación de sesiones como STATELESS (sin estado)
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                //Agrega el filtro de autorización JWT antes del filtro de autenticación de usuario y contraseña
                .addFilterBefore(new JWTAuthorizationFilter(jwtUtilityService),
        UsernamePasswordAuthenticationFilter.class)
                //Configura el manejo de excepciones para responder con un código de estado de no autorizado
                .exceptionHandling(exceptionHandling ->
                        exceptionHandling
                                .authenticationEntryPoint((request, response, authException) ->{
                                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
                        }))
                .build();
    }

    //Bean para proporcionar un codificador de contraseñas BCrypt
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
