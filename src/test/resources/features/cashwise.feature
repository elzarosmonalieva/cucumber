Feature: Sign up functionality testing
@sign-up
Scenario: user signs up with correct credentials
    Given the user is on sign up page
    Then user clicks on sign up button
    Then user fills up all the required fields
    Then user has to verify if account is created successfully
