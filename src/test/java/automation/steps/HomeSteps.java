package automation.steps;

import automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        homePage.verifyPage();
    }

    @When("user click on item {string}")
    public void userClickOnAnyItem(String itemName) {
        homePage.clickOnItem(itemName);
    }

    @When("user click on add to cart button for item {string}")
    public void user_click_on_add_to_cart_button_for_item(String itemName) {
        homePage.clickonAddToCartForSpecificItem(itemName);
    }
}
