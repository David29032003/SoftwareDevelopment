package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Controllers;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IUserService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.LoginDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.ResponseDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

// Controlador REST para las operaciones relacionadas con usuarios
@RestController
@RequestMapping("/user")
public class UserControllers {
    // Inyección del servicio de usuarios
    @Autowired
    IUserService userService;

    // Método para registrar un usuario
    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> register(@RequestBody UserEntity user) throws Exception {
        // Validar el usuario utilizando UserValidation
        ResponseDTO validationResponse = new UserValidation().validate(user);
        if (validationResponse.getNumOfErrors() > 0) {
            // Si hay errores de validación, devuelve una respuesta con el código de estado BadRequest
            return new ResponseEntity<>(validationResponse, HttpStatus.BAD_REQUEST);
        } else {
            // Si la validación es exitosa, llama al servicio para registrar al usuario
            ResponseDTO registerResponse = userService.register(user);
            // Devuelve la respuesta del servicio con el código de estado correspondiente
            return new ResponseEntity<>(registerResponse, HttpStatus.CREATED);
        }
    }

    // Método para realizar el inicio de sesión de un usuario
    @PostMapping("/login")
    public ResponseEntity<HashMap<String, String>> login(@RequestBody LoginDTO loginRequest) throws Exception {
        System.out.println("Intento de login con email: " + loginRequest.getEmail());
        // Llama al servicio para realizar el inicio de sesión y obtiene el resultado
        HashMap<String, String> login = userService.login(loginRequest);
        // Verifica si se generó un token de autenticación
        if(login.containsKey("jwt")){
            // Si se generó un token, devuelve la respuesta con el token y el código de estado OK
            System.out.println("ieesss");
            return new ResponseEntity<>(login, HttpStatus.OK);
        }else{
            // Si no se generó un token, devuelve la respuesta sin el token y el código de estado UNAUTHORIZED
            System.out.println("naaa");
            return new ResponseEntity<>(login, HttpStatus.UNAUTHORIZED);

        }
    }
}
