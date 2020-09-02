package homeTest;

import base.CommonAPI;
import home.FindAGift;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindAGiftTest extends CommonAPI {
    FindAGift object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,FindAGift.class);
    }
    @Test
    public void setFindAGiftTest(){
        object.setFindAGift();
    }

}
