@Runner
Feature: SubCategory| user can select an item from a SubCategory


  Background:
    Given user navigate to URL home page
    And user click on signIn Link
    When user enter his email
    And user enter his password
    Then user clicks on sign in button
    Then user logged in successfully

    Scenario: user can select an item from a SubCategory
      Given user hover to the Women category
      And user click on the Blouses subCategory
      Then user go to the Blouses page
