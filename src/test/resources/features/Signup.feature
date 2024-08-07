@signup @demo2
Feature: SignUp Page

  @SR_LA_002 @regression
  Scenario: Validate if carousal is running after application is launched
    Given User verify the homepage
    And User verify three running carousal after application is launched

  @SR_LA_003 @regression
  Scenario: Validate if both "Sign In" and "SignUp" buttons are available and clickable
    Given User verify the homepage and click Signin button
    Then User close signin page
    And User verify signin page
    Then User click SignUp button
    Then User verify the store listing page

  @ST_SU_001 @regression
  Scenario: Verify if clicked on Signup button and verify all stores banner
    Then User click SignUp button
    And User verify the Cumberland Farms store banner visible
    And User verify the Fastrac store banner visible
    And User verify the TurkeyHill store banner visible
    And User verify the LoafNJug store banner visible
    And User verify the TomThumb store banner visible
    And User verify the QuickStopstore banner visible
    And User verify the KwikShop store banner visible
    And User verify the Certified store banner visible
    And User verify the MinitMart Certified store banner visible

  @ST_SU_002 @regression
  Scenario: Verify if an invalid number is passed
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter invalid mobile number on signup page
    Then Verify an error message should come under the mobile field

  @ST_SU_003 @regression
  Scenario: Verify if a valid number is passed
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    Then Verify mobile field should accept the number and no error message should appear

  @ST_SU_004 @regression
  Scenario: Verify if an invalid email is passed
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    And User enter invalid email address on signup page
    Then Verify an error message should come under the email field

  @ST_SU_005 @regression
  Scenario: Verify if a valid email is passed
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    And User enter email address
    Then Verify email field should accept the email and no error message should appear

  @ST_SU_006 @regression
  Scenario: Verify if an invalid password is entered
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    And User enter email address
    Then User enter invalid password on signup page
    Then Verify an error message should come under the password field

  @ST_SU_007 @regression
  Scenario: Verify if a valid email is passed (Medium)
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    And User enter email address
    Then User enter medium password and verify message

  @ST_SU_008 @regression
  Scenario: Verify if a valid email is passed (Strong)
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    And User enter email address
    Then User enter strong password and verify message

  @ST_SU_009 @regression
  Scenario: Verify if a valid email is passed (Very Strong)
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    And User enter email address
    Then User enter weak password and verify message
    Then User enter strong password and verify message

  @ST_SU_010 @regression
  Scenario: Verify the check box is unchecked
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    Then Verify user is able to see Continue button as disable
    And User enter email address
    Then Verify user is able to see Continue button as disable
    Then User enter weak password and verify message
    Then Verify user is able to see Continue button as disable
    Then User enter medium password and verify message
    Then User enter strong password and verify message
    Then Verify user is able to see Continue button as disable
    And Verify Terms & Conditions check box is unchecked

  @ST_SU_011 @regression
  Scenario: Verify the continue button is disabled
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    And User enter email address
    Then User enter strong password and verify message
    And Verify Terms & Conditions check box is unchecked
    Then Verify user is able to see Continue button as disable

  @ST_SU_012 @regression
  Scenario: Verify the continue button is enabled
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User enter mobile number
    Then Verify user is able to see Continue button as disable
    And User enter email address
    Then Verify user is able to see Continue button as disable
    Then User enter weak password and verify message
    Then Verify user is able to see Continue button as disable
    Then User enter medium password and verify message
    Then User enter strong password and verify message
    Then Verify user is able to see Continue button as disable
    And User click Accept the terms of use
    Then Verify user is able to see Continue button as enable
    Then User click Continue button
    And User should able to see the app code verification popup
