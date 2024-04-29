package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;

import java.util.List;

//Interfaz para el servicio de usuarios
public interface IUserserviceImplement {
    //Método para obtener todos los usuarios
    public List<UserEntity> findAllUsers();

    //Método para obtener un usuario por su nombre de usuario
    UserEntity findUserByName(String username);

    UserEntity findUserById(int id);
}