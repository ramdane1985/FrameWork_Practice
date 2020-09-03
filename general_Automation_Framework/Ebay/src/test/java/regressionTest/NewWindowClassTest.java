package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.NewWindowClass;
import reporting.TestLogger;

import java.util.Objects;

public class NewWindowClassTest extends CommonAPI {
    NewWindowClass obj;
    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver,NewWindowClass.class);
    }
    @Test
    public void newWindowTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.newWindow();
    }
    @Test
    public void newWindowVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newWindowTest();
        obj.newWindowVerification();
    }
}
