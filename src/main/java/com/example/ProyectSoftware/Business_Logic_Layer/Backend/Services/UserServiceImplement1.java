package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security.TokenManagement;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOLogin;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOResponse;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.ValidationForTheUser;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.RepositoryForTheUsers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.HashMap;

//corrected
@Service
public class UserServiceImplement1 implements IUserService {

    @Autowired
    private RepositoryForTheUsers respositoryForTheUsers;

    @Autowired
    private IJWTUtilityService ijwtUtilityService;

    @Autowired
    private ValidationForTheUser validationForTheUser;

    @Autowired
    private TokenManagement tokenManagement;

    @Override
    public HashMap<String, String> LoginUser(DTOLogin dtoLogin) throws Exception {
        try {
            HashMap<String, String> JWT = new HashMap<>();
            Optional<UserEntity> userEntity = respositoryForTheUsers.findUserByEmail(dtoLogin.getEmail());

            if (userEntity.isEmpty()) {
                JWT.put("error", "User not registered!");
                return JWT;
            }

            //Verifico la contraseña
            if (verifyPassword(dtoLogin.getPassword(), userEntity.get().getPassword())) {
                JWT.put("jwt", ijwtUtilityService.GenerateTheJWT(userEntity.get().getId()));
                JWT.put("success", "Authentication succefully");
                //Almaceno el token asociado al usuario en la lista de tokens activos
                tokenManagement.RegisterForActivatedTokens(userEntity.get().getId(), JWT.get("jwt"));

            } else {
                JWT.put("failed", "Authentication failed");
            }

            return JWT;
        } catch (Exception e) {
            throw new Exception("Error during user registration: " + e.getMessage());
        }
    }

    public DTOResponse RegisterUser(UserEntity userEntity) throws Exception{
        try {
            DTOResponse dtoResponse = validationForTheUser.validate(userEntity);

            //Verifico si hay errores de validación
            if (dtoResponse.getNumOfErrors() > 0) {
                return dtoResponse;
            }

            //Verifico si el usuario ya existe en la base de datos por su nombre de usuario
            Optional<UserEntity> existingUserByUsername = respositoryForTheUsers.findUserByName(userEntity.getName());
            if (existingUserByUsername.isPresent()) {
                dtoResponse.setNumOfErrors(1);
                dtoResponse.setMessage("User already exists with this username");
                return dtoResponse;
            }

            //Verifico si el usuario ya existe en la base de datos por su correo electrónico
            Optional<UserEntity> existingUser = respositoryForTheUsers.findUserByEmail(userEntity.getEmail());
            if (existingUser.isPresent()) {
                dtoResponse.setNumOfErrors(1);
                dtoResponse.setMessage("User already exists with this email");
                return dtoResponse;
            }

            //Codifico la contraseña antes de guardarla en la base de datos
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
            userEntity.setPassword(encoder.encode(userEntity.getPassword()));
            respositoryForTheUsers.save(userEntity);
            dtoResponse.setMessage("User created successfully");

            return dtoResponse;
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }

    public boolean verifyPassword(String enteredPassword, String storedPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(enteredPassword, storedPassword);
    }

    public DTOResponse registerTest(UserEntity userEntity) throws Exception {
        try {
            //Inicializo ResponseDTO
            DTOResponse dtoResponse = new DTOResponse();

            //Verifico si hay errores de validación
            if (dtoResponse.getNumOfErrors() > 0) {
                return dtoResponse;
            }

            //Verifico si el usuario ya existe en la base de datos por su nombre de usuario
            Optional<UserEntity> existingUserByUsername = respositoryForTheUsers.findUserByName(userEntity.getName());
            if (existingUserByUsername.isPresent()) {
                dtoResponse.setNumOfErrors(1);
                dtoResponse.setMessage("User already exists with this username");
                return dtoResponse;
            }

            //Verifico si el usuario ya existe en la base de datos por su correo electrónico
            Optional<UserEntity> existingUser = respositoryForTheUsers.findUserByEmail(userEntity.getEmail());
            if (existingUser.isPresent()) {
                dtoResponse.setNumOfErrors(1);
                dtoResponse.setMessage("User already exists with this email");
                return dtoResponse;
            }

            //Codifico la contraseña antes de guardarla en la base de datos
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
            userEntity.setPassword(encoder.encode(userEntity.getPassword()));
            respositoryForTheUsers.save(userEntity);
            dtoResponse.setMessage("User created successfully");

            return dtoResponse;
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }
}
