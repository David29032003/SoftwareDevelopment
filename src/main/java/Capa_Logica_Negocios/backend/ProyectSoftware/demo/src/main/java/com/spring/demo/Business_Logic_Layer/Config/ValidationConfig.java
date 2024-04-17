package com.spring.demo.Business_Logic_Layer.Config;

import com.spring.demo.Business_Logic_Layer.Services.Models.Validation.UserValidation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Declaramos la clase como una clase de configuracion de Spring
@Configuration
public class ValidationConfig {
    /*
    * este metodo crea y confgura el bean UserValidation y
    * tambien retorna una instancia de UserValidation
    * */
    @Bean
    public UserValidation userValidation(){
        // Crear y retornar una nueva instancia de UserValidation
        return new UserValidation();
    }
}
