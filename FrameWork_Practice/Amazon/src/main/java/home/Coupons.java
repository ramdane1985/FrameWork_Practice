package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class Coupons extends CommonAPI {
    @FindBy(how = How.XPATH,using = couponsXP)
    public WebElement coupons;
    @FindBy(how = How.XPATH,using = couponsValidationXP)
    public WebElement couponsValidation;

    public void setCoupons(){
        coupons.click();
        String actualText=couponsValidation.getText();
        String expectedText="Amazon Coupons";
        Assert.assertEquals(actualText,expectedText,"Text doesn't math");
    }
}
