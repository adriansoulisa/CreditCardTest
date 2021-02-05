@UnsuccessTransaction
Feature: Credit Card Unsuccess
  I want to unsuccess transaction
@UnsuccessTransaction
  Scenario:  Checkout unsuccessfull Credit Card
    Given I want to checkout the pillow
    When I click checkout in the shooping cart page
    And  I click credit card method and insert the numbers
    Then Verify the transaction will be unsuccessfull