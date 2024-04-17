package com.spring.demo.Business_Logic_Layer.Services.Impl;

import com.spring.demo.Business_Logic_Layer.Persistence.Entities.UserEntity;
import com.spring.demo.Business_Logic_Layer.Persistence.Repositories.UserRepository;
import com.spring.demo.Business_Logic_Layer.Services.IUserserviceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Implementación del servicio de usuarios
@Service
public class UserServiceImplement implements IUserserviceImplement {
    // Inyección del repositorio de usuarios
    @Autowired
    UserRepository userRepository;

    // Método para obtener todos los usuarios
    @Override
    public List<UserEntity> findAllUsers() {
        // Utiliza el repositorio para buscar y devolver todos los usuarios
        return userRepository.findAll();
    }

    // Método para obtener un usuario por su nombre de usuario
    @Override
    public UserEntity findUserByName(String username) {
        // Implementa la lógica para buscar un usuario por su nombre de usuario en el repositorio
        // Por ejemplo:
        return userRepository.findByName(username).orElse(null);

    }
}
