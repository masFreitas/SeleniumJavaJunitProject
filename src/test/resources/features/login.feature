@login
Feature: Login
  Me as a user
  I want to login into the application
  To use all the website features

  @login @success
  Scenario: Login with success
    Given I am on the login page
    When I fill email and password
    Then I login into the application
