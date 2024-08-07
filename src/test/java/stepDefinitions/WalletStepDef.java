package stepDefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.WalletPage;

public class WalletStepDef {

@Then("User click My Wallet on home page")
public void user_click_my_wallet_on_home_page() {
   new WalletPage().user_click_my_wallet_on_home_page();
    
}

@Then("Verify Barcode is generated")
public void verify_barcode_is_generated() {
   
	   new WalletPage().verify_barcode_is_generated();

}

@Then("Verify Scan Rewards # is selected by default")
public void verify_scan_rewards_is_selected_by_default() {
   
	   new WalletPage().verify_scan_rewards_is_selected_by_default();

}

@Then("Verify user mobile number on barcode")
public void verify_user_mobile_number_on_barcode() {
   
	   new WalletPage().verify_user_mobile_number_on_barcode();

}

@Then("Verify numerical representation of barcode is present")
public void verify_numerical_representation_of_barcode_is_present() {
	   new WalletPage().verify_numerical_representation_of_barcode_is_present();

   
}


}
