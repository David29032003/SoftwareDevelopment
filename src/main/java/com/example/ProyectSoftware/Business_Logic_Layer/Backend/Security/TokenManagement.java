package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//corrected
@Component
public class TokenManagement {
    //Mapa para almacenar los tokens activos asociados a cada usuario
    private final Map<Integer, String> ActivatedTokens = new HashMap<>();

    //Método para verificar si un token está activo para un usuario específico
    public boolean TokenActivated(int IdUser, String JWT) {
        String storedToken = ActivatedTokens.get(IdUser);
        return storedToken != null && storedToken.equals(JWT);
    }

    //Método para almacenar el token asociado al usuario en la lista de tokens activos
    public void RegisterForActivatedTokens(int IdUser, String JWT) {
        ActivatedTokens.put(IdUser, JWT);
    }

    //Método para eliminar el token asociado al usuario de la lista de tokens activos
    public void DeleteToken(int IdUser) {
        ActivatedTokens.remove(IdUser);
    }
}
