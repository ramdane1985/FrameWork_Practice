package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class  GiftCards extends CommonAPI {
    @FindBy(how = How.CSS,using = giftCardsCSS)
    public WebElement giftCards;
    @FindBy(how = How.XPATH,using = giftCardsValidationXP)
    public WebElement giftCardsValidation;

    public void setGiftCards(){
        giftCards.click();
        String actualText=giftCardsValidation.getText();
        String expectedText="Gift Cards";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

}
