package homeTest;

import base.CommonAPI;
import home.HomeClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomeClassTest extends CommonAPI {
    HomeClass obj;
    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver,HomeClass.class);
    }
    @Test
    public void setLogoSignTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setLogoSign();
    }
    @Test
    public void setLogoSignValidationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setLogoSignTest();
        obj.setLogoSignValidation();
    }

}
