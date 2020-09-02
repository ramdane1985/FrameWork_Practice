package homeTest;

import base.CommonAPI;
import home.SellClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SellClassTest extends CommonAPI {
    SellClass object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,SellClass.class);
    }
    @Test
    public void setSellClassTest(){
        object.setSellClass();
    }
}
