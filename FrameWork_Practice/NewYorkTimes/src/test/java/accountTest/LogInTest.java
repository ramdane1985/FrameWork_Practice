package accountTest;

import account.LogIn;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends CommonAPI {
    LogIn object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,LogIn.class);
    }
    @Test
    public void setLoginButtonTest(){
        object.setLoginButton("ram@selenium.com","Abcdef@");
    }

}
