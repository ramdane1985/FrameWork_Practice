package homePageTest;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends CommonAPI {

    HomePage object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void setSearchFieldTest() throws InterruptedException, IOException {
        object.setSearchField();
    }
}
