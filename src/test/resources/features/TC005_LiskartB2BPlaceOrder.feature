#Author:Shahbaz





Feature: Place An Order
  
@Liskart_B2B_PlaceOrder
Scenario: Place An Order
    Given Login to Liskart
    Then Find the Product
    And Click on buy now
    Then Click on Incement button to increase the amount of product
    Then Click on proceed to checkout
    Then Select a payment method
    And Place the order
    Then Select how do you pay
    Then Select a bank to do your payment
    Then Click on final pay button to pay
    And  Click on success
    Then View the product