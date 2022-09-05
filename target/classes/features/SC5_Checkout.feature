@Runner
Feature: Checkout | user can checkout successfully Order

  Background:
    Given user navigate to URL home page
    And user click on signIn Link
    When user enter his email
    And user enter his password
    Then user clicks on sign in button
    Then user logged in successfully
    Given user hover to the Women category
    And user click on the Blouses subCategory
    Given user click on the resulted blouse
    And user add the selected blouse to the cart
    Then Blouse has been added successfully


    Scenario:
      Given User click on proceed to checkout button
      And User click on proceed to checkout button on the summary page
      And User click on proceed to checkout button on the address page
      And user agree to terms of service
      Then User click on proceed to checkout button on the shipping page
      And user select to pay by bank wire
      And User confirm his order in the payment page
      Then Order Confirmation msg appear
