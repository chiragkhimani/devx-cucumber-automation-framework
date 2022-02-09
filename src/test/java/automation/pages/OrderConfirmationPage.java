package automation.pages;

import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends  BasePage{

    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement orderConfirmationTitle;

    public void verifyPage() {
        Assert.assertTrue("Order confirmation title is missing from order confirmation page", orderConfirmationTitle.isDisplayed());
        String actText = orderConfirmationTitle.getText();
        String expText = PropertyReader.getProperty("order.confirmation.title");
        Assert.assertTrue("Expected confirmation text is "+expText+" : Actual  "+actText, actText.equals(expText));
    }
}
