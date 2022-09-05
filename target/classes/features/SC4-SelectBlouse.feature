@Runner
Feature: Select resulted Blouse| user could select blouse from the resulted section


  Background:
    Given user navigate to URL home page
    And user click on signIn Link
    When user enter his email
    And user enter his password
    Then user clicks on sign in button
    Then user logged in successfully
    Given user hover to the Women category
    And user click on the Blouses subCategory
  Scenario: user could select blouse from the resulted section
    Given user click on the resulted blouse
    And user add the selected blouse to the cart
    Then Blouse has been added successfully
