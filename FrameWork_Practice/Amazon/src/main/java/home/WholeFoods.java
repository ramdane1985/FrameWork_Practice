package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class WholeFoods extends CommonAPI {

    @FindBy(how = How.CSS,using = wholeFoodsCSS)
    public WebElement wholefoods;
    @FindBy(how = How.XPATH,using = wholeFoodsVerificationXP)
    public WebElement wholeFoodsVerification;

    public void setWholefoods(){
        wholefoods.click();
        String actualText=wholeFoodsVerification.getText();
        String expectedText="Popular near you";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);

    }
}
