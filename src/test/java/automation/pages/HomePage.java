package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(className = "app_logo")
    WebElement homePageLogo;

    @FindBy(css = ".title")
    WebElement homePageTitle;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    String XPATH_ITEM_LINK = "//div[text()='%s']";
    String XPATH_ITEM_ADD_TO_CART_BTN ="//div[text()='%s']/ancestor::div[@class='inventory_item_description']//button";

    public void verifyPage(){
        Assert.assertTrue("Logo is missing from homepage", homePageLogo.isDisplayed());
        Assert.assertTrue("Title is missing from homepage", homePageTitle.isDisplayed());
    }

    public void clickOnBurgerMenu(){
        burgerMenu.click();
    }

    public void clickOnLogoutLink(){
        logoutLink.click();
    }

    // itemName - We're getting from feature file
    public void clickOnItem(String itemName) {
        String loc = String.format(XPATH_ITEM_LINK, itemName);
        WebElement itemLink = driver.findElement(By.xpath(loc));
        itemLink.click();
    }


    public void clickonAddToCartForSpecificItem(String itemName) {
        String loc = String.format(XPATH_ITEM_ADD_TO_CART_BTN, itemName);
        WebElement addToCartBtn = driver.findElement(By.xpath(loc));
        addToCartBtn.click();
    }
}
