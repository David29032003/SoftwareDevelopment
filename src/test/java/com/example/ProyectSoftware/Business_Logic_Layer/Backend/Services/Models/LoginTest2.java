package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.UserRepository;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.UserServiceImpl;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.LoginDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
public class LoginTest2 {
    @Mock
    private UserRepository userRepository;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void login_WithRegisteredUserAndCorrectPassword_ReturnsSuccessfulAuthentication() throws Exception {
        // Arrange
        String email = "Jhan@outlook.com";
        String password = "$2a$12$z5Meu.w45eUtAHOrgxxhQO5DbO0QN1L6QiclKX3K8rtvzQWkL1Q4."; // Contraseña almacenada en la base de datos
        String enteredPassword = "Jhan34756"; // Contraseña introducida por el usuario

        LoginDTO loginDTO = new LoginDTO(email, enteredPassword);
        UserEntity userEntity = new UserEntity();
        userEntity.setId(23);
        userEntity.setEmail(email);
        userEntity.setPassword(password);

        // Simulamos que la contraseña es correcta llamando directamente al método verifyPassword()
        when(userRepository.findByEmail(email)).thenReturn(Optional.of(userEntity));
        when(userService.verifyPassword(eq(enteredPassword), eq(password))).thenReturn(true);

        // Act
        HashMap<String, String> result = userService.login(loginDTO);

        // Assert
        assertEquals("Authentication succefully", result.get("success"));
    }

    @Test
    void login_WithUnregisteredUser_ReturnsUserNotRegisteredError() throws Exception {
        // Arrange
        String email = "unknown@example.com";
        String password = "password";

        LoginDTO loginDTO = new LoginDTO(email, password);

        when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

        // Act
        HashMap<String, String> result = userService.login(loginDTO);

        // Assert
        assertEquals("User not registered!", result.get("error"));
    }

    @Test
    void login_WithRegisteredUserAndIncorrectPassword_ReturnsFailedAuthentication() throws Exception {
        // Arrange
        String email = "test@example.com";
        String password = "wrongpassword";

        LoginDTO loginDTO = new LoginDTO(email, password);
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setEmail(email);
        userEntity.setPassword("correctpassword");

        when(userRepository.findByEmail(email)).thenReturn(Optional.of(userEntity));

        // Act
        HashMap<String, String> result = userService.login(loginDTO);

        // Assert
        assertEquals("Authentication failed", result.get("failed"));
    }

}
