package homeTest;

import base.CommonAPI;
import home.TodayDeal;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TodayDealTest extends CommonAPI {
    TodayDeal object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,TodayDeal.class);
    }
    @Test
    public void setTodayDealTest(){
        object.setTodayDeal();
    }



}
