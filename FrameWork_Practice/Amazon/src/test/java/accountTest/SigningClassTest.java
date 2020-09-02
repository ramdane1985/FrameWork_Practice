package accountTest;

import account.SigningClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigningClassTest extends CommonAPI {
    SigningClass object;

    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,SigningClass.class);
    }

    @Test(priority = 10)
    public void setSigningTest(){
        object.setSigning();

    }
    @Test(priority = 11)
    public void setFieldTest(){
        object.setSigning();
        object.setField("ram.selenium.com");
    }
    @Test(priority = 12)
    public void setContinueButton(){
        object.setSigning();
        object.setField("ram.selenium.com");
        object.setContinueButton();
    }
    @Test(priority = 13)
    public void setValidationText(){
        object.setSigning();
        object.setField("ram.selenium.com");
        object.setContinueButton();
        object.setValidationText();

    }

}
