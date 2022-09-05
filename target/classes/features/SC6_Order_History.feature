@Runner
Feature: Order History Page | Validate order was placed from order history page

  Background:
    Given user navigate to URL home page
    And user click on signIn Link
    When user enter his email
    And user enter his password
    Then user clicks on sign in button
    Then user logged in successfully

    Scenario: Validate order was placed from order history page
      Given User click on the orders history and details button
      And User navigate to orders history and details page
      Then Order History is displayed
