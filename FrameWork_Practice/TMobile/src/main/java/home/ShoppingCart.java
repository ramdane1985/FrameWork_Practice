package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElement.*;

public class ShoppingCart extends CommonAPI {
    @FindBy(how = How.ID,using = shoppingCardID)
    public WebElement shoppingCard;
    @FindBy(how = How.XPATH,using = shoppingCardValidationXP)
    public WebElement shoppingCardValidation;

    public void setShoppingCard(){
        shoppingCard.click();
        String actualText=shoppingCardValidation.getText();
        String expectedText="My cart";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
        sleepFor(4);
    }
}
