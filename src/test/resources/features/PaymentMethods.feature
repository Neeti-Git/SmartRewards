Feature: Verify Payment Method

Background: Verify user able to Signin to application and verify App version
    Given User login to application and verify home page
    
    @paymentmethods @regression
    Scenario: Verify user can add a credit card
    Then User verify home page
    And User click Hamburger menu
    Then User click on Payment Methods
    And User remove all the credit cards
    Then User click on Add a new Payment Method
    Then User click on Add button after Credit card
    Then User enters the credit card details
    And User click on confirm card
    And User verifies card is added successfully message
    And Use verifies Add new payment method screen
    Then User press mobile back button
    Then User verify home page
    And User click Hamburger menu
    Then User click on Payment Methods
    And user verifies card is present in Manage Payment
    
    @paymentmethods @regression
    Scenario: Verify a user can add maximum five credit cards only
    Then User verify home page
    And User click Hamburger menu
    Then User click on Payment Methods
    And User remove all the credit cards
    Then User add 5 credit cards and verify all five are added succesfully.
    Then User add sixth credit card
    And User verify card is not added.
    
     @paymentmethods @regression
    Scenario: Verify a duplicate credit card is not added
    Then User verify home page
    And User click Hamburger menu
    Then User click on Payment Methods
    And User remove all the credit cards
    Then User click on Add a new Payment Method
    Then User click on Add button after Credit card
    Then User enters the credit card details
    And User click on confirm card
    And User verifies card is added successfully message
    And Use verifies Add new payment method screen
    Then User press mobile back button
    Then User verify home page
    And User click Hamburger menu
    Then User click on Payment Methods
    And user verifies card is present in Manage Payment
    Then User click on Add a new Payment Method
    Then User click on Add button after Credit card
    Then User enters the credit card details
    And User click on confirm card
    And User verifies card is added successfully message
    And Use verifies Add new payment method screen
    Then User press mobile back button
    Then User verify home page
    And User click Hamburger menu
    Then User click on Payment Methods
    And user verify duplicate card is not added
    
    
    
    