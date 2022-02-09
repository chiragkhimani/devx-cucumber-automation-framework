package automation.pages;

import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends  BasePage{

    @FindBy(id="first-name")
    WebElement firstName;

    @FindBy(id="last-name")
    WebElement lastName;

    @FindBy(id="postal-code")
    WebElement zipCode;

    @FindBy(id="continue")
    WebElement continueBtn;

    public void fillCheckOutDetails() {
        firstName.sendKeys(PropertyReader.getProperty("checkout.firstname"));
        lastName.sendKeys(PropertyReader.getProperty("checkout.lastname"));
        zipCode.sendKeys(PropertyReader.getProperty("checkout.zipcode"));
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void verifyPage() {
        Assert.assertTrue( "First name is missing from checkout page", firstName.isDisplayed());
        Assert.assertTrue("last name is missing from cart checkout page",lastName.isDisplayed());
        Assert.assertEquals("Zip code is missing from checkout page", zipCode.isDisplayed(), true);
    }
}
