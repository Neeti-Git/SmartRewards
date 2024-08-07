package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import Utilites.ExcelData;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PaymentMethodsPage extends BasePage {
	
	@AndroidFindBy(accessibility = "Payment Methods")
	private WebElement paymentMethods;
	
	@AndroidFindBy(accessibility = ", Add a new payment method")
	private WebElement addNewPaymentButton;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"********\"]/android.view.ViewGroup]")
	private WebElement bankAccount;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add\"]")
	private WebElement addBtn;
	
	@AndroidFindBy(xpath = "//test")
	private WebElement cardNumber;
	
	@AndroidFindBy(xpath = "//test")
	private WebElement cardUserName;
	
	@AndroidFindBy(xpath = "//test")
	private WebElement expDate;
	
	@AndroidFindBy(xpath = "//test")
	private WebElement securityCode;
	
	@AndroidFindBy(xpath = "//test")
	private WebElement zipCode;
	
	@AndroidFindBy(xpath = "//test")
	private WebElement confirmCardButton;
	
	@AndroidFindBy(xpath = "//test")
	private WebElement successMessage;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add new payment method\"]")
	private WebElement addNewPayment;
	
	
	public void userClickOnPaymentMethods() {
		click(paymentMethods);
		
	}

	public void userRemoveAllTheCreditCards() {
		System.out.println(bankAccount);
		
	}

	public void userClickOnAddNewPaymentMethod() {
		click(addNewPaymentButton);
		
	}

	public void userClickOnAddButtonAfterCreditCard() {
		click(addBtn);
		
	}

	public void userEntersTheCreditCardDetails() throws IOException {
		
		sendKeys(cardNumber, ExcelData.getExcelData("CreditCardDetails", "Card Number", "value"));
		sendKeys(cardUserName, ExcelData.getExcelData("CreditCardDetails", "Name", "value"));
		sendKeys(expDate, ExcelData.getExcelData("CreditCardDetails", "Exp Date", "value"));
		sendKeys(securityCode, ExcelData.getExcelData("CreditCardDetails", "Security Code", "value"));
		sendKeys(zipCode, ExcelData.getExcelData("CreditCardDetails", "Zip", "value"));
	}

	public void userClickOnConfirmCard() {
		click(confirmCardButton);
		
	}

	public void userVerifiesCardIsAddedSuccessfullyMessage() {
		waitForVisibility(successMessage);
		
	}

	public void useVerifiesAddNewPaymentMethodScreen() {
		click(addNewPayment);
		
	}

	public void userPressMobileBackButton() {
		pressMobileBackButton();
		
	}

	public void userVerifiesCardIsPresentInManagePayment() {
		// TODO Auto-generated method stub
		
	}

}
