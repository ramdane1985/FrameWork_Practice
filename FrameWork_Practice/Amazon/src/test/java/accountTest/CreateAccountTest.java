package accountTest;

import account.CreateAccount;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends CommonAPI {
    CreateAccount obj;
    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver,CreateAccount.class);

    }
    @Test(priority = 3)
    public void setAccountButtonTest(){
        obj.setSigning();
        obj.setAccountButton();
    }
    @Test(priority = 4)
    public void setCustomerNameTest(){
        obj.setSigning();
        obj.setAccountButton();
        obj.setCustomerName("ram");
    }
    @Test(priority = 5)
    public void setCustomerEmailTest(){
        obj.setSigning();
        obj.setAccountButton();
        obj.setCustomerName("ram");
        obj.setCustomerEmail("ram.selenium.com");

    }
    @Test(priority = 6)
    public void setPassWord1(){
        obj.setSigning();
        obj.setAccountButton();
        obj.setCustomerName("ram");
        obj.setCustomerEmail("ram.selenium.com");
        obj.setPassWord1("abcdef");
    }
    @Test(priority = 7)
    public void setPassWord2(){
        obj.setSigning();
        obj.setAccountButton();
        obj.setCustomerName("ram");
        obj.setCustomerEmail("ram.selenium.com");
        obj.setPassWord1("Abcdef@");
        obj.setPassWord2("Abcdef@");
    }
    @Test(priority = 8)
    public void setAccountTest(){
        obj.setSigning();
        obj.setAccountButton();
        obj.setCustomerName("ram");
        obj.setCustomerEmail("ram@selenium.com");
        obj.setPassWord1("Abcdef@");
        obj.setPassWord2("Abcdef@");
        obj.setAccount();
    }
    @Test(priority = 9)
    public void setVerificationEmail(){
        setAccountTest();
        obj.setVerificationEmail();
    }


}
