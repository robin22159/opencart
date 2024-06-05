package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class tc_003_login_ddt extends BaseClass {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "LoginData",groups = {"ddt", "master"})
    public void verify_login_ddt(String email, String password, String exp){
        try {

            HomePage hp = new HomePage(driver);
            hp.click_my_account();
            hp.click_login();

            LoginPage lp = new LoginPage(driver);
            lp.enter_e_mail(email);
            lp.enter_password(password);
            lp.click_login();

            MyAccountPage map = new MyAccountPage(driver);

            if (exp.equalsIgnoreCase("Valid")) {
                if (map.my_account_text_visible() == true) {
                    map.click_logout();
                    Assert.assertTrue(true);
                } else {
                    Assert.assertTrue(false);
                }
            }

            if (exp.equalsIgnoreCase("Invalid")) {
                if (map.my_account_text_visible() == false) {
                    Assert.assertTrue(true);
                } else {
                    map.click_logout();
                    Assert.assertTrue(false);
                }
            }

        }
        catch (Exception e){
            Assert.fail();
        }



    }

}
