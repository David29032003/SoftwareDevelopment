package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Config;

import org.springframework.context.annotation.Configuration;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.ValidationForTheUser;
import org.springframework.context.annotation.Bean;

//Declaramos la clase como una clase de configuracion de Spring
@Configuration
public class ValidationForConfig {
    /*
    este metodo crea y confgura el bean UserValidation y
    tambien retorna una instancia de UserValidation
    */
    @Bean
    public ValidationForTheUser validationForTheUser(){
        //Crear y retornar una nueva instancia de UserValidation
        return new ValidationForTheUser();
    }
}
