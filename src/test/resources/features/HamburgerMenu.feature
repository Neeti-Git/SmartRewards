@hamburgerMenu @demo2
Feature: Hamburger Menu list

  Background: Verify user able to Signin to application and verify App version
    Given User login to application and verify home page

  @purchaseHistory @regression
  Scenario: Verify user able to Purchase History
    Then User verify home page
    And User click Hamburger menu
    Then User click Purchase History
    And User verify the Purchase History page
    And User click back button from Purchase History page

  @paymentMethods @regression
  Scenario: Verify user able to Add new payment method with Bank Account
    Then User verify home page
    And User click Hamburger menu
    Then User click Payment Methods
    And User verify the Payment Methods page
    Then User verify Dont miss out cart on the Payment page
    Then User verify Add a new payment method button
    And User click back button from Payment Methods page

  @offers @regression
  Scenario: Verify user able to see Offers
    Then User verify home page
    And User click Hamburger menu
    Then User click Offers from menu
    Then User verify offers coming your way on the offers page
    And User click back button from offers page

  @rewards @regression
  Scenario: Verify user able to navigate rewards page
    Then User verify home page
    And User click Hamburger menu
    Then User click Rewards from menu
    Then User verify Rewards page

  @help @regression
  Scenario: Verify user able to navigate help page
    Then User verify home page
    And User click Hamburger menu
    Then User click Help from menu
    Then User verify Help page
    Then User verify FAQs link
    Then User verify How to use the app link on help page
    Then User verify General Question message and Call button
    Then User verify Change Checking Account message and Call button
    And User click back button from help page

  @settings @regression
  Scenario: Verify user able to navigate settings page
    Then User verify home page
    And User click Hamburger menu
    Then User click Settings from menu
    Then User verify Settings page
    And User verify Notifications message
    Then User verify push notification enabled by default
    Then User verify Email notification disabled by default
    Then User verify Text Messages enabled by default
    Then User verify Age-restricted button disabled by default
    Then User verify Touch ID enabled by default
    Then User verify Acceess to Location disabled by default
    Then User click back button form Settings page

  @terms @regression
  Scenario: Verify user able to navigate policies, Terms & Conditions page
    Then User verify home page
    And User click Hamburger menu
    Then User click Policies, Terms & Conditions from menu
    Then User verify Terms page
    Then User verify Privacy link on Terms pages
    Then User verify Califonia Do Not Sell link on Terms pages
    Then User verify Smart Rewards link on Terms pages
    Then User verify ZipLine Bank Account link on Terms pages
    Then User click back button form Terms page
