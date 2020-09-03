package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeElements.*;

public class HomeClass extends CommonAPI {
    @FindBy(how = How.XPATH,using = logoSignXP)
    public WebElement logoSign;


    //Action Method
    public void setLogoSign(){
        logoSign.click();
        sleepFor(2);
    }
    //validation method
    public void setLogoSignValidation(){
        String actualText= driver.getCurrentUrl();
        String expectedText="https://www.ebay.com/";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);
    }

}
