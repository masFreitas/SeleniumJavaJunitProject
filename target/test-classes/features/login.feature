@login
Feature: Login
  Me as a user
  I want to login into the application
  To use all the website features

  @login @success @teste
  Scenario: Login with success
    Given I am on the login page
    When I fill email and password
    Then I login into the application

  @login @error
  Scenario: Login with invalid user
    Given I am on the login page
    When I fill email and password with invalid user
    Then I see "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later." message

  @login @error
  Scenario: Login without fill fields
    Given I am on the login page
    When I dont fill the field and click sign in
    Then I see "A login and a password are required." message
