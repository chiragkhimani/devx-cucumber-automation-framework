package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends  BasePage{

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement productTitle;

    @FindBy(xpath = "//img[@class='inventory_details_img']")
    WebElement productImage;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    WebElement addToCartBtn;

    @FindBy(xpath="//a[@class='shopping_cart_link']")
    WebElement cartLink;

    public void verifyPage() {
        Assert.assertTrue("Product Title is missing from pdp page", productTitle.isDisplayed());
        Assert.assertTrue("Product Image is missing from pdp page", productImage.isDisplayed());
        Assert.assertEquals("Add to Cart button is missing from pdp page", addToCartBtn.isDisplayed(), true);
    }

    public void clickOnAddToCartBtn() {
        addToCartBtn.click();
    }

    public void clickOnCartIcon() {
        cartLink.click();
    }
}
