package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestUserServiceImplement2;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.UserRepository;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.UserServiceImplement2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class testFindAllUsers {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImplement2 userService;

    private List<UserEntity> userList;

    @BeforeEach
    void setUp() {
        userList = new ArrayList<>();
        userList.add(UserEntity.builder()
                .id(1)
                .name("User1")
                .password("password1")
                .email("user1@example.com")
                .build());
        userList.add(UserEntity.builder()
                .id(2)
                .name("User2")
                .password("password2")
                .email("user2@example.com")
                .build());
    }

    @Test
    @DisplayName("Test para encontrar todos los usuarios")
    void testFindAllUsers() {
        //Arrange
        when(userRepository.findAll()).thenReturn(userList);

        //Act
        List<UserEntity> foundUsers = userService.findAllUsers();

        //Assert
        assertEquals(userList.size(), foundUsers.size());
        assertEquals(userList.get(0).getId(), foundUsers.get(0).getId());
        assertEquals(userList.get(0).getName(), foundUsers.get(0).getName());
        assertEquals(userList.get(0).getPassword(), foundUsers.get(0).getPassword());
        assertEquals(userList.get(0).getEmail(), foundUsers.get(0).getEmail());
        assertEquals(userList.get(1).getId(), foundUsers.get(1).getId());
        assertEquals(userList.get(1).getName(), foundUsers.get(1).getName());
        assertEquals(userList.get(1).getPassword(), foundUsers.get(1).getPassword());
        assertEquals(userList.get(1).getEmail(), foundUsers.get(1).getEmail());
    }

}
