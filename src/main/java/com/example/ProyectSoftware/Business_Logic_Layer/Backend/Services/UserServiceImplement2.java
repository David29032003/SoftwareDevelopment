package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.RepositoryForTheUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Implementación del servicio de usuarios
@Service
public class UserServiceImplement2 implements IUserServiceImplementation {
    //Inyección del repositorio de usuarios
    @Autowired
    RepositoryForTheUsers respositoryForTheUsers;

    //Método para obtener todos los usuarios
    @Override
    public List<UserEntity> findAllTheUsers() {
        //Utilizo el repositorio para buscar y devolver todos los usuarios
        return respositoryForTheUsers.findAll();
    }

    //Método para obtener un usuario por su nombre de usuario
    @Override
    public UserEntity findTheUserByName(String username) {
        //Implementa la lógica para buscar un usuario por su nombre de usuario en el repositorio
        return respositoryForTheUsers.findUserByName(username).orElse(null);

    }

    @Override
    public UserEntity findTheUserById(int id) {
        return respositoryForTheUsers.findById(id).orElse(null);
    }
}
