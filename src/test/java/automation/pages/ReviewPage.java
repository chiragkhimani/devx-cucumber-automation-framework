package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends  BasePage{

    @FindBy(xpath = "//div[text()='Payment Information:']/following-sibling::div[@class='summary_value_label'][1]")
    WebElement paymentInfo;

    @FindBy(xpath="//div[@class='inventory_item_name']")
    WebElement itemName;

    @FindBy(id="finish")
    WebElement finishBtn;


    public void verifyPage() {
        Assert.assertTrue("Payment info is missing from review page", paymentInfo.isDisplayed());
        Assert.assertTrue("item name is missing from cart review page", itemName.isDisplayed());
        Assert.assertEquals("Finish button is missing from review page", finishBtn.isDisplayed(), true);
    }

    public void clickOnFinishBtn() {
        finishBtn.click();
        driver.navigate().refresh();
    }
}
