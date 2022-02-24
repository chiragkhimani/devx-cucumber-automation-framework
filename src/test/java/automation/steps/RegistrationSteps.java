package automation.steps;

import automation.pages.RegistrationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage();

    @Then("verify register page is displayed")
    public void verify_register_page_is_displayed() {
        registrationPage.verifyPage();
    }
    @When("user fill all details on register page")
    public void user_fill_all_details_on_register_page() {
        registrationPage.fillAllRegistrationDetails();
    }
    @When("click on register button")
    public void click_on_register_button() {
        registrationPage.clickOnRegisterBtn();
    }
}
