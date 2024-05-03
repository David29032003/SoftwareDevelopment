package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestResponseDTO {

    @Test
    void testResponseDTO() {
        //Arrange
        int numOfErrors = 2;
        String message = "Error happened";

        //Act
        DTOResponse dtoResponse = new DTOResponse();
        dtoResponse.setNumOfErrors(numOfErrors);
        dtoResponse.setMessage(message);

        //Assert
        assertEquals(numOfErrors, dtoResponse.getNumOfErrors());
        assertEquals(message, dtoResponse.getMessage());
    }
}
