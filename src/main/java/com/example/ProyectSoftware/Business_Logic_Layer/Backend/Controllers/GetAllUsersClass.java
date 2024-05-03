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
public class GetAllUsersClass {
    //Inyección del servicio de usuarios
    @Autowired
    IUserServiceImplementation iUserserviceImplementation;

    //Manejo de la solicitud GET para obtener todos los usuarios
    @GetMapping("/find-all")
    private ResponseEntity<List<UserEntity>> getAllTheUsers(){
        // Devuelve una respuesta con la lista de usuarios y código de estado OK
        return new ResponseEntity<>(iUserserviceImplementation.findAllTheUsers(), HttpStatus.OK);
    }
}
