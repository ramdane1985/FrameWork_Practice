package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class FindAGift extends CommonAPI {
    @FindBy(how = How.CSS, using = findAGiftCSS)
    public WebElement findAGift;
    @FindBy(how = How.XPATH, using = findAGiftVerificationXP)
    public WebElement findAGiftVerification;

    public void setFindAGift(){
        findAGift.click();
        String actualText=findAGiftVerification.getText();
        String expectedText="Who are you shopping for?";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
}