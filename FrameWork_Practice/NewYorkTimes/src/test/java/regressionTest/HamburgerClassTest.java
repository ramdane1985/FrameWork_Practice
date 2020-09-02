package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HamburgerClass;



public class HamburgerClassTest extends CommonAPI {
    HamburgerClass object;

    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,HamburgerClass.class);
    }
    @Test(priority = 41)

    public void setHamburgerButtonTest(){
        object.setHamburgerButton();
    }

    @Test(priority = 42)
    public void setWorldButtonTest(){
        setHamburgerButtonTest();
        object.setWorldButton();
    }
}
