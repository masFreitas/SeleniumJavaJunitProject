@createAccount
Feature: create account
  Me as a user
  I want to create an account
  To use all the website features

  @createAccountWithSuccess
  Scenario: Create new user with success
    Given I am on the login page
    When access the user registration
    And I fill the registration form
    And click on Create an Account button
    Then I see the new account message
    And I access the My Account page