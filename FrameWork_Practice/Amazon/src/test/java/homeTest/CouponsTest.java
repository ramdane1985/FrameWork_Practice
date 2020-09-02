package homeTest;

import base.CommonAPI;
import home.Coupons;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CouponsTest extends CommonAPI {
    Coupons object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,Coupons.class);
    }
    @Test
    public void setCouponsTest(){
        object.setCoupons();
    }
}
