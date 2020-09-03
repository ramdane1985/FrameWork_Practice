package regressionTest;

import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.BrokenLinks;
import reporting.TestLogger;

import java.io.IOException;


public class BrokenLinksTest extends CommonAPI {


    BrokenLinks brokenlinks;

    String url = "https://www.ebay.com";
    @BeforeMethod
    public void init(){
        brokenlinks = PageFactory.initElements(driver, BrokenLinks.class);
        driver.get(url);
    }

    @Test(priority = 40)
    public void ebayLinksActivlinksTest() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brokenlinks.linksbroken();
    }
}
