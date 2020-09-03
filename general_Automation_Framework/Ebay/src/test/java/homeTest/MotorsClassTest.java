package homeTest;

import base.CommonAPI;
import home.MotorsClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MotorsClassTest extends CommonAPI {
    MotorsClass obj;
    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver, MotorsClass.class);
    }


    @Test
    public void setBoatTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setBoat();
    }
    @Test
    public void setBoatVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setBoatTest();
        obj.setBoatVerification();
    }
    @Test
    public void setClassicTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setClassic();
    }
    @Test
    public void setClassicVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setClassicTest();
        obj.setClassicVerification();
    }
    @Test
    public void setMotorCyclesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setMotorCycles();
    }
    @Test
    public void setMotorCycleVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setMotorCyclesTest();
        obj.setMotorCycleVerification();
    }
}
