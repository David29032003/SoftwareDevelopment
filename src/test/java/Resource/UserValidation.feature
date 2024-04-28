# new feature
# Tags: optional

Feature: User Validation

    Scenario: Valid user
        Given a user with name "John Doe", email "john@example.com", and password "Passw0rd"
        When the user is validated
        Then the validation result should be successful

    Scenario: User with invalid name
        Given a user with name "Jo", email "john@example.com", and password "Passw0rd"
        When the user is validated
        Then the validation result should have errors

    Scenario: User with invalid email
        Given a user with name "John Doe", email "john.example.com", and password "Passw0rd"
        When the user is validated
        Then the validation result should have errors

    Scenario: User with invalid password
        Given a user with name "John Doe", email "john@example.com", and password "password"
        When the user is validated
        Then the validation result should have errors