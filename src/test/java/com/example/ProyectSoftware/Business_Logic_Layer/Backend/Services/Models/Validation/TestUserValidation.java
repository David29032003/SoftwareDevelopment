package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Validation;

import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities.UserEntity;
import com.example.ProyectSoftware.Business_Logic_Layer.Backend.Services.Models.Dtos.DTOResponse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestUserValidation {
    private UserEntity userEntity;
    private ValidationForTheUser validationForTheUser;
    private DTOResponse dtoResponse;

    @io.cucumber.java.en.Given("^a user with name \"([^\"]*)\", email \"([^\"]*)\", and password \"([^\"]*)\"$")
    public void aUserWithNameEmailAndPassword(String name, String email, String password) throws Throwable {
        userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        validationForTheUser = new ValidationForTheUser();
    }

    @When("^the user is validated$")
    public void theUserIsValidated() {
        dtoResponse = validationForTheUser.validate(userEntity);
    }

    @Then("^the validation result should be successful$")
    public void theValidationResultShouldBeSuccessful() {
        assertEquals(0, dtoResponse.getNumOfErrors());
        assertEquals("Validation was successful", dtoResponse.getMessage());
    }

    @Then("^the validation result should have errors$")
    public void theValidationResultShouldHaveErrors() {
        assertNotEquals(0, dtoResponse.getNumOfErrors());
        assertNotEquals("Validation was successful", dtoResponse.getMessage());
    }

}
