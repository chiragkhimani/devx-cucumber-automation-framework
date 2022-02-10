package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//*[contains(@id, 'remove')]")
    WebElement removeBtn;

    @FindBy(id="checkout")
    WebElement checkoutBtn;

    @FindBy(xpath="//div[@class='inventory_item_name']")
    WebElement itemName;

    public void verifyPage() {
        Assert.assertTrue("Remove button is missing from cart page", removeBtn.isDisplayed());
        Assert.assertTrue("Item name is missing from cart page page", itemName.isDisplayed());
        Assert.assertEquals("Checkout button is missing from cart page page", checkoutBtn.isDisplayed(), true);
    }

    public void clickOnCheckoutBtn() {
        checkoutBtn.click();
    }
}
