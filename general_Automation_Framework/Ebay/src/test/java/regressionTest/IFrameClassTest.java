package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.IFrameClass;
import reporting.TestLogger;

public class IFrameClassTest extends CommonAPI {
    IFrameClass object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,IFrameClass.class);
    }
    @Test
    public void setIFrameTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        object.setIFrame();
    }
}
