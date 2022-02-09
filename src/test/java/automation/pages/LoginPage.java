package automation.pages;

import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage{

    @FindBy(id = "user-name")
    WebElement userNameEle;

    @FindBy(id = "password")
    WebElement passwordEle;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void doLogin(){
        userNameEle.sendKeys(PropertyReader.getProperty("login.username"));
        passwordEle.sendKeys(PropertyReader.getProperty("login.password"));
        loginBtn.click();
    }

    public void verifyPage(){
        Assert.assertTrue("Username input is missing from login page", userNameEle.isDisplayed());
        Assert.assertTrue("Password input is missing from login page", passwordEle.isDisplayed());
    }

    public void openWebsite() {
        driver.get(PropertyReader.getProperty("app.url"));
    }
}
