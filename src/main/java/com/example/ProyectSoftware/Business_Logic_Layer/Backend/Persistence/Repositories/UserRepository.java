package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

//Esta interfaz define un repositorio para la entidad UserEntity y
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    //Declaro una consulta nativa para buscar un usuario por su correo electronico.
    @Query(value = "SELECT * FROM users WHERE email= :email", nativeQuery = true)
    Optional<UserEntity> findByEmail(String email);

    //Declaro una consulta nativa para buscar un usuario por su nombre de usuario
    @Query(value = "SELECT * FROM users WHERE name= :username", nativeQuery = true)
    Optional<UserEntity> findByName(String username);

}
