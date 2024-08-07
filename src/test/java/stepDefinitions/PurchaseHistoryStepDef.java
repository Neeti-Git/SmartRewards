package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.PurchaseHistoryPage;

public class PurchaseHistoryStepDef {
	
	@Then("User click on Fuel up")
	public void user_click_on_fuel_up() {
	    new PurchaseHistoryPage().userClickOnFuelUp();
	}
	
	@Then("User Allow location access")
	public void user_allow_location_access() {
		new PurchaseHistoryPage().userAllowLocationAccess();
	}

	@Then("User search store number")
	public void user_search_store_number() throws InterruptedException {
		new PurchaseHistoryPage().userSearchStoreNumber();
	}

	@Then("User tap on store")
	public void user_tap_on_store() {
		new PurchaseHistoryPage().userTapOnStore();
	}

	@Then("User close the error message")
	public void user_close_the_error_message() {
		new PurchaseHistoryPage().userCloseTheErrorMessage();
	}

	@Then("User tap on pump one")
	public void user_tap_on_pump_one() {
		new PurchaseHistoryPage().userTapOnPumpOne();
	}

	@Then("User Enter the pin")
	public void user_enter_the_pin() {
		new PurchaseHistoryPage().userEnterThePin();
	}

	@Then("User tap on Confirm Payment")
	public void user_tap_on_confirm_payment() {
		new PurchaseHistoryPage().userTapOnConfirmPayment();
	}

	@Then("User verify Authorizing Screen")
	public void user_verify_authorizing_screen() {
		new PurchaseHistoryPage().userVerifyAuthorizingScreen();
	}

	@Then("User verifies the Now Fueling screen")
	public void user_verifies_the_now_fueling_screen() throws InterruptedException {
		new PurchaseHistoryPage().userVerifiesTheNowFuelingScreen();
	}

	@Then("User verifies the Payment Complete Receipt page")
	public void user_verifies_the_payment_complete_receipt_page() throws InterruptedException {
		new PurchaseHistoryPage().userVerifiesThePaymentCompleteReceiptPage();
	}

	@Then("User store the value of Ref number")
	public void user_store_the_value_of_ref_number() {
		new PurchaseHistoryPage().userStoreTheValueOfRefNumber();
	}

	@Then("User Tap on happy smiley")
	public void user_tap_on_happy_smiley() {
		new PurchaseHistoryPage().userTapOnHappySmiley();
	}

	@Then("User tap on Done button")
	public void user_tap_on_done_button() {
		new PurchaseHistoryPage().userTapOnDoneButton();
	}

	@Then("User Open the first Receipt")
	public void user_open_the_first_receipt() {
		new PurchaseHistoryPage().userOpenTheFirstReceipt();
	}

	@Then("User verifies the Receipt number")
	public void User_verifies_the_Receipt_number() {
		new PurchaseHistoryPage().UserVerifiesTheReceiptNumber();
	}
	
	@Then("User click on back button")
	public void user_click_on_back_button() {
		new PurchaseHistoryPage().userClickOnBackButton();
	}

	@Then("User verifies the Profile page")
	public void user_verifies_the_profile_page() {
		new PurchaseHistoryPage().userVerifiesTheProfilePage();
	}

	@Then("User click on close button")
	public void user_click_on_close_button() {
		new PurchaseHistoryPage().userClickOnCloseButton();
	}


}
