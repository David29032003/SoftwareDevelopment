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
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class testFindByUserName {
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
    @DisplayName("Test para para encontrar usuario por el nombre de usuario")
    void testFindByUserName(){
        //Arrange
        String username = "User1";
        UserEntity userEntity = ListForUsers.get(0);
        when(repositoryForTheUsers.findUserByName(username)).thenReturn(Optional.of(userEntity));

        //Act
        UserEntity foundUser = userServiceImplement2.findTheUserByName(username);

        //Assert
        assertEquals(userEntity.getId(), foundUser.getId());
        assertEquals(userEntity.getName(), foundUser.getName());
        assertEquals(userEntity.getPassword(), foundUser.getPassword());
        assertEquals(userEntity.getEmail(), foundUser.getEmail());

    }
}
