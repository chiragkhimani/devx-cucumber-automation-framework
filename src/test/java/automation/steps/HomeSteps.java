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

    @When("user click on any item")
    public void userClickOnAnyItem() {
        homePage.clickOnItem();
    }
}
