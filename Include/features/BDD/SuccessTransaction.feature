@SuccessTransaction
Feature: Credit Card Success
  I want to success transaction

  @SuccessTransaction
  Scenario: Checkout CreditCard
    Given I want to checkout pillow
    When I click checkout in the shooping cart
    And  I click credit card method and insert the number
    Then Verify the transaction will be successfull
    
    
  
    