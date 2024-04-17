package com.spring.demo.Business_Logic_Layer.Services;

import com.spring.demo.Business_Logic_Layer.Persistence.Entities.UserEntity;

import java.util.List;

// Interfaz para el servicio de usuarios
public interface IUserserviceImplement {
    // Método para obtener todos los usuarios
    public List<UserEntity> findAllUsers();

    // Método para obtener un usuario por su nombre de usuario
    UserEntity findUserByName(String username);
}
