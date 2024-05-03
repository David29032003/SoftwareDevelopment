package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;



import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOLogin;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOResponse;

import java.util.HashMap;

//Interfaz para el servicio de usuarios
//corrected
public interface IUserService {
    //Método para registrar un usuario
    DTOResponse RegisterUser(UserEntity userEntity) throws Exception;
    //Método para realizar el inicio de sesión
    public HashMap<String, String> LoginUser(DTOLogin LoginUser) throws Exception;

    public DTOResponse registerTest(UserEntity userEntity) throws Exception;
}
