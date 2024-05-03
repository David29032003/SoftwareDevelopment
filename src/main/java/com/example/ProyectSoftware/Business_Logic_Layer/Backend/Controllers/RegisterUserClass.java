package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Controllers;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IUserService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOResponse;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.ValidationForTheUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

// Controlador REST para las operaciones relacionadas con usuarios
//corrected
@RestController
@RequestMapping("/user")
public class RegisterUserClass {
    // Inyección del servicio de usuarios
    @Autowired
    IUserService userService;

    // Método para registrar un usuario
    @PostMapping("/register")
    public ResponseEntity<DTOResponse> register(@RequestBody UserEntity user) throws Exception {
        // Validar el usuario utilizando UserValidation
        DTOResponse ResponseValidation = new ValidationForTheUser().validate(user);
        if (ResponseValidation.getNumOfErrors() > 0) {
            // Si hay errores de validación, devuelve una respuesta con el código de estado BadRequest
            return new ResponseEntity<>(ResponseValidation, HttpStatus.BAD_REQUEST);
        } else {
            // Si la validación es exitosa, llama al servicio para registrar al usuario
            DTOResponse ResponseRegister = userService.RegisterUser(user);
            // Devuelve la respuesta del servicio con el código de estado correspondiente
            return new ResponseEntity<>(ResponseRegister, HttpStatus.CREATED);
        }
    }
}
