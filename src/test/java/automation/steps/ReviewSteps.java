package automation.steps;

import automation.pages.ReviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewSteps {

    ReviewPage reviewPage = new ReviewPage();

    @Then("verify user is on review page")
    public void verifyUserIsOnReviewPage() {
        reviewPage.verifyPage();
    }

    @When("user click on finish button")
    public void userClickOnFinishButton() {
        reviewPage.clickOnFinishBtn();
    }
}
