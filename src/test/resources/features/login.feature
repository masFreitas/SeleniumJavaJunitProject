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

  @login @error
  Scenario: Login with invalid user
    Given I am on the login page
    When I fill email and password with invalid user
    Then I see "Your email or password is incorrect!" message

  @login @error2
  Scenario: Login without fill fields
    Given I am on the login page
    When I dont fill the field and click sign in
    Then I continue on the same page
