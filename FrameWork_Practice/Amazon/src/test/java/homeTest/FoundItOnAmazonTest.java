package homeTest;

import base.CommonAPI;
import home.FoundItOnAmazon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FoundItOnAmazonTest extends CommonAPI {
    FoundItOnAmazon object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,FoundItOnAmazon.class);
    }
    @Test
    public void setFoundItOnAmazonTest(){
        object.setFoundItOnAmazon();
    }
}
