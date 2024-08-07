package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import io.cucumber.java.en.*;
import pages.SigninPage;

public class SigninStepDef {

	@When("User login to application and verify home page")
	public void loginToAppAndVerifyHomePage() throws InterruptedException, IOException {
		try {

			new SigninPage().User_verify_home_page();

		} catch (NoSuchElementException e) {

			new SigninPage().User_verify_the_homepage_and_click_Sign_button();
			new SigninPage().user_enter_login_email_address();
			new SigninPage().user_enter_login_password();
			new SigninPage().User_click_signin_button();
			new SigninPage().User_click_allow_notification_button();
			new SigninPage().User_verify_home_page();
		} catch (TimeoutException e) {

			new SigninPage().User_verify_the_homepage_and_click_Sign_button();
			new SigninPage().user_enter_login_email_address();
			new SigninPage().user_enter_login_password();
			new SigninPage().User_click_signin_button();
			new SigninPage().User_click_allow_notification_button();
			new SigninPage().User_verify_home_page();
		}
	}

///
	@When("I enter username as {string}")
	public void iEnterUsernameAs(String username) throws InterruptedException {
		// new SigninPage().enterUserName(username);
	}

	

	@Then("User click SignUp button")
	public void user_click_SignUp_button() {
		new SigninPage().user_click_SignUp_button();

	}

	@And("User select {string} Favorite store")
	public void user_select_Favorite_store(String store) throws IOException {

		new SigninPage().user_select_Favorite_store(store);

	}

	@Then("User enter mobile number")
	public void user_enter_mobile_number() throws IOException, InterruptedException, AWTException {
		new SigninPage().user_enter_mobile_number();

	}

	//
	@Then("Verify user is able to see Continue button as disable")
	public void the_continue_button_should_be_disabled() {
		new SigninPage().the_continue_button_should_be_disabled();

	}

	@Then("Verify user is able to see Continue button as enable")
	public void the_continue_button_should_be_enable() {
		new SigninPage().the_continue_button_should_be_enable();

	}

	@Then("User enter weak password and verify message")
	public void enterWeakPassword() {
		new SigninPage().enterWeakPassword();

	}

	@Then("User enter medium password and verify message")
	public void enterMediumPassword() {
		new SigninPage().enterMediumPassword();

	}

	@Then("User enter strong password and verify message")
	public void enterStrongPassword() {
		new SigninPage().enterStrongPassword();

	}

	@And("User enter email address")
	public void user_enter_email_address() throws IOException, InterruptedException {
		new SigninPage().user_enter_email_address();

	}

	@Then("User enter password")
	public void user_enter_password() throws IOException, InterruptedException {
		new SigninPage().user_enter_password();

	}

	@And("User click Accept the terms of use")
	public void user_click_Accept_the_terms_of_use() throws IOException, InterruptedException {
		new SigninPage().user_click_Accept_the_terms_of_use();

	}

	@Then("User click Continue button")
	public void user_click_Continue_button() throws IOException, InterruptedException {
		new SigninPage().user_click_Continue_button();

	}

	@Given("User verify the homepage and click Signin button")
	public void User_verify_the_homepage_and_click_Sign_button() throws IOException, InterruptedException {
		new SigninPage().User_verify_the_homepage_and_click_Sign_button();

	}

	@Given("User verify the homepage")
	public void User_verify_the_homepage() throws IOException, InterruptedException {
		new SigninPage().User_verify_the_homepage();

	}

	@And("User enter login email address")
	public void user_enter_login_email_address() throws IOException, InterruptedException {
		new SigninPage().user_enter_login_email_address();

	}

	@Then("User enter login password")
	public void user_enter_login_password() throws IOException, InterruptedException {
		new SigninPage().user_enter_login_password();

	}

	@Then("User click signin button")
	public void User_click_signin_button() throws IOException, InterruptedException {
		new SigninPage().User_click_signin_button();

	}

	@Then("User click signin button on signUp page")
	public void User_click_signin_buttonOnSignUpPage() throws IOException, InterruptedException {
		new SigninPage().User_click_signin_buttonOnSignUpPage();

	}

	@And("User click allow notification button")
	public void User_click_allow_notification_button() throws IOException, InterruptedException {
		new SigninPage().User_click_allow_notification_button();

	}

	@Then("User verify home page")
	public void User_verify_home_page() throws IOException, InterruptedException {
		try {
			new SigninPage().User_verify_home_page();
		} catch (TimeoutException t) {
			new SigninPage().User_verify_the_homepage_and_click_Sign_button();
			new SigninPage().user_enter_login_email_address();
			new SigninPage().user_enter_login_password();
			new SigninPage().User_click_signin_button();
			new SigninPage().User_click_allow_notification_button();
			new SigninPage().User_verify_home_page();
		} catch (NoSuchElementException n) {
			new SigninPage().User_verify_the_homepage_and_click_Sign_button();
			new SigninPage().user_enter_login_email_address();
			new SigninPage().user_enter_login_password();
			new SigninPage().User_click_signin_button();
			new SigninPage().User_click_allow_notification_button();
			new SigninPage().User_verify_home_page();
		}
	}

	@And("User should able to see the app code verification popup")
	public void User_should_able_to_see_the_app_code_verification_popup() {
		new SigninPage().User_should_able_to_see_the_app_code_verification_popup();

	}

	@And("User enter invalid login email address")
	public void user_enter_invalid_login_email_address() throws IOException, InterruptedException {
		new SigninPage().user_enter_invalid_login_email_address();

	}

	@Then("User enter invalid login password")
	public void user_enter_invaild_login_password() throws IOException, InterruptedException {
		new SigninPage().user_enter_invaild_login_password();

	}

	@Then("Verify Error message Email or Password was entered incorrectly")
	public void errorMessageOnInvalidEmailAndPassword() throws IOException, InterruptedException {
		new SigninPage().invalid_email_and_password_error_message();

	}

	@Then("User able to see the error message on ivalid email")
	public void invalid_email_error_message() throws IOException, InterruptedException {
		new SigninPage().invalid_email_error_message();

	}

	@Given("User click forgot password")
	public void userClickForgotPassword() {
		new SigninPage().userClickForgotPassword();

	}

	@And("User enter forgot email address")
	public void userEnterForgotEmail() throws IOException {
		// new SigninPage().userEnterForgotEmail();

	}

	@Then("User enter invalid forgot email address")
	public void userInvalidEnterForgotEmail() throws IOException {
		new SigninPage().userInvalidEnterForgotEmail();

	}

	@Then("User validated error message")
	public void userValidateForgotEmailErrorMessage() throws IOException {
		new SigninPage().userValidateForgotEmailErrorMessage();

	}

	@Then("User click Submit button")
	public void UserClickSubmitButton() {
		new SigninPage().UserClickSubmitButton();

	}

	@And("User able to see reset link sent succesfull message")
	public void sentForgotLinkMessage() {
		new SigninPage().sentForgotLinkMessage();

	}

	@Then("User click close button")
	public void UserClickCloseButton() {
		new SigninPage().UserClickCloseButton();

	}

	@Then("User click Hamburger menu")
	public void userClickHamburgerMenu() {
		new SigninPage().userClickHamburgerMenu();
		

	}

	@Then("User verify app version")
	public void userGetAppVersion() throws InterruptedException {
		new SigninPage().userGetAppVersion();

	}

	@Then("User click logout")
	public void logout() throws InterruptedException {
		new SigninPage().logout();

	}

	@Then("User click Profile")
	public void userClickProfile() {
		new SigninPage().userClickProfile();

	}

	// profile

	// android.widget.TextView[@text="EMAIL"]/following::android.widget.TextView

	@Then("User is able to verfy Email")
	public void userIsAbleToVerfyEmail() {
		new SigninPage().userIsAbleToVerfyEmail();

	}

	@Then("User is able to verfy FirstName")
	public void userIsAbleToVerfyFirstName() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User is able to verfy Address")
	public void userIsAbleToVerfyAddress() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("User is able to verfy Mobile")
	public void userIsAbleToVerfyMobile() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("User is able to verfy DOB")
	public void userIsAbleToVerfyDOB() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("User click edit Profile button")
	public void userClickEditProfileButton() {
		new SigninPage().userClickEditProfileButton();

	}

	// editprofile

	@Then("User enter new firstname")
	public void userEnterNewFirstname() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userEnterNewFirstname();
	}

	@Then("User enter new address")
	public void userEnterNewAddress() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userEnterNewAddress();
	}

	@Then("User enter new city")
	public void userEnterNewCity() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userEnterNewCity();
	}

	@Then("User select state")
	public void userSelectState() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userSelectState();
	}

	@Then("User enter zip code")
	public void userEnterZipCode() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userEnterZipCode();
	}

	@Then("User click save button")
	public void userClickSaveButton() {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userClickSaveButton();
	}

	@Then("User verify successfull message for profile updates")
	public void userVerifyMessageProfileUpdates() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userVerifyMessageProfileUpdates();
	}

	@Then("User verify updated profile details")
	public void userVerifyUpdatedProfileDetails() {
		// Write code here that turns the phrase above into concrete actions
		new SigninPage().userVerifyUpdatedProfileDetails();
	}
	//

	@Then("User click update Password button")
	public void userClickUpdatePasswordButton() {
		new SigninPage().userClickUpdatePasswordButton();

	}

	@Then("User Enter old Password")
	public void userEnterOldPassword() throws IOException {
		new SigninPage().userEnterOldPassword();
	}

	@Then("User Enter new Password")
	public void userEnterNewPassword() throws IOException {
		new SigninPage().userEnterNewPassword();
	}

	@Then("User Enter confirm Password")
	public void userEnterConfirmPassword() throws IOException {
		new SigninPage().userEnterConfirmPassword();
	}

	@Then("User click update Password button to confirm")
	public void userClickUpdatePasswordButtonToConfirm() {
		new SigninPage().userClickUpdatePasswordButtonToConfirm();
	}

	@Then("User verify new password updated message")
	public void passwordUpdatedMessage() throws IOException {
		new SigninPage().passwordUpdatedMessage();
	}

	@Then("User click back button from profile info")
	public void UserClickBackButtonFromProfileinfo() throws IOException, InterruptedException {
		new SigninPage().UserClickBackButtonFromProfileinfo();
	}

	@Then("User click Eye icon")
	public void userClickEyeIcon() throws IOException, InterruptedException {
		new SigninPage().userClickEyeIcon();
	}

	@Then("Verify user able to see the password click eye icon")
	public void userShouldSeePasswordAfterClickEyeIcon() throws IOException, InterruptedException {
		new SigninPage().userShouldSeePasswordAfterClickEyeIcon();
	}

	@And("User sign in button is disabled")
	public void userVerifyDisabledSigninButton() throws IOException, InterruptedException {
		new SigninPage().userVerifyDisabledSigninButton();

	}

	@Then("User close signin page")
	public void userClickCloseButtonOnSignPage() throws IOException, InterruptedException {
		new SigninPage().userClickCloseButtonOnSignPage();

	}

	@Then("User verify signin page")
	public void userVerifySigninPage() throws IOException, InterruptedException {
		new SigninPage().userVerifySigninPage();

	}

	// SignUP
	@And("User verify three running carousal after application is launched")
	public void verifyThreeRunningCarousal() throws IOException, InterruptedException {
		new SigninPage().verifyThreeRunningCarousal();

	}

	@Then("User verify the store listing page")
	public void storeListingPage() throws IOException, InterruptedException, AWTException {
		new SigninPage().storeListingPage();

	}

	@Given("User verify the Cumberland Farms store banner visible")
	public void userVerifyTheCumberlandFarmsStoreBannerVisible() {
		new SigninPage().userVerifyTheCumberlandFarmsStoreBannerVisible();
	}

	@Given("User verify the Fastrac store banner visible")
	public void userVerifyTheFastracStoreBannerVisible() {
		new SigninPage().userVerifyTheFastracStoreBannerVisible();

	}

	@Given("User verify the TurkeyHill store banner visible")
	public void userVerifyTheTurkeyHillStoreBannerVisible() {
		new SigninPage().userVerifyTheTurkeyHillStoreBannerVisible();

	}

	@Given("User verify the LoafNJug store banner visible")
	public void userVerifyTheLoafNJugStoreBannerVisible() {
		new SigninPage().userVerifyTheLoafNJugStoreBannerVisible();

	}

	@Given("User verify the TomThumb store banner visible")
	public void userVerifyTheTomThumbStoreBannerVisible() {
		new SigninPage().userVerifyTheTomThumbStoreBannerVisible();

	}

	@Given("User verify the QuickStopstore banner visible")
	public void userVerifyTheQuickStopstoreBannerVisible() {
		new SigninPage().userVerifyTheQuickStopstoreBannerVisible();

	}

	@Given("User verify the KwikShop store banner visible")
	public void userVerifyTheKwikShopStoreBannerVisible() {
		new SigninPage().userVerifyTheKwikShopStoreBannerVisible();

	}

	@Given("User verify the Certified store banner visible")
	public void userVerifyTheCertifiedStoreBannerVisible() {
		new SigninPage().userVerifyTheCertifiedStoreBannerVisible();

	}

	@Given("User verify the MinitMart Certified store banner visible")
	public void userVerifyTheMinitMartCertifiedStoreBannerVisible() {
		new SigninPage().userVerifyTheMinitMartCertifiedStoreBannerVisible();

	}

	@Then("User enter invalid mobile number on signup page")
	public void userEnterInvalidMobileNumberOnSignupPage() {
		new SigninPage().userEnterInvalidMobileNumberOnSignupPage();
	}

	@Then("Verify an error message should come under the mobile field")
	public void verifyAnErrorMessageShouldComeUnderTheMobileField() {
		new SigninPage().verifyAnErrorMessageShouldComeUnderTheMobileField();

	}

	@Then("Verify an error message should come under the email field")
	public void verifyAnErrorMessageShouldComeUnderTheEmailField() {
		new SigninPage().verifyAnErrorMessageShouldComeUnderTheEmailField();

	}

	@Then("Verify mobile field should accept the number and no error message should appear")
	public void verifyMobileFieldShouldAcceptTheNumberAndNoErrorMessageShouldAppear() {
		new SigninPage().verifyMobileFieldShouldAcceptTheNumberAndNoErrorMessageShouldAppear();

	}

	@Then("User enter invalid email address on signup page")
	public void userEnterInvalidEmailAddressOnSignupPage() {
		new SigninPage().userEnterInvalidEmailAddressOnSignupPage();

	}

	@Then("Verify email field should accept the email and no error message should appear")
	public void verifyEmailFieldShouldAcceptTheEmailAndNoErrorMessageShouldAppear() {
		new SigninPage().verifyEmailFieldShouldAcceptTheEmailAndNoErrorMessageShouldAppear();

	}

	@Then("User enter invalid password on signup page")
	public void userEnterInvalidPasswordOnSignupPage() {
		new SigninPage().userEnterInvalidPasswordOnSignupPage();

	}

	@Then("Verify an error message should come under the password field")
	public void verifyAnErrorMessageShouldComeUnderThePasswordField() {
		new SigninPage().verifyAnErrorMessageShouldComeUnderThePasswordField();

	}

	@Then("Verify Terms & Conditions check box is unchecked")
	public void verifyTermsConditionsCheckBoxIsUnchecked() {
		new SigninPage().verifyTermsConditionsCheckBoxIsUnchecked();

	}

}
