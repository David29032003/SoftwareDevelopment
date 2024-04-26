package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Security;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TokenManager {
    // Mapa para almacenar los tokens activos asociados a cada usuario
    private final Map<Integer, String> activeTokens = new HashMap<>();

    // Método para almacenar el token asociado al usuario en la lista de tokens activos
    public void storeTokenInActiveTokens(int userId, String jwt) {
        activeTokens.put(userId, jwt);
    }

    // Método para eliminar el token asociado al usuario de la lista de tokens activos
    public void removeTokenFromActiveTokens(int userId) {
        activeTokens.remove(userId);
    }

    // Método para verificar si un token está activo para un usuario específico
    public boolean isTokenActive(int userId, String jwt) {
        String storedToken = activeTokens.get(userId);
        return storedToken != null && storedToken.equals(jwt);
    }
}
