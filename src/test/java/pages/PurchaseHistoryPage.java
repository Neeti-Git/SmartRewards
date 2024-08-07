package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class PurchaseHistoryPage extends BasePage{
	
	@AndroidFindBy(accessibility = "Fuel Up")
	private WebElement fuelUpHome;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")
	private WebElement permissionWhileUsingApp;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Store #\"]")
	private WebElement fuelUpSearchBox;
	
	@AndroidFindBy(accessibility = "CUMBERLAND_FARMS")
	private WebElement storeOnMap;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement closeButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"1\"]")
	private WebElement storePumpOne;
	
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[1]")
	private WebElement pinTextBox1;
	
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[2]")
	private WebElement pinTextBox2;
	
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[3]")
	private WebElement pinTextBox3;
	
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[4]")
	private WebElement pinTextBox4;
	
	@AndroidFindBy(accessibility = "Confirm Payment")
	private WebElement confirmPaymentBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Authorizing...\"]")
	private WebElement authorizingStatus;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Now Fueling\"]")
	private WebElement nowFuelingStatus;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Payment Complete.\"]")
	private WebElement paymentCompleteMsg;
	
	//Recepit number cannot be captured from the receipt not findable
//	@AndroidFindBy(xpath = "")
//	private WebElement receiptNumber;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement happySmiley;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Done\"]")
	private WebElement doneButton;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Whitehall,Store 1603\"])[1]")
	private WebElement firstReceipt;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement backButtonPurHis;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement profileHome;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement closeButtonPurHis;
	

	public void userClickOnFuelUp() {
		click(fuelUpHome);
		
	}
	
	public void userAllowLocationAccess() {
		click(permissionWhileUsingApp);
		
	}

	public void userSearchStoreNumber() throws InterruptedException {
		Thread.sleep(8000);
		sendKeys(fuelUpSearchBox, "1603");
		
	}

	public void userTapOnStore() {
		click(storeOnMap);

		
	}

	public void userCloseTheErrorMessage() {
		click(closeButton);
	}

	public void userTapOnPumpOne() {
		click(storePumpOne);
		
	}

	public void userEnterThePin() {
		sendKeys(pinTextBox1, "1");
		sendKeys(pinTextBox2, "2");
		sendKeys(pinTextBox3, "3");
		sendKeys(pinTextBox4, "4");
		
	}

	public void userTapOnConfirmPayment() {
		click(confirmPaymentBtn);
		
	}

	public void userVerifyAuthorizingScreen() {
		waitForVisibility(authorizingStatus);
		
	}

	public void userVerifiesTheNowFuelingScreen() throws InterruptedException {
		Thread.sleep(8000);
		waitForVisibility(nowFuelingStatus);
		
	}

	public void userVerifiesThePaymentCompleteReceiptPage() throws InterruptedException {
		Thread.sleep(8000);
		waitForVisibility(paymentCompleteMsg);
		
	}

	public void userStoreTheValueOfRefNumber() {
		
		
	}

	public void userTapOnHappySmiley() {
		click(happySmiley);
		
	}

	public void userTapOnDoneButton() {
		click(doneButton);
		
	}

	public void userOpenTheFirstReceipt() {
		waitForVisibility(firstReceipt);
		
	}

	public void  UserVerifiesTheReceiptNumber() {
		String storeNum=firstReceipt.getText();
		boolean x;
		System.out.println(storeNum);
		if(storeNum.contains("1603"))
		{
			x=true;
		}
		else
		{
			x=false ;
		}
		Assert.assertEquals(x, true);
		
	}

	public void userClickOnBackButton() {
		click(backButtonPurHis);
		
	}

	public void userVerifiesTheProfilePage() {
		waitForVisibility(profileHome);
		
	}

	public void userClickOnCloseButton() {
		click(closeButtonPurHis);
		
	}

	
	
	

	
	
}
