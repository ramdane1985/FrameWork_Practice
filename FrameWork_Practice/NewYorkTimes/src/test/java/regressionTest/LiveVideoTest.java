package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.LiveVideo;

import java.util.Objects;

public class LiveVideoTest extends CommonAPI {

    LiveVideo object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,LiveVideo.class);
    }
    @Test(priority = 43)

    public void setLiveVideoTest(){
        object.setLiveVideo();
    }

    @Test(priority = 44)
    public void setLiveVideoValidationTest(){
        setLiveVideoTest();
        object.setLiveVideoValidation();
    }
}
