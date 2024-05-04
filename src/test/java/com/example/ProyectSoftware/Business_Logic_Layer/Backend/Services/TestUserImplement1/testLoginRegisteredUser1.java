package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestUserImplement1;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.RepositoryForTheUsers;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOLogin;
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

public class testLoginRegisteredUser1 {

    @Mock
    private RepositoryForTheUsers respositoryForTheUsers;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @InjectMocks
    private UserServiceImplement1 userServiceImplement1;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void LoginWithUnregisteredUser() throws Exception {
        //Arrange
        String email = "Alexandro@example.com";
        String password = "Alex123";
        DTOLogin dtoLogin = new DTOLogin(email, password);
        when(respositoryForTheUsers.findUserByEmail(email)).thenReturn(Optional.empty());

        //Act
        HashMap<String, String> result = userServiceImplement1.LoginUser(dtoLogin);

        //Assert
        assertEquals("success", result.get("Authentication succefully"));
    }
}
