package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class tc_002_login_test extends BaseClass {

    @Test(groups = {"regression","master"})
    public void verify_login(){

        HomePage hp = new HomePage(driver);
        hp.click_my_account();
        hp.click_login();

        LoginPage lp = new LoginPage(driver);
        lp.enter_e_mail(p.getProperty("email"));
        lp.enter_password(p.getProperty("pwd"));
        lp.click_login();

        MyAccountPage map = new MyAccountPage(driver);
        Assert.assertTrue(map.my_account_text_visible(),"MyAccount text is not visible");

        map.click_logout();
    }



}
