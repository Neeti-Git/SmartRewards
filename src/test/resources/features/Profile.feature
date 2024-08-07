@ProfilePage @demo2
Feature: Profile Page

  @upadatePassword @regression
  Scenario: Verify user able to update password
    Given User verify the homepage and click Signin button
    And User enter login email address
    Then User enter login password
    Then User click signin button
    And User click allow notification button
    Then User verify home page
    And User click Hamburger menu
    Then User verify app version
    And User click Profile
    And User click update Password button
    Then User Enter old Password
    Then User Enter new Password
    Then User Enter confirm Password
    And User click update Password button to confirm
    Then User verify new password updated message
    And User click back button from profile info
    Then User click logout

  @profile @regression
  Scenario: Verify user able to Signin to application
    Given User verify the homepage and click Signin button
    And User enter login email address
    Then User enter login password
    Then User click signin button
    And User click allow notification button
    Then User verify home page
    And User click Hamburger menu
    Then User verify app version
    And User click Profile
    And User click edit Profile button
    Then User enter new firstname
    Then User enter new address
    Then User enter new city
    Then User enter zip code
    And User click save button
    Then User verify successfull message for profile updates
    Then User verify updated profile details
    And User click back button from profile info
    Then User click logout