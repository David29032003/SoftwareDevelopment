package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.UserRepository;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.LoginDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.ResponseDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.UserValidation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private IJWTUtilityService jwtUtilityService;

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserValidation userValidation;

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
        // given
        when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.empty());

        // when
        ResponseDTO responseDTO = userService.registerTest(user);

        // then
        assertNotNull(responseDTO); // Verifica que el objeto responseDTO no sea nulo
        assertEquals("User created successfully", responseDTO.getMessage());
    }

    @DisplayName("Test para verificar que un usuario ya existe por email")
    @Test
    void testVerificationByEmail() throws Exception {
        // given
        UserEntity existingUser = UserEntity.builder()
                .id(22)
                .name("Existing User")
                .password("ExistingUser123")
                .email("Alexandra@outlook.com") // Correo electrónico ya existente en la base de datos
                .build();
        when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.of(existingUser));

        // when
        ResponseDTO responseDTO = userService.registerTest(user);

        // then
        assertNotNull(responseDTO); // Verifica que el objeto responseDTO no sea nulo
        assertEquals("User already exists with this email", responseDTO.getMessage());
    }

    @DisplayName("Test para verificar que un usuario ya existe por nombre de usuario")
    @Test
    void testVerificationByName() throws Exception {
        // given
        UserEntity existingUser = UserEntity.builder()
                .id(22)
                .name("Alexandra")
                .password("Alexandra34756")
                .email("Ale@outlook.com") // Correo electrónico ya existente en la base de datos
                .build();
        when(userRepository.findByName(user.getName())).thenReturn(Optional.of(existingUser));

        // when
        ResponseDTO responseDTO = userService.registerTest(user);

        // then
        assertNotNull(responseDTO); // Verifica que el objeto responseDTO no sea nulo
        assertEquals("User already exists with this username", responseDTO.getMessage());
    }

    @DisplayName("Test para el login de un usuario no registrado")
    @Test
    void testLoginUserNotRegistered() throws Exception {
        //Arrange
        String email = "notregistered@example.com";
        String password = "password123";
        LoginDTO loginDTO = new LoginDTO(email, password);
        when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

        //Act
        HashMap<String, String> result = userService.login(loginDTO);

        //Assert
        assertEquals(1, result.size());
        assertEquals("User not registered!", result
                .get("error"));
    }

    @DisplayName("Test para el login de un usuario con autenticacion exitosa")
    @Test
    void testLoginUserAuthenticationSuccesfully() throws Exception {
        //Arrange
        String email = "Alexandra@outlook.com";
        String password = "Alexandra34756";
        LoginDTO loginDTO = new LoginDTO(email, password);

        when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));

        //Act
        HashMap<String, String> result = userService.login(loginDTO);

        //Assert
        assertEquals(1, result.size());
        assertEquals("Authentication succefully",result.get("success"));
    }

    @DisplayName("Test para el login de un usuario no registrado")
    @Test
    void testLoginUserAuthenticationFailed() throws Exception {
        //Arrange
        String email = "Failed@example.com";
        String password = "password123";
        LoginDTO loginDTO = new LoginDTO(email, password);
        when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

        //Act
        HashMap<String, String> result = userService.login(loginDTO);

        //Assert
        assertEquals(1, result.size());
        assertEquals("Authentication failed", result
                .get("failed"));
    }

}
