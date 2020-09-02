package homeTest;

import base.CommonAPI;
import home.Account;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest extends CommonAPI {

    Account object;

    @BeforeMethod

    public void init(){
        object= PageFactory.initElements(driver,Account.class);
    }
   @Test
    public void SetAccountLogInTest(){
        object.SetAccountLogIn("ram@selenium.com");
   }

}
