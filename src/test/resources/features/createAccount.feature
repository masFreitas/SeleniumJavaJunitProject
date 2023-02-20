@createAccount
Feature: create account
  Me as a user
  I want to create an account
  To use all the website features

  @createAccount @success @teste
  Scenario: Create new user with success
    Given I am on the login page
    When I fill the Name and Email field
    And click on Signup button
    And I fill the Account Information form
    And click on Create an Account button
    Then I see the new account message "Account Created!"
