package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Impl;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IUserService;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.LoginDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.ResponseDTO;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation.UserValidation;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.UserRepository;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.IJWTUtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IJWTUtilityService jwtUtilityService;

    @Autowired
    private UserValidation userValidation;

    @Override
    public HashMap<String, String> login(LoginDTO login) throws Exception {
        try {
            HashMap<String, String> jwt = new HashMap<>();
            Optional<UserEntity> user = userRepository.findByEmail(login.getEmail());

            if (user.isEmpty()) {
                jwt.put("error", "User not registered!");
                return jwt;
            }

            // Verificar la contraseña
            if (verifyPassword(login.getPassword(), user.get().getPassword())) {
                jwt.put("jwt", jwtUtilityService.generateJWT(user.get().getId()));
            } else {
                jwt.put("error", "Authentication failed");
            }

            return jwt;
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }

    public ResponseDTO register(UserEntity user) throws Exception{
        try {
            ResponseDTO response = userValidation.validate(user);

            if (response.getNumOfErrors() > 0) {
                return response;
            }

            // Verificar si el usuario ya existe en la base de datos por su correo electrónico
            Optional<UserEntity> existingUser = userRepository.findByEmail(user.getEmail());
            if (existingUser.isPresent()) {
                response.setNumOfErrors(1);
                response.setMessage("User already exists");
                return response;
            }

            // Verificar si el usuario ya existe en la base de datos por su nombre de usuario
            Optional<UserEntity> existingUserByUsername = userRepository.findByName(user.getName());
            if (existingUserByUsername.isPresent()) {
                response.setNumOfErrors(1);
                response.setMessage("User already exists with this username");
                return response;
            }

            // Codificar la contraseña antes de guardarla en la base de datos
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
            user.setPassword(encoder.encode(user.getPassword()));
            userRepository.save(user);
            response.setMessage("User created successfully");

            return response;
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }

    private boolean verifyPassword(String enteredPassword, String storedPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(enteredPassword, storedPassword);
    }
}
