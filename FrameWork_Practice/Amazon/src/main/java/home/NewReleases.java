package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class NewReleases extends CommonAPI {

    @FindBy(how = How.XPATH,using = newReleaseXP)
    public WebElement newRelease;
    @FindBy(how = How.ID,using = newReleaseVerificationID)
    public WebElement newReleaseVerification;

    public void setNewRelease(){
        newRelease.click();
        String actualText=newReleaseVerification.getText();
        String expectedText="Amazon Hot New Releases";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

}
