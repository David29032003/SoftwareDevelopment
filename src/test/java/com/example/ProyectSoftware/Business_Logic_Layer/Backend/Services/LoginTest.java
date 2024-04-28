package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Repositories.UserRepository;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.LoginDTO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.HashMap;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class LoginTest {

    @MockBean
    private UserRepository userRepository;

    @Mock
    private UserServiceImpl userService;

    @Given("a registered user with email {string} and password {string}")
    public void aRegisteredUserWithEmailAndPassword(String email, String password) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setEmail(email);
        userEntity.setPassword(password);

        // Mock userRepository para devolver el usuario registrado
        when(userRepository.findByEmail(email)).thenReturn(Optional.of(userEntity));
    }

    @Given("no registered user with email {string}")
    public void noRegisteredUserWithEmail(String email) {
        // Mock userRepository para devolver Optional.empty() para un usuario no registrado
        when(userRepository.findByEmail(email)).thenReturn(Optional.empty());
    }

    @When("the user logs in with email {string} and password {string}")
    public void theUserLogsInWithEmailAndPassword(String email, String password) {
        // Este método no necesita ser implementado explícitamente en este escenario
    }

    @Then("the login should be successful")
    public void theLoginShouldBeSuccessful() throws Exception {
        LoginDTO loginDTO = new LoginDTO("test@example.com", "password");
        HashMap<String, String> result = userService.login(loginDTO);

        assertEquals("Authentication succefully", result.get("success"));
        assertEquals("generatedJWT", result.get("jwt")); // Asegura que se generó un JWT
    }

    @Then("the login should fail")
    public void theLoginShouldFail() throws Exception {
        LoginDTO loginDTO = new LoginDTO("test@example.com", "wrongpassword");
        HashMap<String, String> result = userService.login(loginDTO);

        assertEquals("Authentication failed", result.get("failed"));
    }

    @Then("the login should fail with message {string}")
    public void theLoginShouldFailWithMessage(String errorMessage) throws Exception {
        LoginDTO loginDTO = new LoginDTO("unknown@example.com", "password");
        HashMap<String, String> result = userService.login(loginDTO);

        assertEquals(errorMessage, result.get("error"));
    }
}
