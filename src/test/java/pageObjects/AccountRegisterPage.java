package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BasePage {
    public AccountRegisterPage(WebDriver driver) {
        super(driver);
    }

//    Locators

    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement register_account;
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement first_name;
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement last_name;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement e_mail;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;
    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacy_policy;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continue_btn;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement confirmation_text;

//  Actions

    public void register_account_visible() {
        register_account.isDisplayed();
    }

    public void set_first_name(String fname) {
        first_name.sendKeys(fname);
    }

    public void set_last_name(String lname) {
        last_name.sendKeys(lname);
    }

    public void set_e_mail(String mail) {
        e_mail.sendKeys(mail);
    }

    public void set_password(String pwd) {
        password.sendKeys(pwd);
    }

    public void click_privacy_policy() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", privacy_policy);
    }

    public void click_continue_btn() {
        Actions act = new Actions(driver);
        act.moveToElement(continue_btn).click().perform();
    }

    public boolean confirmation_text_visible() {
        try {
            return confirmation_text.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
