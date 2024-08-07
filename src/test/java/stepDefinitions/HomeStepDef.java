package stepDefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;

public class HomeStepDef {

	@Then("User copy frist name from profile info")
	public void userCopyFirstNameFromProfileInfo() {
		new HomePage().userCopyFirstNameFromProfileInfo();

	}

	@Then("User click close button from profile")
	public void userClickCloseButtonFromProfile() {
		new HomePage().userClickCloseButtonFromProfile();

	}

	@And("User verify First name of the user registered is displayed")
	public void userVerifyFirstNameOnHomePage() {
		new HomePage().userVerifyFirstNameOnHomePage();

	}

	@Then("Verify user should be able to see Your Rewards")
	public void verifyUserShouldBeAbleToSeeYourRewards() {

		new HomePage().verifyUserShouldBeAbleToSeeYourRewards();
	}

	@Then("User click View all Rewards")
	public void userClickViewAllRewards() {
		new HomePage().userClickViewAllRewards();

	}

	@Then("Verify user should be able to see all rewards")
	public void verifyUserShouldBeAbleToSeeAllRewards() {
		new HomePage().verifyUserShouldBeAbleToSeeAllRewards();

	}

	@Then("User click first offer on the list")
	public void userClickFirstOfferOnTheList() {

		new HomePage().userClickFirstOfferOnTheList();

	}

	@Then("User click close button on Rewards detail page")
	public void userClickCloseButtonOnRewardsDetailPage() {
		new HomePage().userClickCloseButtonOnRewardsDetailPage();

	}

	@Then("User click close button on Rewards listing page")
	public void userClickCloseButtonOnRewardsListingPage() {

		new HomePage().userClickCloseButtonOnRewardsListingPage();

	}

	@Then("Verify user should be able to see Store name on home page")
	public void verifyUserShouldBeAbleToSeeStoreNameOnHomePage() {
		new HomePage().verifyUserShouldBeAbleToSeeStoreNameOnHomePage();

	}

	@Then("User verify Other Ways to Save on home page")
	public void userVerifyOtherWaysToSaveOnHomePage() {

	}

	@Then("User should be able to see Carousel image")
	public void userShouldBeAbleToSeeCarouselImage() {

	}

	@Then("User click View all on Other Ways to Save on home page")
	public void userClickViewAllOnOtherWaysToSaveOnHomePage() {

	}

	@Then("User verify the Flash Sale Name")
	public void userVerifyTheFlashSaleName() {

	}

	@Then("User verify the Expiration Date")
	public void userVerifyTheExpirationDate() {

	}

	@Then("User verify the image")
	public void userVerifyTheImage() {

	}

}
