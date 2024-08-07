@signin1 @demo2
Feature: SignIn Page

  @ST_SI_001 @regression
  Scenario: Verify Login with valid email and password
    Given User verify the homepage and click Signin button
    And User enter login email address
    Then User enter login password
    Then User click signin button
    And User click allow notification button
    Then User verify home page
    And User click Hamburger menu
    Then User verify app version
    Then User click logout

  @ST_SI_002 @regression
  Scenario: Verify Login with wrong email and password-verify message
    Given User verify the homepage and click Signin button
    And User enter invalid login email address
    Then User enter invalid login password
    Then User click signin button
    And Verify Error message Email or Password was entered incorrectly

  @ST_SI_003 @regression
  Scenario: Verify Forgot my password
    Given User verify the homepage and click Signin button
    Given User click forgot password
    And User enter forgot email address
    Then User enter invalid forgot email address
    Then User validated error message
    Then User click Submit button

  @ST_SI_004 @regression
  Scenario: Verify Eye icon
    Given User verify the homepage and click Signin button
    And User enter login email address
    Then User enter invalid login password
    Then User click Eye icon
    Then Verify user able to see the password click eye icon

  @ST_SI_005 @regression
  Scenario: Verify Sign In without email and password and Sign In  button should be disabled
    Given User verify the homepage and click Signin button
    And User sign in button is disabled

  @ST_SI_008 @regression
  Scenario: Verify Signup on Sign In
    Then User click SignUp button
    And User select "Cumberland" Favorite store
    Then User click signin button on signUp page
    And User verify signin page
    And User enter login email address
    Then User enter login password
    Then User click signin button
    And User click allow notification button
    Then User verify home page
    And User click Hamburger menu
    Then User verify app version
    Then User click logout

  @ST_SI_009 @regression
  Scenario: Verify Close Sign In
    Given User verify the homepage and click Signin button
    Then User close signin page
    And User verify signin page
