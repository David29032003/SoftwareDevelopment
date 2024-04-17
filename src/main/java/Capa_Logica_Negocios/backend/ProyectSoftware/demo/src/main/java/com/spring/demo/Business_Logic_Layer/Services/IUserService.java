package com.spring.demo.Business_Logic_Layer.Services;

import com.spring.demo.Business_Logic_Layer.Persistence.Entities.UserEntity;
import com.spring.demo.Business_Logic_Layer.Services.Models.Dtos.LoginDTO;
import com.spring.demo.Business_Logic_Layer.Services.Models.Dtos.ResponseDTO;

import java.util.HashMap;

// Interfaz para el servicio de usuarios
public interface IUserService {
    // Método para realizar el inicio de sesión
    public HashMap<String, String> login(LoginDTO login) throws Exception;
    // Método para registrar un usuario
    ResponseDTO register(UserEntity user) throws Exception;
}
