package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;



import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.LoginDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.ResponseDTO;

import java.util.HashMap;

//Interfaz para el servicio de usuarios
public interface IUserService {
    //Método para realizar el inicio de sesión
    public HashMap<String, String> login(LoginDTO login) throws Exception;
    //Método para registrar un usuario
    ResponseDTO register(UserEntity user) throws Exception;

    public ResponseDTO registerTest(UserEntity user) throws Exception;
}
