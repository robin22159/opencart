package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegisterPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class tc_001_account_registration extends BaseClass {

    @Test(groups = {"sanity","master"})
    public void verify_account_registration() throws InterruptedException {

        logger.info("**** Started tc_001_account_registration *****");

        HomePage hp = new HomePage(driver);
        logger.info("clicked on my account");
        hp.click_my_account();
        logger.info("clicked on register");
        hp.click_register();
        logger.info("Entering user data");
        AccountRegisterPage arp = new AccountRegisterPage(driver);
        arp.register_account_visible();
        arp.set_first_name(random_estring());
        arp.set_last_name(random_estring());
        arp.set_e_mail(random_estring()+"@gmail.com");
        arp.set_password(random_alphanumeric()+"!");
        logger.info("clicked on privacy policy");
        arp.click_privacy_policy();
        logger.info("clicked on continue button");
        arp.click_continue_btn();
        logger.info("validating confirmation message");
        boolean confirmmsg = arp.confirmation_text_visible();
        Assert.assertTrue(confirmmsg,"message is not displayed");

        logger.info("***** Finished tc_001_account_registration *****");
    }

}
