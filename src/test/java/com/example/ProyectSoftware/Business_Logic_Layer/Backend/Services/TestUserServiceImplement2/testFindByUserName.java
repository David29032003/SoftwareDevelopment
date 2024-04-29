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
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class testFindByUserName {
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
    @DisplayName("Test para para encontrar usuario por el nombre de usuario")
    void testFindByUserName(){
        //Arrange
        String username = "User1";
        UserEntity user = userList.get(0);
        when(userRepository.findByName(username)).thenReturn(Optional.of(user));

        //Act
        UserEntity foundUser = userService.findUserByName(username);

        //Assert
        assertEquals(user.getId(), foundUser.getId());
        assertEquals(user.getName(), foundUser.getName());
        assertEquals(user.getPassword(), foundUser.getPassword());
        assertEquals(user.getEmail(), foundUser.getEmail());

    }
}
