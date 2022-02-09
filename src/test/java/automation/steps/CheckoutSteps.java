package automation.steps;

import automation.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verify user is on checkout page")
    public void verifyUserIsOnCheckoutPage() {
        checkoutPage.verifyPage();
    }

    @When("user fill all details on checkout page")
    public void userFillAllDetailsOnCheckoutPage() {
        checkoutPage.fillCheckOutDetails();
    }

    @And("click on continue button on checkout page")
    public void clickOnContinueButtonOnCheckoutPage() {
        checkoutPage.clickOnContinueBtn();
    }
}
