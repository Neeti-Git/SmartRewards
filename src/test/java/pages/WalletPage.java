package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Utilites.ExcelData;
import Utilites.TestUtils;

public class WalletPage extends BasePage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//*[@content-desc=\"My Wallet\"]")
	private WebElement home_myWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement close_button;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement wallet_storeImage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Scan Rewards #\"]")
	private WebElement wallet_scanRewardsButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pay with App\"]")
	private WebElement wallet_payWithAppButton;
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
	private WebElement wallet_scanRewardsEarnText;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Rewards # 617-744-9546\"]")
	private WebElement wallet_phoneNumber;
	@AndroidFindBy(xpath = "//*[@class=\"com.horcrux.svg.PathView\"]")
	private WebElement wallet_barCode;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
	private WebElement wallet_barCodeNumber;

	public void user_click_my_wallet_on_home_page() {
		click(home_myWallet);
	}

	public void verify_barcode_is_generated() {
		waitForVisibility(wallet_storeImage);
		waitForVisibility(wallet_barCode);

	}

	public void verify_scan_rewards_is_selected_by_default() {
		waitForVisibility(wallet_scanRewardsButton);
		waitForVisibility(wallet_payWithAppButton);

	}

	public void verify_user_mobile_number_on_barcode() {
		waitForVisibility(wallet_scanRewardsEarnText);
		waitForVisibility(wallet_phoneNumber);

	}

	public void verify_numerical_representation_of_barcode_is_present() {
		waitForVisibility(wallet_barCodeNumber);

	}

//

}
