package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Controllers;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IUserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/user")
public class GetUserByIdClass {

    @Autowired
    IUserServiceImplementation iUserserviceImplementation;

    //Método GET para obtener un usuario por su ID utilizando el ID en la URL
    @GetMapping("/{id}")
    private ResponseEntity<UserEntity> getTheUserById(@PathVariable("id") int id) {
        //Llama al servicio para obtener el usuario por su ID
        UserEntity userEntity = iUserserviceImplementation.findTheUserById(id);
        //Verifica si se encontró el usuario
        if (userEntity != null) {
            //si se encontró, devuelve el usuario y el código de estado OK
            return new ResponseEntity<>(userEntity, HttpStatus.OK);
        } else {
            //Si no se encontró, devuelve un código de estado NOT FOUND
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
