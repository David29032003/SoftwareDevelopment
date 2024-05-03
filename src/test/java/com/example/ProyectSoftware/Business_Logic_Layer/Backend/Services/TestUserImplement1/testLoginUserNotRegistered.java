package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestUserImplement1;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.RepositoryForTheUsers;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOLogin;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.ValidationForTheUser;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.UserServiceImplement1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
public class testLoginUserNotRegistered {

    @Mock
    private RepositoryForTheUsers respositoryForTheUsers;

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

    @DisplayName("Test para el login de un usuario no registrado")
    @Test
    void testLoginUserNotRegistered() throws Exception {
        //Arrange
        String email = "Andrei@Example.com";
        String password = "Andrei2903";
        DTOLogin dtoLogin = new DTOLogin(email, password);
        when(respositoryForTheUsers.findUserByEmail(email)).thenReturn(Optional.empty());

        //Act
        HashMap<String, String> result = userServiceImplement1.LoginUser(dtoLogin);

        //Assert
        assertEquals(1, result.size());
        assertEquals("User not registered!", result
                .get("error"));
    }
}
