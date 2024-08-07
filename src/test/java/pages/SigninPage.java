package pages;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import Utilites.ExcelData;
import Utilites.JvmReport;
import Utilites.TestUtils;

public class SigninPage extends BasePage {
	TestUtils utils = new TestUtils();
	String firstname = "//android.widget.TextView[@text=\"" + new_fn + "\"]";
	String address = "//android.widget.TextView[@text=\"" + new_add + ", AK, " + new_zip1 + "\"]";
	@AndroidFindBy(accessibility = "test-Username")
	@iOSXCUITFindBy(id = "test-Username")
	private WebElement usernameTxtFld;

	@AndroidFindBy(accessibility = "Sign up")
	@iOSXCUITFindBy(id = "test-Username")
	private WebElement signUpButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
	private WebElement mobile_edit;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"(_ _ _) _ _ _-_ _ _ _\"]")
	private WebElement mobile_edit_type;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[1]")
	private WebElement email_input;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[2]")
	private WebElement password_input;

	@AndroidFindBy(xpath = "//android.widget.CheckBox/android.view.ViewGroup")
	private WebElement term_check_box;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Continue\"]")
	private WebElement continue_button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Already have an account? Sign In\"]")
	private WebElement signup_page_sigin_button;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Sign in\"]")
	private WebElement home_signin_button;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Sign In\"]")
	private WebElement signin_button;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
	private WebElement allow_notification;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Home\"]")
	private WebElement homepage_home_button;

	public SigninPage() {
	}



	public void user_click_SignUp_button() {

		try {
			click(signUpButton);

		} catch (TimeoutException t) {
			waitForVisibility(homepage_home_button);
			new SigninPage().userClickHamburgerMenu();
			new SigninPage().logout();
			click(signUpButton);

		} catch (NoSuchElementException n) {
			waitForVisibility(homepage_home_button);
			new SigninPage().userClickHamburgerMenu();
			new SigninPage().logout();
			click(signUpButton);

		}

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
	private WebElement cumberland_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
	private WebElement fastrac_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
	private WebElement turkeyHill_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
	private WebElement LoafNJug_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(4)")
	private WebElement tomThumb_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(5)")
	private WebElement quickStop_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(6)")
	private WebElement kwikShop_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(7)")
	private WebElement certified_store;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(8)")
	private WebElement minitMart_store;

	public void user_select_Favorite_store(String store) throws IOException {

		if (store.equalsIgnoreCase("Cumberland")) {

			cumberland_store.click();
		} else if (store.equalsIgnoreCase("Fastrac")) {

			fastrac_store.click();
		} else if (store.equalsIgnoreCase("TurkeyHill")) {

			turkeyHill_store.click();
		} else if (store.equalsIgnoreCase("Loaf'N'Jug")) {

			LoafNJug_store.click();
		} else if (store.equalsIgnoreCase("TomThumb")) {

			tomThumb_store.click();
		} else if (store.equalsIgnoreCase("QuickStop")) {

			quickStop_store.click();
		} else if (store.equalsIgnoreCase("KwikShop")) {

			kwikShop_store.click();
		} else if (store.equalsIgnoreCase("Certified")) {

			certified_store.click();
		} else if (store.equalsIgnoreCase("MinitMart")) {

			minitMart_store.click();
		} else {
			System.out.println("Invalid store name on Signup page");
		}
	}

	public void user_enter_mobile_number() throws IOException, InterruptedException, AWTException {
		waitForVisibility(mobile_edit);
		mobile_edit.click();

		// sendKeys(mobile_edit_type, "6177449546");
		sendKeys(mobile_edit_type, ExcelData.getExcelData("SignIn", "mobile", "value"));

	}

	public void user_enter_email_address() throws IOException {
		sendKeys(email_input, setRandomEmail());
	}

	public void user_enter_password() {
		sendKeys(password_input, "Automation" + generateRandomNumber());

	}

	public void user_click_Accept_the_terms_of_use() {
		click(term_check_box);
	}

	public void user_click_Continue_button() {

		click(continue_button);
	}

	public void User_verify_the_homepage_and_click_Sign_button() throws InterruptedException {
		try {
			click(home_signin_button);

		} catch (TimeoutException t) {
			waitForVisibility(homepage_home_button);
			new SigninPage().userClickHamburgerMenu();
			new SigninPage().logout();
			click(home_signin_button);

		} catch (NoSuchElementException n) {
			waitForVisibility(homepage_home_button);
			new SigninPage().userClickHamburgerMenu();
			new SigninPage().logout();
			click(home_signin_button);

		}

	}

	public void User_verify_the_homepage() throws InterruptedException {
		waitForVisibility(home_signin_button);

	}

	public void user_enter_login_email_address() throws IOException {

		sendKeys(email_input, ExcelData.getExcelData("SignIn", "email", "value"));

	}

	public void user_enter_login_password() throws IOException {
		sendKeys(password_input, ExcelData.getExcelData("SignIn", "password", "value"));

	}

	public void User_click_signin_button() {
		click(signin_button);

	}

	public boolean User_click_allow_notification_button() {

		try {
			waitForVisibility(allow_notification);
			click(allow_notification);
			return true;

		} catch (TimeoutException e) {

			return true;

		}

	}

	public void User_verify_home_page() {

		waitForVisibility(homepage_home_button);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Verify your Mobile Number\"]")
	private WebElement signup_verify_mobilenumber;

	public void User_should_able_to_see_the_app_code_verification_popup() {
		waitForVisibility(signup_verify_mobilenumber);
	}

	public void user_enter_invalid_login_email_address() {
		sendKeys(email_input, "t@gmail.com");

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Email entered is incorrect\"]")
	private WebElement inavlid_email_error_message;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Email or Password was entered Incorrectly\"]")
	private WebElement inavlid_email_and_password_error_message;

	public void invalid_email_error_message() throws IOException {
		waitForVisibility(inavlid_email_error_message);
	}

	public void invalid_email_and_password_error_message() throws InterruptedException {
		waitFor(3000);
		waitForVisibility(inavlid_email_and_password_error_message);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Forgot my Password\"]")
	private WebElement forgotPasswordLink;
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"text-input-flat\"]")
	private WebElement forgotEmailInput;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Submit\"]")
	private WebElement submitButton;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Check your email for a link to reset your password\"]")
	private WebElement linkSentMessage;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Close\"]")
	private WebElement closeButton;

	public void userClickForgotPassword() {
		click(forgotPasswordLink);
	}

	public void userEnterForgotEmail() throws IOException {
		click(forgotEmailInput);

		sendKeys(forgotEmailInput, "test");

	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Submit\"]")
	private WebElement cancelButtonForgotPassword;

	public void UserClickSubmitButton() {
		// click(submitButton);
		click(cancelButtonForgotPassword);

	}

	public void sentForgotLinkMessage() {
		// waitForVisibility(linkSentMessage);
	}

	public void UserClickCloseButton() {
		// click(closeButton);
	}

	public boolean the_continue_button_should_be_disabled() {
		boolean button = false;
		try {
			if (continue_button.isDisplayed()) {
				button = false;
			}
		} catch (NoSuchElementException e) {
			button = true;
		}
		return button;

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Password requirements not met\"]")
	private WebElement weak_password_input_error;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Weak\"]")
	private WebElement weak_password;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Medium\"]")
	private WebElement medium_password;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Very Strong\"]")
	private WebElement strong_password;

	public void enterWeakPassword() {
		sendKeys(password_input, "test");
		waitForVisibility(weak_password_input_error);
		waitForVisibility(weak_password);

	}

	public void enterMediumPassword() {
		sendKeys(password_input, "test@123");
		waitForVisibility(medium_password);
	}

	public void enterStrongPassword() {
		sendKeys(password_input, "Test@123@Test");
		waitForVisibility(strong_password);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement hamburger_menu;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"App version\")]")
	private WebElement appversion;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement menu_close_button;

	public void userClickHamburgerMenu() {
		waitForVisibility(hamburger_menu);
		click(hamburger_menu);

	}

	public void userGetAppVersion() throws InterruptedException {
		waitForVisibility(appversion);

		String vNumber = appversion.getText().substring(13);
		JvmReport report = new JvmReport();
		JvmReport.build = vNumber;
		System.out.println("  " + appversion.getText());

	}
//profile

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Profile\"]")
	private WebElement profile_menu;

	public void userClickProfile() {
		click(profile_menu);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"EMAIL\"]/following::android.widget.TextView")
	private WebElement profileEmailText;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Profile Info\"]/parent::android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement edit_profile;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"text-input-flat-label-inactive\" and @text=\"EMAIL\"]/parent::android.view.ViewGroup/following::android.widget.EditText")
	private WebElement profile_edit_firstname;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Update Password\"]")
	private WebElement update_password;

	public void userIsAbleToVerfyEmail() {

	}

	public void userClickEditProfileButton() {
		click(edit_profile);

	}

	public boolean the_continue_button_should_be_enable() {
		boolean button = false;
		try {
			if (continue_button.isDisplayed()) {
				button = true;
			}
		} catch (NoSuchElementException e) {
			button = false;
		}
		return button;

	}

	public void userClickUpdatePasswordButton() {
		click(update_password);
	}

	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[1]")
	private WebElement oldPassword;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[2]")
	private WebElement newPassword;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[3]")
	private WebElement confirmPassword;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Update Password\"]")
	private WebElement updateNewPasswordButton;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"New password updated!\"]")
	private WebElement updatedPasswordMessage;
	static String newPwd, oldPwd;

	public void userEnterOldPassword() throws IOException {
		oldPwd = ExcelData.getExcelData("SignIn", "password", "value");
		sendKeys(oldPassword, oldPwd);

	}

	public void userEnterNewPassword() throws IOException {
		newPwd = ExcelData.getExcelData("SignIn", "newpassword", "value");
		sendKeys(newPassword, newPwd);

	}

	public void userEnterConfirmPassword() throws IOException {

		sendKeys(confirmPassword, newPwd);

	}

	public void userClickUpdatePasswordButtonToConfirm() {
		click(updateNewPasswordButton);
	}

	public void passwordUpdatedMessage() throws IOException {
		waitForVisibility(updatedPasswordMessage);
		ExcelData.setExcelData("SignIn", 3, newPwd);
		ExcelData.setExcelData("SignIn", 5, oldPwd);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Log out\"]")
	private WebElement logout;

	public void logout() {
		click(logout);
	}

	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[2]")
	private WebElement editFirstname;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[4]")
	private WebElement editAddress;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[5]")
	private WebElement editCity;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"text-input-flat\"])[6]")
	private WebElement editzip;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement editStateIcon;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"AL - Alabama\"]")
	private WebElement editStateAL;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"AK - Alaska\"]")
	private WebElement editStateAK;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Save\"]")
	private WebElement editSave;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Your profile has been successfully updated\"]")
	private WebElement profileUpdateMessage;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement backButtonFromProfileInfo;
	static String new_fn, new_add, new_city, new_state, new_zip, new_zip1;

	public void userEnterNewFirstname() throws IOException {
		new_fn = ExcelData.getExcelData("UserProfile", "new_firstname", "value");
		sendKeys(editFirstname, new_fn);
	}

	public void userEnterNewAddress() throws IOException {
		new_add = ExcelData.getExcelData("UserProfile", "new_address", "value");
		sendKeys(editAddress, new_add);

	}

	public void userEnterNewCity() throws IOException {
		new_city = ExcelData.getExcelData("UserProfile", "new_city", "value");
		sendKeys(editCity, new_city);

	}

	public void userSelectState() throws IOException {
		click(editStateIcon);
		new_state = ExcelData.getExcelData("UserProfile", "new_state", "value");
		waitForVisibility(editStateAL);
		if (new_state.equals("AL")) {
			click(editStateAL);

		} else if (new_state.equals("AK")) {
			click(editStateAK);

		}

	}

	public void userEnterZipCode() throws IOException {
		new_zip = ExcelData.getExcelData("UserProfile", "new_zip", "value");
		new_zip1 = new_zip.substring(0, 5);

		sendKeys(editzip, new_zip);

	}

	public void userClickSaveButton() {
		click(editSave);
		waitForVisibility(profileUpdateMessage);

	}

	static String fn, add, city, state, zip;

	public void userVerifyMessageProfileUpdates() throws IOException {

		fn = ExcelData.getExcelData("UserProfile", "firstname", "value");
		add = ExcelData.getExcelData("UserProfile", "address", "value");
		city = ExcelData.getExcelData("UserProfile", "city", "value");
		// state = ExcelData.getExcelData("UserProfile", "state", "value");
		zip = ExcelData.getExcelData("UserProfile", "zip", "value");

		ExcelData.setExcelData("UserProfile", 10, fn);
		ExcelData.setExcelData("UserProfile", 2, new_fn);

		ExcelData.setExcelData("UserProfile", 12, add);
		ExcelData.setExcelData("UserProfile", 4, new_add);

		ExcelData.setExcelData("UserProfile", 13, city);
		ExcelData.setExcelData("UserProfile", 5, new_city);

		// ExcelData.setExcelData("UserProfile", 15, state);
		// ExcelData.setExcelData("UserProfile", 6, new_state);

		ExcelData.setExcelData("UserProfile", 14, zip);
		ExcelData.setExcelData("UserProfile", 6, new_zip);

	}

	public void userVerifyUpdatedProfileDetails() {

		verifyTextVisiblity(firstname);
		// verifyTextVisiblity(address);

	}

	public void UserClickBackButtonFromProfileinfo() throws InterruptedException {
		Thread.sleep(3000);
		click(backButtonFromProfileInfo);

	}

	// @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Please enter a
	// valid email address\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Email is required\"]")
	private WebElement errorMessageForgotEmailInput;

	public void userInvalidEnterForgotEmail() {
		click(forgotEmailInput);

		sendKeys(forgotEmailInput, "test@test");

	}

	public void userValidateForgotEmailErrorMessage() {
		waitForVisibility(errorMessageForgotEmailInput);
	}

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@index=\"0\"])[2]")
	private WebElement signinPassword_eyeIcon;

	public void userClickEyeIcon() {
		click(signinPassword_eyeIcon);
	}

	public void user_enter_invaild_login_password() {
		sendKeys(password_input, "123");

	}

	public void userShouldSeePasswordAfterClickEyeIcon() {

		if (password_input.getText().contains("1234")) {
			System.out.println("  User is able to see the password" + password_input);

		}

	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@enabled=\"false\"]")
	private WebElement disableSiginButton;

	public void userVerifyDisabledSigninButton() {
		waitForVisibility(disableSiginButton);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Already have an account? Sign In\"]")
	private WebElement alreadyHaveAccount;

	public void User_click_signin_buttonOnSignUpPage() {
		click(alreadyHaveAccount);
	}

	@AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement closeButtonOnSignPage;

	public void userClickCloseButtonOnSignPage() {
		click(closeButtonOnSignPage);
	}

	public void userVerifySigninPage() {
		waitForVisibility(signin_button);
	}

	// Signup

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Unlock the perks of SmartRewards\"]")
	private WebElement carousal1;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pump, pay & pocket rewards!\"]")
	private WebElement carousal2;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Fuel your car & your wallet\"]")
	private WebElement carousal3;

	public void verifyThreeRunningCarousal() {
		waitForVisibility(carousal1);
		waitForVisibility(carousal2);
		waitForVisibility(carousal3);

	}

	public void storeListingPage() {
		waitForVisibility(cumberland_store);
	}

	public void userVerifyTheCumberlandFarmsStoreBannerVisible() {
		waitForVisibility(cumberland_store);
	}

	public void userVerifyTheFastracStoreBannerVisible() {
		waitForVisibility(fastrac_store);

	}

	public void userVerifyTheTurkeyHillStoreBannerVisible() {
		waitForVisibility(turkeyHill_store);

	}

	public void userVerifyTheLoafNJugStoreBannerVisible() {
		waitForVisibility(LoafNJug_store);

	}

	public void userVerifyTheTomThumbStoreBannerVisible() {
		waitForVisibility(tomThumb_store);

	}

	public void userVerifyTheQuickStopstoreBannerVisible() {
		waitForVisibility(quickStop_store);

	}

	public void userVerifyTheKwikShopStoreBannerVisible() {
		waitForVisibility(kwikShop_store);

	}

	public void userVerifyTheCertifiedStoreBannerVisible() {
		waitForVisibility(minitMart_store);

	}

	public void userVerifyTheMinitMartCertifiedStoreBannerVisible() {
		waitForVisibility(cumberland_store);

	}

	public void userEnterInvalidMobileNumberOnSignupPage() {
		waitForVisibility(mobile_edit);
		mobile_edit.click();

		// sendKeys(mobile_edit_type, "6177449546");
		sendKeys(mobile_edit_type, "617744954");
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Phone number is not valid\"]")
	private WebElement errorMessageShouldComeUnderTheMobileField;

	public void verifyAnErrorMessageShouldComeUnderTheMobileField() {
		waitForVisibility(errorMessageShouldComeUnderTheMobileField);
	}

	public boolean verifyMobileFieldShouldAcceptTheNumberAndNoErrorMessageShouldAppear() {
		boolean i;
		try {
			waitForVisibility(errorMessageShouldComeUnderTheMobileField);
			i = false;

		} catch (TimeoutException t) {
			i = true;

		} catch (NoSuchElementException n) {
			i = true;

		}
		return i;
	}

	public void userEnterInvalidEmailAddressOnSignupPage() {
		sendKeys(email_input, "test.com");
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Email entered is incorrect\"]")
	private WebElement errorMessageShouldComeUnderTheEmailField;

	public void verifyAnErrorMessageShouldComeUnderTheEmailField() {
		waitForVisibility(errorMessageShouldComeUnderTheEmailField);
	}

	public void verifyEmailFieldShouldAcceptTheEmailAndNoErrorMessageShouldAppear() {
		// TODO Auto-generated method stub

	}

	public void userEnterInvalidPasswordOnSignupPage() {
		sendKeys(password_input, "test123");

	}

	public void verifyAnErrorMessageShouldComeUnderThePasswordField() {
		waitForVisibility(weak_password_input_error);
		waitForVisibility(weak_password);
	}

	public void verifyTermsConditionsCheckBoxIsUnchecked() {
		// TODO Auto-generated method stub

	}

}