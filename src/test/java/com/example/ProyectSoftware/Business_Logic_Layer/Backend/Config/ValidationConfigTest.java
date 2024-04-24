package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Config;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.UserValidation;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

public class ValidationConfigTest {

     @Test
     void testUserValidation(){
         //Arrange
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);

         //Act
         UserValidation userValidation = context.getBean(UserValidation.class);

         //Assert
         assertNotNull(userValidation);
         assertTrue(userValidation instanceof UserValidation);

         //Close the context
         context.close();

     }

}
