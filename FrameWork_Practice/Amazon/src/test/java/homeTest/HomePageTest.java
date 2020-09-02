package homeTest;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    HomePage homePage;

    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @Test(priority = 17)
    public void setHomePageTest(){
        homePage.setLogoSign();
    }





}
