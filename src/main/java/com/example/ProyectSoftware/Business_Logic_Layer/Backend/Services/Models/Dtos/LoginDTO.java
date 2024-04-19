package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos;

/**
 * Clase que representa un DTO (Objeto de Transferencia de Datos) para el login de usuario.
 * Contiene los campos de correo electrónico y contraseña.
 */
public class LoginDTO {

    // Campo para almacenar el correo electrónico del usuario
    private String email;
    // Campo para almacenar la contraseña del usuario
    private String password;

    //metodos getters y setters para los atributos email y password
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}