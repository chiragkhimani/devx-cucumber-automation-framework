package automation.steps;

import automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        cartPage.verifyPage();
    }

    @When("user click on checkout button")
    public void userClickOnCheckoutButton() {
        cartPage.clickOnCheckoutBtn();
    }
}
