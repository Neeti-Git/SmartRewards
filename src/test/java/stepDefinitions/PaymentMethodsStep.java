package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import pages.PaymentMethodsPage;
import pages.PurchaseHistoryPage;

public class PaymentMethodsStep {

	@Then("User click on Payment Methods")
	public void user_click_on_payment_methods() {
		new PaymentMethodsPage().userClickOnPaymentMethods();
	}

	@Then("User remove all the credit cards")
	public void user_remove_all_the_credit_cards() {
		new PaymentMethodsPage().userRemoveAllTheCreditCards();
	}

	@Then("User click on Add a new Payment Method")
	public void user_click_on_add_a_new_payment_method() {
		new PaymentMethodsPage().userClickOnAddNewPaymentMethod();
	}

	@Then("User click on Add button after Credit card")
	public void user_click_on_add_button_after_credit_card() {
		new PaymentMethodsPage().userClickOnAddButtonAfterCreditCard();
	}

	@Then("User enters the credit card details")
	public void user_enters_the_credit_card_details() throws IOException {
		new PaymentMethodsPage().userEntersTheCreditCardDetails();
	}

	@Then("User click on confirm card")
	public void user_click_on_confirm_card() {
		new PaymentMethodsPage().userClickOnConfirmCard();
	}

	@Then("User verifies card is added successfully message")
	public void user_verifies_card_is_added_successfully_message() {
		new PaymentMethodsPage().userVerifiesCardIsAddedSuccessfullyMessage();
	}

	@Then("Use verifies Add new payment method screen")
	public void use_verifies_add_new_payment_method_screen() {
		new PaymentMethodsPage().useVerifiesAddNewPaymentMethodScreen();
	}

	@Then("User press mobile back button")
	public void user_press_mobile_back_button() {
		new PaymentMethodsPage().userPressMobileBackButton();
	}

	@Then("user verifies card is present in Manage Payment")
	public void user_verifies_card_is_present_in_manage_pyment() {
		new PaymentMethodsPage().userVerifiesCardIsPresentInManagePayment();
	}
	
}
