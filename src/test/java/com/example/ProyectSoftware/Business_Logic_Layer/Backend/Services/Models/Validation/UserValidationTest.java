package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.ResponseDTO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserValidationTest {
    private UserEntity user;
    private UserValidation userValidation;
    private ResponseDTO response;

    @io.cucumber.java.en.Given("^a user with name \"([^\"]*)\", email \"([^\"]*)\", and password \"([^\"]*)\"$")
    public void aUserWithNameEmailAndPassword(String name, String email, String password) throws Throwable {
        user = new UserEntity();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        userValidation = new UserValidation();
    }

    @When("^the user is validated$")
    public void theUserIsValidated() {
        response = userValidation.validate(user);
    }

    @Then("^the validation result should be successful$")
    public void theValidationResultShouldBeSuccessful() {
        assertEquals(0, response.getNumOfErrors());
        assertEquals("La validación fue exitosa", response.getMessage());
    }

    @Then("^the validation result should have errors$")
    public void theValidationResultShouldHaveErrors() {
        assertNotEquals(0, response.getNumOfErrors());
        assertNotEquals("La validación fue exitosa", response.getMessage());
    }

}
