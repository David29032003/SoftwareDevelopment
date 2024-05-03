package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class TestLoginDTO {
    @Test
    void testLoginDTO() {
        //Arrange
        String email = "David@Example.com";
        String password = "David1234";

        //Act
        DTOLogin dtoLogin = new DTOLogin();
        dtoLogin.setPassword(password);
        dtoLogin.setEmail(email);

        //Assert
        assertNotNull(dtoLogin);
        assertEquals(email, dtoLogin.getEmail());
        assertEquals(password, dtoLogin.getPassword());
    }
}
