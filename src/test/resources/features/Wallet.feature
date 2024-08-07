@wallet @demo2
Feature: Walllet Page

  Background: 
    Given User verify the homepage and click Signin button
    And User enter login email address
    Then User enter login password
    Then User click signin button
    And User click allow notification button
    Then User verify home page

  @myWallet
  Scenario: Verify My Wallet Page
    Then User verify home page
    And User click My Wallet on home page
    Then Verify Barcode is generated
    Then Verify Scan Rewards # is selected by default
    Then Verify user mobile number on barcode
    Then Verify numerical representation of barcode is present
