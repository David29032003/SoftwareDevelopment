package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Config;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.ValidationForTheUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestValidationForConfig {

     @Test
     void testUserValidation(){
         //Arrange
         AnnotationConfigApplicationContext Annotation = new AnnotationConfigApplicationContext(ValidationForConfig.class);

         //Act
         ValidationForTheUser validationForTheUser = Annotation.getBean(ValidationForTheUser.class);

         //Assert
         assertNotNull(validationForTheUser);
         assertTrue(validationForTheUser instanceof ValidationForTheUser);

         //For close the context
         Annotation.close();

     }

}
