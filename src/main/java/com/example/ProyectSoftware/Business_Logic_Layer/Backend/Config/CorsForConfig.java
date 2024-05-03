package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.context.annotation.Configuration;

//Declaramos la clase como una clase de configuracion de Spring
@Configuration
public class CorsForConfig implements WebMvcConfigurer {

    //Configuramos las reglas CORS con los siguientes metodos
    @Override
    public void addCorsMappings(CorsRegistry register){
        //Configuramos las reglas CORS para todas las rutas de la aplicacion
        register.addMapping("/**")
                .allowedOrigins("http://localhost:5173")
                .allowCredentials(true)
                .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
                .allowedMethods("GET","POST","PUT", "DELETE", "OPTIONS")
                .maxAge(3600);

        //Configuramos las reglas CORS especificas para la ruta /user/**
        register.addMapping("/user/**")
                .allowedOrigins("http://localhost:5173")
                .allowCredentials(false)
                .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
                .allowedMethods("GET","POST","PUT", "DELETE", "OPTIONS")
                .maxAge(3600);
    }
}
