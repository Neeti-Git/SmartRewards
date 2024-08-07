@home @demo2
Feature: Home Page

  Background: Verify user able to Signin to application and verify App version
    Given User login to application and verify home page

  @fist_name
  Scenario: Verify First name of the user registered is displayed.
    Then User verify home page
    And User click Hamburger menu
    And User click Profile
    Then User copy frist name from profile info
    And User click back button from profile info
    Then User click close button from profile
    And User verify First name of the user registered is displayed

  @ST_HP_003
  Scenario: Verify view all offers
    Then User verify home page
    And Verify user should be able to see Your Rewards
    And User click View all Rewards
    Then Verify user should be able to see all rewards
    And User click first offer on the list
    Then User click close button on Rewards detail page
    Then User click close button on Rewards listing page
    Then User verify home page

  @ST_HP_009
  Scenario: Verify view all offers
    Then User verify home page
    And Verify user should be able to see Store name on home page

  @ST_HP_012
  Scenario: Verify clicking carousel image in other ways to save
    Then User verify home page
    And User verify Other Ways to Save on home page
    Then User should be able to see Carousel image
    Then User click View all on Other Ways to Save on home page
    And User click first offer on the list
    Then User click close button on Rewards detail page
    Then User click close button on Rewards listing page

  @ST_HP_013
  Scenario: Verify Expiry date visible on Other ways to save carousel image
    Then User verify home page
    And User verify Other Ways to Save on home page
    Then User click View all on Other Ways to Save on home page
    And User click first offer on the list
    Then User verify the Flash Sale Name
    Then User verify the Expiration Date
    Then User verify the image
