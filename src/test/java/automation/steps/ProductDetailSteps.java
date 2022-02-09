package automation.steps;

import automation.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailSteps {

    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Then("verify user is on product detail page")
    public void verifyUserIsOnProductDetailPage() {
        productDetailsPage.verifyPage();
    }

    @When("user click on add to cart button")
    public void userClickOnAddToCartButton() {
        productDetailsPage.clickOnAddToCartBtn();
    }

    @And("click on cart icon")
    public void clickOnCartIcon() {
        productDetailsPage.clickOnCartIcon();
    }
}
