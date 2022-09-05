@Runner
Feature: Registration | user should be able to sign up with new account

  Scenario: user could sign up with valid credentials

    Given user navigate to home page
    And user click on sign in Link
    When user enter his email with valid email format
    And user click on create account
    And user fills his personal data with valid data
    And user fills his address with valid data
    Then user click on register button
    And success message is displayed
