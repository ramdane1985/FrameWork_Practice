package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class SellClass extends CommonAPI {
    @FindBy(how = How.XPATH,using = sellClassXP)
    public WebElement sellClass;
    @FindBy(how = How.XPATH,using = sellClassValidationXP)
    public WebElement sellClassValidation;

    public void setSellClass(){
        sellClass.click();
        String actualText=sellClassValidation.getText();
        String expectedText="Sell on Amazon";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }
}
