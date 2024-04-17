package com.spring.demo.Business_Logic_Layer.Controllers;

import com.spring.demo.Business_Logic_Layer.Persistence.Entities.UserEntity;
import com.spring.demo.Business_Logic_Layer.Services.IUserserviceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Definición de la clase controladora
@RestController
@RequestMapping("/user")
public class Usercontroller {

    // Inyección del servicio de usuarios
    @Autowired
    IUserserviceImplement iUserservice;

    // Manejo de la solicitud GET para obtener todos los usuarios
    @GetMapping("/find-all")
    private ResponseEntity<List<UserEntity>> getAllUsers(){
        // Devuelve una respuesta con la lista de usuarios y código de estado OK
        return new ResponseEntity<>(iUserservice.findAllUsers(), HttpStatus.OK);
    }

    // Método GET para obtener un usuario por su ID utilizando el nombre de usuario en la URL
    @GetMapping("/{username}")
    private ResponseEntity<UserEntity> getUserById(@PathVariable("username") String username) {
        // Llama al servicio para obtener el usuario por su ID
        UserEntity user = iUserservice.findUserByName(username);
        // Verifica si se encontró el usuario
        if (user != null) {
            // Si se encontró, devuelve el usuario y el código de estado OK
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            // Si no se encontró, devuelve un código de estado NOT FOUND
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
