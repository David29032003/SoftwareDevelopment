package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.TestUserServiceImplement2;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.RepositoryForTheUsers;
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
    private RepositoryForTheUsers repositoryForTheUsers;

    @InjectMocks
    private UserServiceImplement2 userServiceImplement2;

    private List<UserEntity> ListForUsers;

    @BeforeEach
    void setUp() {
        ListForUsers = new ArrayList<>();
        ListForUsers.add(UserEntity.builder()
                .id(1)
                .name("User1")
                .password("password1")
                .email("user1@example.com")
                .build());
        ListForUsers.add(UserEntity.builder()
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
        when(repositoryForTheUsers.findAll()).thenReturn(ListForUsers);

        //Act
        List<UserEntity> foundUsers = userServiceImplement2.findAllTheUsers();

        //Assert
        assertEquals(ListForUsers.size(), foundUsers.size());
        assertEquals(ListForUsers.get(0).getId(), foundUsers.get(0).getId());
        assertEquals(ListForUsers.get(0).getName(), foundUsers.get(0).getName());
        assertEquals(ListForUsers.get(0).getPassword(), foundUsers.get(0).getPassword());
        assertEquals(ListForUsers.get(0).getEmail(), foundUsers.get(0).getEmail());
        assertEquals(ListForUsers.get(1).getId(), foundUsers.get(1).getId());
        assertEquals(ListForUsers.get(1).getName(), foundUsers.get(1).getName());
        assertEquals(ListForUsers.get(1).getPassword(), foundUsers.get(1).getPassword());
        assertEquals(ListForUsers.get(1).getEmail(), foundUsers.get(1).getEmail());
    }

}
