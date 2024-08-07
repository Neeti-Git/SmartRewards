package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class HamburgerMenuPage extends BasePage {

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Purchase History\"]")
	private WebElement purchaseHistoryMenu;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Purchase History\"]")
	private WebElement purchaseHistoryPage;
	@AndroidFindBy(xpath = "//test")
	private WebElement purchaseHistoryPageBackButton;

	public void userClickPurchaseHistory() {
		click(purchaseHistoryMenu);

	}

	public void userVerifyThePurchaseHistoryPage() {
		waitForVisibility(purchaseHistoryPage);
	}

	public void userClickBackButtonFromPurchaseHistoryPage() {
		// click(purchaseHistoryPageBackButton);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Payment Methods\"]")
	private WebElement paymentMethodsMenu;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add a new payment method\"]")
	private WebElement paymentMethodsMenuPage;
	@AndroidFindBy(xpath = "//test")
	private WebElement paymentMethods_backButton;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add a new payment method\"]")
	private WebElement paymentMethods_addNewPaymentButton;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@index=\"0\"])[12]")
	private WebElement paymentMethods_dontMissOutCard;

	public void userClickPaymentMethods() {
		click(paymentMethodsMenu);
	}

	public void userVerifyAddANewPaymentMethodButton() {
		waitForVisibility(paymentMethods_addNewPaymentButton);

	}

	public void userVerifyThePaymentMethodsPage() {
		waitForVisibility(paymentMethodsMenuPage);
	}

	public void userVerifyDontMissOutCartOnThePaymentPage() {
		waitForVisibility(paymentMethods_dontMissOutCard);

	}

	public void userVerifyAddAPaymentMethodButton() {
		waitForVisibility(paymentMethods_addNewPaymentButton);
	}

	public void userClickBackButtonFromPaymentMethodsPage() {
		// click(paymentMethods_backButton);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Offers\"]")
	private WebElement offersMenu;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Offers\"]")
	private WebElement offersPage;

	@AndroidFindBy(xpath = "//test")
	private WebElement offersPage_backButton;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@index=\"0\"])[12]")
	private WebElement offersPage_OffersComingYourWayCard;

	public void userClickOffersFromMenu() {
		click(offersMenu);
	}

	public void userVerifyOffersComingYourWayOnTheOffersPage() {
		waitForVisibility(offersPage_OffersComingYourWayCard);
	}

	public void userClickBackButtonFromOffersPage() {
		// click(offersPage_backButton);
	}

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Rewards\"])[2]")
	private WebElement rewardsMenu;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Rewards\"]")
	private WebElement rewardsPage;

	public void userClickRewardsFromMenu() {
		click(rewardsMenu);
	}

	public void userVerifyRewardsPage() {
		waitForVisibility(rewardsPage);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Help\"]")
	private WebElement helpMenu;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Help\"])[1]")
	private WebElement helpPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"FAQs\"]")
	private WebElement helpPage_faq;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"How to use the app\"]")
	private WebElement helpPage_howToUseApp;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@index=\"0\"])[11]")
	private WebElement helpPage_generalQuestionCallButton;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@index=\"0\"])[12]")
	private WebElement helpPage_ChangeCheckingAccountCallButton;
	@AndroidFindBy(xpath = "//test")
	private WebElement helpPage_backButton;

	public void userClickHelpFromMenu() {
		click(helpMenu);
	}

	public void userVerifyHelpPage() {
		waitForVisibility(helpPage);
	}

	public void userVerifyFAQsLink() {
		waitForVisibility(helpPage_faq);
	}

	public void userVerifyHowToUseTheAppLinkOnHelpPage() {
		waitForVisibility(helpPage_howToUseApp);

	}

	public void userVerifyGeneralQuestionMessageAndCallButton() {
		waitForVisibility(helpPage_generalQuestionCallButton);

	}

	public void userVerifyChangeCheckingAccountMessageAndCallButton() {
		waitForVisibility(helpPage_ChangeCheckingAccountCallButton);

	}

	public void userClickBackButtonFromHelpPage() {
		// click(helpPage_backButton);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Settings\"]")
	private WebElement settingsMenu;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Notifications\"]")
	private WebElement settingsPage;

	public void userClickSettingsFromMenu() {
		click(settingsMenu);
	}

	public void userVerifySettingsPage() {
		waitForVisibility(settingsPage);
	}

	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_notificationMessage;
	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_pushNotificationToggle;
	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_emailToggle;
	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_textMessageToggle;
	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_ageVerificationToggle;
	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_touchIDToggle;
	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_accessLocationToggle;
	@AndroidFindBy(xpath = "//test")
	private WebElement settingsPage_backButton;

	public void userVerifyNotificationsMessage() {
		// waitForVisibility(settingsPage_notificationMessage);
	}

	public void userVerifyPushNotificationEnabledByDefault() {
		// waitForVisibility(settingsPage_pushNotificationToggle);

	}

	public void userVerifyEmailNotificationDisabledByDefault() {
		// waitForVisibility(settingsPage_emailToggle);

	}

	public void userVerifyTextMessagesEnabledByDefault() {
		// waitForVisibility(settingsPage_textMessageToggle);

	}

	public void userVerifyAgeRestrictedButtonDisabledByDefault() {
		// waitForVisibility(settingsPage_ageVerificationToggle);

	}

	public void userVerifyTouchIDEnabledByDefault() {
		// waitForVisibility(settingsPage_touchIDToggle);

	}

	public void userVerifyAcceessToLocationDisabledByDefault() {
		// waitForVisibility(settingsPage_accessLocationToggle);

	}

	public void userClickBackButtonFormSettingsPage() {
		// click(settingsPage_backButton);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Policies, Terms & Conditions\"]")
	private WebElement termsConditionMenu;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Policies\"]")
	private WebElement termsConditionPage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Privacy\"]")
	private WebElement termsConditionPage_privacy;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"California Do Not Sell\"]")
	private WebElement termsConditionPage_californiaDoNotSell;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Smart Rewards\"]")
	private WebElement termsConditionPage_SmartRewards;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ZipLine Bank Account\"]")
	private WebElement termsConditionPage_ZipLineBankAccount;
	@AndroidFindBy(xpath = "//test")
	private WebElement termsConditionPage_backButton;

	public void userClickPoliciesTermsConditionsFromMenu() {
		click(termsConditionMenu);
	}

	public void userVerifyTermsPage() {
		waitForVisibility(termsConditionPage);
	}

	public void userVerifyPrivacyLinkOnTermsPages() {
		waitForVisibility(termsConditionPage_privacy);

	}

	public void userVerifyCalifoniaDoNotSellLinkOnTermsPages() {
		waitForVisibility(termsConditionPage_californiaDoNotSell);

	}

	public void userVerifySmartRewardsLinkOnTermsPages() {
		waitForVisibility(termsConditionPage_SmartRewards);

	}

	public void userVerifyZipLineBankAccountLinkOnTermsPages() {
		waitForVisibility(termsConditionPage_ZipLineBankAccount);

	}

	public void userClickBackButtonFormTermsPage() {
		// click(termsConditionPage_backButton);

	}

}
