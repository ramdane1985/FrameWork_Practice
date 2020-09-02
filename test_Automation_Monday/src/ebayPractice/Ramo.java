package ebayPractice;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ramo extends SearchBox{

    djafar jeff;

    @BeforeMethod
    public void ini(){
        jeff = PageFactory.initElements(driver,djafar.class);
    }


    @Test
    public void setSearch(){
        jeff.search("iphone11");
    }


}
