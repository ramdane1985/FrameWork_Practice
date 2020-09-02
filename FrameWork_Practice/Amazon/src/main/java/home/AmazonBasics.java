package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class AmazonBasics extends CommonAPI {

    @FindBy(how = How.XPATH,using = amazonBasicsXP)
    public WebElement amazonBasics;
    @FindBy(how = How.XPATH,using = amazonBasicsValidationXP)
    public WebElement amazonBasicsValidation;

    public void setAmazonBasics(){
        amazonBasics.click();
        String actualText=amazonBasicsValidation.getText();
        String expectedText="AmazonBasics";
        Assert.assertEquals(actualText,expectedText,"Text is not validated");
    }
}
