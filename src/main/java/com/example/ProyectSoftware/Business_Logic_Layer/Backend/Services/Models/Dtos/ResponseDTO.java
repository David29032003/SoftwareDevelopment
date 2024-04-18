package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos;

/**
 * Clase que representa un DTO (Objeto de Transferencia de Datos) para la respuesta de la API.
 * Contiene el número de errores y un mensaje descriptivo.
 */
public class ResponseDTO {
    // Número de errores en la respuesta
    private int numOfErrors;
    // Mensaje descriptivo de la respuesta
    private String message;

    //metodos getters y setters para los atributos numOfErrors y message
    public int getNumOfErrors() {
        return numOfErrors;
    }

    public void setNumOfErrors(int numOfErrors) {
        this.numOfErrors = numOfErrors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
