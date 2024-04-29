package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserEntityTest {

    @Test
    void testUserEntity() {
        //Arrange
        Integer id = 1;
        String name = "John";
        String password = "password123";
        String email = "john@example.com";

        //Act
        UserEntity userEntity = UserEntity.builder()
                .id(id)
                .name(name)
                .password(password)
                .email(email)
                .build();

        //Assert
        assertNotNull(userEntity);
        assertEquals(id, userEntity.getId());
        assertEquals(name, userEntity.getName());
        assertEquals(password, userEntity.getPassword());
        assertEquals(email, userEntity.getEmail());
    }
}
