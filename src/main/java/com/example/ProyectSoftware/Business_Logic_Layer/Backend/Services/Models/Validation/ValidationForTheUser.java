package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOResponse;

//Clase que realiza la validación de los campos de un objeto UserEntity.
//Corrected
public class ValidationForTheUser {
    //Método para validar un objeto UserEntity.
    public DTOResponse validate(UserEntity userEntity){
        //Crear un nuevo objeto ResponseDTO para almacenar el resultado de la validación
        DTOResponse dtoResponse = new DTOResponse();

        //Inicializar el número de errores en 0
        dtoResponse.setNumOfErrors(0);

        //Validar el campo email
        if(userEntity.getEmail() == null ||
                !userEntity.getEmail().matches("^[\\w~\\.]+@([\\w~]+\\.)+[\\w~]{2,4}$")){
            dtoResponse.setNumOfErrors(dtoResponse.getNumOfErrors()+1);
            dtoResponse.setMessage("The email field is not valid.");
        }

        //Validar el campo contraseña
        if(userEntity.getPassword() == null ||
                !userEntity.getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,16}$")){
            dtoResponse.setNumOfErrors(dtoResponse.getNumOfErrors()+1);
            dtoResponse.setMessage("The password must be between 8 and 16 characters, at least one number, one lowercase and one uppercase.");
        }

        //Validar el campo nombre
        if(userEntity.getName()==null ||
                userEntity.getName().length()<8 ||
                userEntity.getName().length()>15
        ){
            dtoResponse.setNumOfErrors(dtoResponse.getNumOfErrors()+1);
            dtoResponse.setMessage("The name field cannot be null, it must also be between 8 and 15 characters");
        }

        //Retornar el objeto DTOResponse con el resultado de la validación
        if (dtoResponse.getNumOfErrors() == 0) {
            dtoResponse.setMessage("Validation was successful");
        }

        //Retornar el objeto ResponseDTO con el resultado de la validación
        return dtoResponse;
    }
}
