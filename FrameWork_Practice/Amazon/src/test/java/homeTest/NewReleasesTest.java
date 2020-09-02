package homeTest;

import base.CommonAPI;
import home.NewReleases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewReleasesTest extends CommonAPI {

    NewReleases object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,NewReleases.class);
    }

    @Test
    public void setNewReleaseTest(){
        object.setNewRelease();
    }
}
