package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoginDTOTest {
    @Test
    void testLoginDTO() {
        //Arrange
        String email = "Email@ExampleTest.com";
        String password = "Password2903";

        //Act
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setPassword(password);
        loginDTO.setEmail(email);

        //Assert
        assertNotNull(loginDTO);
        assertEquals(email, loginDTO.getEmail());
        assertEquals(password, loginDTO.getPassword());
    }
}
