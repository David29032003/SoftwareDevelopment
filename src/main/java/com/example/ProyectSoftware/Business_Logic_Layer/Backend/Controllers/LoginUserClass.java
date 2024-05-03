package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Controllers;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IUserService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

// Controlador REST para las operaciones relacionadas con usuarios
//corrected
@RestController
@RequestMapping("/user")
public class LoginUserClass {
    // Inyección del servicio de usuarios
    @Autowired
    IUserService userService;

    // Método para realizar el inicio de sesión de un usuario
    @PostMapping("/login")
    public ResponseEntity<HashMap<String, String>> login(@RequestBody DTOLogin RequestLogin) throws Exception {
        System.out.println("Intento de login con email: " + RequestLogin.getEmail());
        // Llama al servicio para realizar el inicio de sesión y obtiene el resultado
        HashMap<String, String> Login = userService.LoginUser(RequestLogin);
        // Verifica si se generó un token de autenticación
        if(Login.containsKey("jwt")){
            // Si se generó un token, devuelve la respuesta con el token y el código de estado OK
            return new ResponseEntity<>(Login, HttpStatus.OK);
        }else{
            // Si no se generó un token, devuelve la respuesta sin el token y el código de estado UNAUTHORIZED
            return new ResponseEntity<>(Login, HttpStatus.UNAUTHORIZED);
        }
    }

}
