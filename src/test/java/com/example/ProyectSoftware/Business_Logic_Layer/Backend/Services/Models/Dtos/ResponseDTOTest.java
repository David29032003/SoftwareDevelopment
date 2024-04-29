package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponseDTOTest {

    @Test
    void testResponseDTO() {
        //Arrange
        int numOfErrors = 2;
        String message = "Error happened";

        //Act
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setNumOfErrors(numOfErrors);
        responseDTO.setMessage(message);

        //Assert
        assertEquals(numOfErrors, responseDTO.getNumOfErrors());
        assertEquals(message, responseDTO.getMessage());
    }
}
