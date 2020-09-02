package accountTest;

import account.Subscribe;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubscribeTest extends CommonAPI {
    Subscribe object;
    @BeforeMethod

    public void init() {
        object = PageFactory.initElements(driver, Subscribe.class);
    }
    @Test(priority = 18)
    public void setSubscribeButtonTest(){
        object.setSubscribeButton("ram@selenium.com");


    }

}
