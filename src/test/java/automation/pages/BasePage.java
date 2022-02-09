package automation.pages;

import automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebDriver driver;

    public abstract void verifyPage();

    BasePage(){
        driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }

}
