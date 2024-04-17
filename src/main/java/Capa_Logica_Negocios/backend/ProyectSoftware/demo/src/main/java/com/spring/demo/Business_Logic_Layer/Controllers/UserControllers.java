package com.spring.demo.Business_Logic_Layer.Controllers;

import com.spring.demo.Business_Logic_Layer.Persistence.Entities.UserEntity;
import com.spring.demo.Business_Logic_Layer.Services.IUserService;
import com.spring.demo.Business_Logic_Layer.Services.Models.Dtos.LoginDTO;
import com.spring.demo.Business_Logic_Layer.Services.Models.Dtos.ResponseDTO;
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
    private ResponseEntity<ResponseDTO> register(@RequestBody UserEntity user) throws Exception {
        return new ResponseEntity<>(userService.register(user), HttpStatus.CREATED);
    }

    // Método para realizar el inicio de sesión de un usuario
    @PostMapping("/login")
    private ResponseEntity<HashMap<String, String>> login(@RequestBody LoginDTO loginRequest) throws Exception {
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
