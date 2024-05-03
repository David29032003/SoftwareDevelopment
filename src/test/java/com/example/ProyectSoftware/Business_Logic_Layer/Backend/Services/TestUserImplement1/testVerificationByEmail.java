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
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class testVerificationByEmail {

    @Mock
    private RepositoryForTheUsers repositoryForTheUsers;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @InjectMocks
    private UserServiceImplement1 userServiceImplement1;

    @Mock
    private ValidationForTheUser validationForTheUser;

    private UserEntity user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this); // Inicializar los objetos mock
        user = UserEntity.builder()
                .id(21)
                .name("Alexandra")
                .password("Alexandra34756")
                .email("Alexandra@outlook.com")
                .build();
    }

    @DisplayName("Test para verificar que un usuario ya existe por email")
    @Test
    void testVerificationByEmail() throws Exception {
        //given
        UserEntity existingUser = UserEntity.builder()
                .id(21)
                .name("David")
                .password("David123")
                .email("David@outlook.com") // Correo electrónico ya existente en la base de datos
                .build();
        when(repositoryForTheUsers.findUserByEmail(user.getEmail())).thenReturn(Optional.of(existingUser));

        //when
        DTOResponse dtoResponse = userServiceImplement1.registerTest(user);

        //then
        assertNotNull(dtoResponse); // Verifica que el objeto responseDTO no sea nulo
        assertEquals("User already exists with this email", dtoResponse.getMessage());
    }
}

