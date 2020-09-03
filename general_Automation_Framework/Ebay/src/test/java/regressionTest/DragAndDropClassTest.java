package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.DragAndDropClass;
import reporting.TestLogger;

public class DragAndDropClassTest extends CommonAPI {
    DragAndDropClass obj;

    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver,DragAndDropClass.class);
    }
    @Test
    public void setDragAndDropsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setDragAndDrops();
    }
    @Test
    public void setDragAndDropsValidationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setDragAndDropsTest();
        obj.setDragAndDropsValidation();
    }
}
