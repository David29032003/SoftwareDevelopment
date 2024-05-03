package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestUserImplement1;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.RepositoryForTheUsers;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOResponse;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.ValidationForTheUser;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.UserServiceImplement1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class TestRegisterUser {

    @Mock
    private RepositoryForTheUsers repositoryForTheUsers;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @InjectMocks
    private UserServiceImplement1 userService;

    @Mock
    private ValidationForTheUser userValidation;

    private UserEntity user;

    @BeforeEach
    void setUp() {
        user = UserEntity.builder()
                .id(21)
                .name("Alexandra")
                .password("Alexandra34756")
                .email("Alexandra@outlook.com")
                .build();
    }

    @DisplayName("Test para realizar el registro de un usuario")
    @Test
    void testRegistrarUsuario() throws Exception {
        //Arrange
        when(repositoryForTheUsers.findUserByEmail(user.getEmail())).thenReturn(Optional.empty());

        //Act
        DTOResponse dtoResponse = userService.registerTest(user);

        //Assert
        assertNotNull(dtoResponse); // Verifica que el objeto responseDTO no sea nulo
        assertEquals("User created successfully", dtoResponse.getMessage());
    }
}
