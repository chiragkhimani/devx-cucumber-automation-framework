package automation.pages;

import automation.utils.CommonMethods;
import automation.utils.Constant;
import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

    @FindBy(id = "title")
    WebElement titleDropdown;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//input[@value='M']")
    WebElement genderMale;

    @FindBy(id = "dob")
    WebElement dob;

    @FindBy(id = "ssn")
    WebElement ssn;

    @FindBy(id = "emailAddress")
    WebElement emailAddress;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;


    @Override
    public void verifyPage() {
        Assert.assertTrue("Title dropdown is missing from sign up page", titleDropdown.isDisplayed());
        Assert.assertTrue("first name input is missing from sign up page", firstName.isDisplayed());
    }

    public void fillSignUpDetails() {

        String titleValue = PropertyReader.getProperty("signup.title");
        Constant.inputDataOnUI.put("title",titleValue);
        Select dropdownSelect = new Select(titleDropdown);
        dropdownSelect.selectByVisibleText(titleValue);

        String firstNameValue = PropertyReader.getProperty("signup.firstname");
        Constant.inputDataOnUI.put("firstName",firstNameValue);
        firstName.sendKeys(firstNameValue);

        String lastNameValue = PropertyReader.getProperty("signup.lastname");
        Constant.inputDataOnUI.put("lastname",lastNameValue);
        lastName.sendKeys(lastNameValue);

        genderMale.click();
        Constant.inputDataOnUI.put("gender","M");

        String dobValue = PropertyReader.getProperty("signup.dob");
        Constant.inputDataOnUI.put("dob",dobValue);
        dob.sendKeys(dobValue);

        String ssnValue = CommonMethods.generateRandomSSN();
        Constant.inputDataOnUI.put("ssn",ssnValue);
        ssn.sendKeys(ssnValue);

        String emailValue = PropertyReader.getProperty("signup.email.prefix")+CommonMethods.generateRandomSSN()+"@gmail.com";
        Constant.inputDataOnUI.put("email",emailValue);
        emailAddress.sendKeys(emailValue);

        password.sendKeys(PropertyReader.getProperty("signup.password"));
        confirmPassword.sendKeys(PropertyReader.getProperty("signup.password"));
    }

    public void clickOnNextBtn() {
        submitBtn.click();
    }
}
