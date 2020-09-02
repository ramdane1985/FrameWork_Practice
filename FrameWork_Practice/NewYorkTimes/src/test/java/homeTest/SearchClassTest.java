package homeTest;

import base.CommonAPI;
import home.SearchClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchClassTest extends CommonAPI {

    SearchClass object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,SearchClass.class);

    }
    @Test
    public void setSearchButtonTest(){
        object.setSearchButton();
    }
}
