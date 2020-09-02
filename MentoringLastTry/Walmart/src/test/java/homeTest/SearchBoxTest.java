package homeTest;

import base.CommonAPI;
import home.SearchBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBoxTest extends CommonAPI {
    SearchBox object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,SearchBox.class);
    }
    @Test
    public void setSearchFieldTest(){
      object.setSearchField();
    }


}

