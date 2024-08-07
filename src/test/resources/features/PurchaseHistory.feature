@hamburgerMenu @PurchaseHistory @demoNeeti
Feature: Verify PurchaseHistory

  Background: Verify user able to Signin to application and verify App version
    Given User login to application and verify home page

  @purchaseHistory @regression
  Scenario: Verify user completes a Fuel Transaction and receipt Entry in purchase history
    Then User verify home page
    Then User click on Fuel up
    Then User Allow location access
    Then User search store number
    Then User tap on store
    And User close the error message
    Then User tap on pump one
    Then User Enter the pin
    Then User tap on Confirm Payment
    Then User verify Authorizing Screen
    Then User verifies the Now Fueling screen
    And User verifies the Payment Complete Receipt page
    And User Tap on happy smiley
    And User tap on Done button
    Then User verify home page
    And User click Hamburger menu
    Then User click Purchase History
    And User Open the first Receipt
    Then User verifies the Receipt number
    And User click back button from Purchase History page
    
    @purchaseHistory @regression
    Scenario: Verify < button takes user to profile page and x button takes to home page
	  Given User verify home page
    And User click Hamburger menu
    Then User click Purchase History
    Then User click on back button
    And User verifies the Profile page
    Then User click Purchase History
    Then User click on close button
    Then User verify home page
     