package homeTest;

import base.CommonAPI;
import home.BestSeller;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BestSellerTest extends CommonAPI {

    BestSeller bestSeller;
    @BeforeMethod
    public void init(){
        bestSeller= PageFactory.initElements(driver,BestSeller.class);

    }

    @Test(priority = 14)
    public void setBestSellerTest(){
        bestSeller.setbestSellerButton();

    }
    @Test(priority = 15)
    public void setBestsellervalidationTest(){
        bestSeller.setBestsellervalidation();
    }
    @Test(priority = 16)
    public void testBabyTest(){
        bestSeller.setBaby();
    }


}
