package automation.steps;

import automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();
    }

    @When("user do login")
    public void user_do_login() {
        loginPage.doLogin();
    }

    @Given("user open digital bank website")
    public void user_open_digital_bank_website() {
        loginPage.openDigitalBankWebsite();
    }

    @When("user click on sign up button")
    public void user_click_on_sign_up_button() {
        loginPage.clickOnSignUpBtn();
    }

    @Then("verify registration success message")
    public void verify_registration_success_message() {
        loginPage.verifyRegistrationSuccessMsg();
    }



}
