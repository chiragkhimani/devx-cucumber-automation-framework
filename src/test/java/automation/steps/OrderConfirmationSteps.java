package automation.steps;

import automation.pages.OrderConfirmationPage;
import io.cucumber.java.en.Then;

public class OrderConfirmationSteps {

    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();

    @Then("verify user is on order confirmation page")
    public void verifyUserIsOnOrderConfirmationPage() {
        orderConfirmationPage.verifyPage();
    }
}
