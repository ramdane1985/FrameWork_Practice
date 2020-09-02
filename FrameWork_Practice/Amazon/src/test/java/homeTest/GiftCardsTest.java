package homeTest;

import base.CommonAPI;
import home.GiftCards;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardsTest extends CommonAPI {

    GiftCards object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,GiftCards.class);
    }
    @Test
    public void setGiftCardsTest(){
        object.setGiftCards();
    }
}
