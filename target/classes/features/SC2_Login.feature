@Runner
Feature: Login | user could be able to log in with valid email and password

  Scenario: user could log in with valid credentials

    Given user navigate to URL home page
    And user click on signIn Link
    When user enter his email
    And user enter his password
    Then user clicks on sign in button
   Then user logged in successfully