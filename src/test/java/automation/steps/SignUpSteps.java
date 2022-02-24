package automation.steps;

import automation.pages.SignUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {

    SignUpPage signUpPage = new SignUpPage();

    @Then("verify sign up page is displayed")
    public void verify_sign_up_page_is_displayed() {
        signUpPage.verifyPage();
    }
    @When("user fill all details on sign up page")
    public void user_fill_all_details_on_sign_up_page() {
        signUpPage.fillSignUpDetails();
    }
    @When("click on next button")
    public void click_on_next_button() {
        signUpPage.clickOnNextBtn();
    }

}
