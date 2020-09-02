package homeTest;

import base.CommonAPI;
import home.FreeShipping;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FreeShippingTest extends CommonAPI {
    FreeShipping object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,FreeShipping.class);
    }
    @Test
    public void  setFreeShippingTest(){
        object.setFreeShipping();
    }

}
