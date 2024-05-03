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
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class testVerificationByName {
    @Mock
    private RepositoryForTheUsers repositoryForTheUsers;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @InjectMocks
    private UserServiceImplement1 userServiceImplement1;

    @Mock
    private ValidationForTheUser validationForTheUser;

    private UserEntity userEntity;

    @BeforeEach
    void setUp() {
        userEntity = UserEntity.builder()
                .id(21)
                .name("Alexandra")
                .password("Alexandra34756")
                .email("Alexandra@outlook.com")
                .build();
    }

    @DisplayName("Test para verificar que un usuario ya existe por nombre de usuario")
    @Test
    void testVerificationByName() throws Exception {
        //given
        UserEntity existingUser = UserEntity.builder()
                .id(22)
                .name("Alexandra")
                .password("Alexandra34756")
                .email("Ale@outlook.com") // Correo electrónico ya existente en la base de datos
                .build();
        when(repositoryForTheUsers.findUserByName(userEntity.getName())).thenReturn(Optional.of(existingUser));

        //when
        DTOResponse dtoResponse = userServiceImplement1.registerTest(userEntity);

        //then
        assertNotNull(dtoResponse); // Verifica que el objeto responseDTO no sea nulo
        assertEquals("User already exists with this username", dtoResponse.getMessage());
    }
}
