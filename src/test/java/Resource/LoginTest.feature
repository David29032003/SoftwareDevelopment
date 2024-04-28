Feature: User Login

    Scenario: User login with valid credentials
        Given a registered user with email "Jha@outlook.com" and password "Jhan34756"
        When the user logs in with email "Jha@outlook.com" and password "Jhan34756"
        Then the login should be successful

    Scenario: User login with incorrect password
        Given a registered user with email "Jha@outlook.com" and password "Jhan34756"
        When the user logs in with email "Jha@outlook.com" and password "wrongpassword"
        Then the login should fail

    Scenario: User login with unregistered email
        Given no registered user with email "unknown@example.com"
        When the user logs in with email "unknown@example.com" and password "Jhan34756"
        Then the login should fail with message "User not registered!"
