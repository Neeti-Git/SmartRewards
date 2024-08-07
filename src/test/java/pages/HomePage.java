package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Utilites.ExcelData;
import Utilites.TestUtils;

public class HomePage extends BasePage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//*[@bounds=\"[72,624][1009,674]\"]")
	private WebElement profile_firstname;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement close_button;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
	private WebElement home_firstname;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private WebElement home_storename;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"by Fastrac\"]")
	private WebElement home_storename_byFastrac;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Rewards\"]")
	private WebElement home_yourRewardsText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"View all Rewards\"]")
	private WebElement home_ViewAllRewardsText;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Rewards\"])[1]")
	private WebElement rewardsScreen;

	@AndroidFindBy(xpath = "(//*[@class=\"android.widget.ImageView\"])[1]")
	private WebElement rewardsScreen_firstRewardsImage;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Tap to redeem offer\"]")
	private WebElement rewardsScreen_firstRewardsDetail_tabToRedeemOffer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Good Afternoon, Test!\"]")
	private WebElement home_footer_StoresIcon;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Good Afternoon, Test!\"]")
	private WebElement home_footer_myWalletIcon;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Good Afternoon, Test!\"]")
	private WebElement home_footer_rewardsIcon;

//
	static String fname, homeFnameMorn,homeFnameAfter,homeFnameEven;

	public void userCopyFirstNameFromProfileInfo() {

		waitForVisibility(profile_firstname);
		fname = profile_firstname.getText();
		System.out.println("  "+fname);

	}

	public void userClickCloseButtonFromProfile() {
		click(close_button);

	}

	public void userVerifyFirstNameOnHomePage() {
		waitForVisibility(home_firstname);
		homeFnameMorn = "Good Morning, " + fname + "!";
		homeFnameAfter = "Good Afternoon, " + fname + "!";
		homeFnameEven = "Good Evening, " + fname + "!";


		if (homeFnameMorn.contains(home_firstname.getText())||homeFnameEven.contains(home_firstname.getText())||homeFnameAfter.contains(home_firstname.getText())) {
			System.out.println("  First name displayed..");

		}

	}

	public void verifyUserShouldBeAbleToSeeYourRewards() {
		waitForVisibility(home_yourRewardsText);
	}

	public void userClickViewAllRewards() {
		click(home_ViewAllRewardsText);
	}

	public void verifyUserShouldBeAbleToSeeAllRewards() {
		waitForVisibility(rewardsScreen);
	}

	public void userClickFirstOfferOnTheList() {
		click(rewardsScreen_firstRewardsImage);

		waitForVisibility(rewardsScreen_firstRewardsDetail_tabToRedeemOffer);

	}

	public void userClickCloseButtonOnRewardsDetailPage() {
		click(close_button);

	}

	public void userClickCloseButtonOnRewardsListingPage() {
		click(close_button);

	}

	public void verifyUserShouldBeAbleToSeeStoreNameOnHomePage() {
		waitForVisibility(home_storename);
		waitForVisibility(home_storename_byFastrac);
	}

}
