package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.BrokenLinks;

import java.io.IOException;

public class BrokensLinksTest extends CommonAPI {

    BrokenLinks brokenlinks;

    String url = "https://www.newyorktimes.com";
    @BeforeMethod
    public void init(){
        brokenlinks = PageFactory.initElements(driver, BrokenLinks.class);
        driver.get(url);
    }

    @Test(priority = 40)
    public void NewYorkTimesLinksActivlinksTest() throws IOException {
        brokenlinks.linksbroken();
    }
}
