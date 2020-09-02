package homeTest;

import base.CommonAPI;
import home.ShoppingCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCardTest extends CommonAPI {
    ShoppingCart object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,ShoppingCart.class);
    }
    @Test
    public void setShoppingCardTest(){
        object.setShoppingCard();
    }
}
