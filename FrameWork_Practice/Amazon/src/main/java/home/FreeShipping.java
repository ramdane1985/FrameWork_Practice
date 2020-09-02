package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class FreeShipping extends CommonAPI {
    @FindBy(how = How.CSS,using = freeShippingCSS)
    public WebElement freeShipping;
    @FindBy(how = How.CSS,using = startShoppingButtonXP)
    public WebElement startShoppingButton;
    @FindBy(how = How.CSS,using = bestSellerButtonCSS)
    public WebElement bestSellerButton;
    @FindBy(how = How.CLASS_NAME,using = validationClass)
    public WebElement validation;

    public void setFreeShipping(){
        freeShipping.click();
        startShoppingButton.click();
        bestSellerButton.click();
        String actualText=validation.getText();
        String expectedText="Amazon Best Sellers";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);
    }

}
