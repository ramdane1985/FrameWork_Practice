package homeTest;

import base.CommonAPI;
import home.SearchBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBoxTest extends CommonAPI {
    SearchBox search;
    @BeforeMethod
    public void init(){ search= PageFactory.initElements(driver,SearchBox.class);}

    @Test(priority = 48)
    public void setSearchBoxTest(){
        search.setSearchBox();

    }

}
