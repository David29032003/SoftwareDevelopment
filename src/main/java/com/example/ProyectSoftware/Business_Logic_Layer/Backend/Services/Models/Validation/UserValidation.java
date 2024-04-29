package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.ResponseDTO;
import org.springframework.stereotype.Service;
/**
 * Clase que realiza la validación de los campos de un objeto UserEntity.
 */
public class UserValidation {
    /**
     * Método para validar un objeto UserEntity.
     */
    public ResponseDTO validate(UserEntity user){
        // Crear un nuevo objeto ResponseDTO para almacenar el resultado de la validación
        ResponseDTO response = new ResponseDTO();

        // Inicializar el número de errores en 0
        response.setNumOfErrors(0);

        // Validar el campo nombre
        if(user.getName()==null ||
                user.getName().length()<3 ||
                user.getName().length()>15
        ){
            response.setNumOfErrors(response.getNumOfErrors()+1);
            response.setMessage("El campo nombre no puede ser nulo, tambien tiene que tener entre 3 y 15 caracteres");
        }

        // Validar el campo email
        if(user.getEmail() == null ||
                !user.getEmail().matches("^[\\w~\\.]+@([\\w~]+\\.)+[\\w~]{2,4}$")){
            response.setNumOfErrors(response.getNumOfErrors()+1);
            response.setMessage("El campo email no es valido.");
        }

        // Validar el campo contraseña
        if(user.getPassword() == null ||
                !user.getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,16}$")){
            response.setNumOfErrors(response.getNumOfErrors()+1);
            response.setMessage("La contrasena debe tener entre 8 y 16 caracteres, al menos un numero, una minuscula y una mayuscula.");
        }

        // Retornar el objeto ResponseDTO con el resultado de la validación
        if (response.getNumOfErrors() == 0) {
            response.setMessage("La validación fue exitosa");
        }

        // Retornar el objeto ResponseDTO con el resultado de la validación
        return response;
    }
}
