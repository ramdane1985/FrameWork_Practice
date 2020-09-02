package homeTest;

import base.CommonAPI;
import home.Registry;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistryTest extends CommonAPI {
    Registry object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,Registry.class);
    }
    @Test
    public void setRegistryTest(){
        object.setRegistry();
    }
}
