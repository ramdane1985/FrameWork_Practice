package homeTest;

import base.CommonAPI;
import home.AmazonBasics;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonBasicsTest extends CommonAPI {
    AmazonBasics object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,AmazonBasics.class);
    }
    @Test
    public void setAmazonBasicsTest(){
        object.setAmazonBasics();
    }
}
