package homeTest;

import base.CommonAPI;
import home.WholeFoods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WholeFoodsTest extends CommonAPI {
    WholeFoods object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,WholeFoods.class);
    }
    @Test
    public void setWholefoodsTest(){
        object.setWholefoods();
    }
}
