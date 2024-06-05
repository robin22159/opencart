package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

//    Locators


    @FindBy(xpath="//span[normalize-space()='My Account']")
    WebElement my_account;
    @FindBy(xpath="//a[normalize-space()='Register']")
    WebElement register;

    @FindBy(xpath="//a[normalize-space()='Login']")
    WebElement login;

//    Actions

    public void click_my_account(){

        my_account.click();
    }

    public void click_register(){
        register.click();

    }

    public void click_login(){
        login.click();

    }


}
