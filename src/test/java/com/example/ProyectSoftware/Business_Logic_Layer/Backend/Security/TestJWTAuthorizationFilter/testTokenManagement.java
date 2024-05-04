package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.TestJWTAuthorizationFilter;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.TokenManagement;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.UserServiceImplement1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class testTokenManagement {

    @InjectMocks
    private TokenManagement tokenManagement;

    @Mock
    private UserServiceImplement1 userServiceImplement1;

    private final int IdUser= 1;
    private final String JWTToken = "sampleJWT";

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @DisplayName("Test para verificar si un token está activo")
    @Test
    void testTokenActivated() {
        // Arrange
        tokenManagement.RegisterForActivatedTokens(IdUser, JWTToken);

        // Act
        boolean isTokenActive = tokenManagement.TokenActivated(IdUser, JWTToken);

        // Assert
        assertTrue(isTokenActive);
    }

    @DisplayName("Test para registrar un token activo")
    @Test
    void testRegisterForActivatedTokens() {
        // Act
        tokenManagement.RegisterForActivatedTokens(IdUser, JWTToken);

        // Assert
        assertTrue(tokenManagement.TokenActivated(IdUser, JWTToken));
    }

    @DisplayName("Test para eliminar un token activo")
    @Test
    void testDeleteToken() {
        // Arrange
        tokenManagement.RegisterForActivatedTokens(IdUser, JWTToken);

        // Act
        tokenManagement.DeleteToken(IdUser);

        // Assert
        assertFalse(tokenManagement.TokenActivated(IdUser, JWTToken));
    }

    @DisplayName("Test para el cierre de sesión")
    @Test
    void testLogout() {
        // Arrange
        tokenManagement.RegisterForActivatedTokens(IdUser, JWTToken);

        // Act
        tokenManagement.DeleteToken(IdUser);

        // Assert
        assertFalse(tokenManagement.TokenActivated(IdUser, JWTToken));
    }
}