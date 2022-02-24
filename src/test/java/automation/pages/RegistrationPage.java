package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends  BasePage{

    @FindBy(id = "address")
    WebElement address;

    @FindBy(id = "locality")
    WebElement locality;

    @FindBy(id = "region")
    WebElement region;

    @FindBy(id = "postalCode")
    WebElement postalCode;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "homePhone")
    WebElement homePhone;

    @FindBy(id = "workPhone")
    WebElement workPhone;

    @FindBy(id = "mobilePhone")
    WebElement mobilePhone;

    @FindBy(id = "agree-terms")
    WebElement agreeTerms;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement registerBtn;


    @Override
    public void verifyPage() {
        Assert.assertTrue("Register button is missing from registration page", registerBtn.isDisplayed());
        Assert.assertTrue("Address input is missing from registration page", address.isDisplayed());
    }

    public void fillAllRegistrationDetails() {
        address.sendKeys("Test");
        locality.sendKeys("Test");
        region.sendKeys("Test");
        postalCode.sendKeys("34343");
        country.sendKeys("USA");
        homePhone.sendKeys("111111111");
        workPhone.sendKeys("111111111");
        mobilePhone.sendKeys("111111111");
        agreeTerms.click();
    }

    public void clickOnRegisterBtn() {
        registerBtn.click();
    }
}
