package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;

import java.util.List;

//Interfaz para el servicio de usuarios
//corrected
public interface IUserServiceImplementation {
    //Método para obtener todos los usuarios
    public List<UserEntity> findAllTheUsers();

    //Método para obtener un usuario por su nombre de usuario
    UserEntity findTheUserByName(String username);

    UserEntity findTheUserById(int id);
}