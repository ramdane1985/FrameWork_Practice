package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class Registry extends CommonAPI {
    @FindBy(how = How.XPATH,using = registryXP)
    public WebElement registry;
    @FindBy(how = How.XPATH,using = registryVerificationXP)
    public WebElement registryVerification;

    public void setRegistry(){
        registry.click();
        String actualText=registryVerification.getText();
        String expectedText="Registry discounts, rewards and bonus gifts";
        Assert.assertEquals(actualText,expectedText);

    }
}
