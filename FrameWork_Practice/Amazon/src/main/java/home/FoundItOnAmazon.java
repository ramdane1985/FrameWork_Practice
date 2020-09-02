package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class FoundItOnAmazon extends CommonAPI {
    @FindBy(how = How.XPATH,using = foundItOnAmazonXP)
    public WebElement foundItOnAmazon;
    @FindBy(how = How.XPATH,using = foundItOnAmazonValidationXP)
    public WebElement foundItOnAmazonValidation;

    public void setFoundItOnAmazon(){
        foundItOnAmazon.click();
        String actualText=foundItOnAmazonValidation.getText();
        String expectedText="WOMEN'S FASHION";
        Assert.assertEquals(actualText,expectedText,"Text is not verified");
    }

}
