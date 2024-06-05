package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

//    Locators

    @FindBy(xpath="//h2[text()='My Account']")
    WebElement my_account;
    @FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
    WebElement logout;

//    Actions

    public boolean my_account_text_visible(){
        try {
            return my_account.isDisplayed();
        }
        catch (Exception e){
            return false;
        }

    }
    public void click_logout(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", logout);
    }
}
