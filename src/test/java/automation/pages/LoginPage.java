package automation.pages;

import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement userNameEle;

    @FindBy(id = "password")
    WebElement passwordEle;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//div[contains(@class,'register-link')]//a")
    WebElement signUpLink;

    @FindBy(xpath = "//span[@class='badge badge-pill badge-success']")
    WebElement registrationSuccessMsg;

    public void doLogin() {
        userNameEle.sendKeys(PropertyReader.getProperty("login.username"));
        passwordEle.sendKeys(PropertyReader.getProperty("login.password"));
        loginBtn.click();
    }

    public void verifyPage() {
        Assert.assertTrue("Username input is missing from login page", userNameEle.isDisplayed());
        Assert.assertTrue("Password input is missing from login page", passwordEle.isDisplayed());
    }

    public void openWebsite() {
        driver.get(PropertyReader.getProperty("app.url"));
    }

    public void openDigitalBankWebsite() {
        driver.get(PropertyReader.getProperty("digitalbank.url"));
    }

    public void clickOnSignUpBtn() {
        signUpLink.click();
    }

    public void verifyRegistrationSuccessMsg() {
        Assert.assertTrue("Registration success message is not displayed", registrationSuccessMsg.isDisplayed());
    }
}
