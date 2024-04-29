package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestUserImplement1;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.UserRepository;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.LoginDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.UserServiceImplement1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

public class testLoginRegisteredUserWithIncorrectPassword {

    @Mock
    private UserRepository userRepository;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @InjectMocks
    private UserServiceImplement1 userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void login_WithUnregisteredUser_ReturnsUserNotRegisteredError() throws Exception {
        //Arrange
        String email = "unknown@example.com";
        String password = "password";
        LoginDTO loginDTO = new LoginDTO(email, password);
        when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

        //Act
        HashMap<String, String> result = userService.login(loginDTO);

        //Assert
        assertEquals("User not registered!", result.get("error"));
    }
}
