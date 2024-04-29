package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Declaramos la clase como una clase de configuracion de Spring
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    //Configuramos las reglas CORS con los siguientes metodos
    @Override
    public void addCorsMappings(CorsRegistry registry){
        //Configuramos las reglas CORS para todas las rutas de la aplicacion
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("GET","POST","PUT", "DELETE", "OPTIONS")
                .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
                .allowCredentials(true)
                .maxAge(3600);

        //Configuramos las reglas CORS especificas para la ruta /user/**
        registry.addMapping("/user/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("GET","POST","PUT", "DELETE", "OPTIONS")
                .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
