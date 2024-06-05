package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    Locators

    @FindBy(xpath="//input[@id='input-email']")
    WebElement e_mail;
    @FindBy(xpath="//input[@id='input-password']")
    WebElement password;
    @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement login;

//    Actions

    public void enter_e_mail(String email){
        e_mail.sendKeys(email);
    }
    public void enter_password(String pwd){
        password.sendKeys(pwd);
    }
    public void click_login(){
        login.click();
    }



}
