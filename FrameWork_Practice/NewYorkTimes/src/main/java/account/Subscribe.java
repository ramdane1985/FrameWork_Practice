package account;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static account.AccountElements.*;

public class Subscribe extends CommonAPI {

    @FindBy(how = How.XPATH,using = subscribeButtonXP)
    public WebElement subscribeButton;

    @FindBy(how = How.XPATH,using = subscribeValidationXP)
    public WebElement subscribeValidation;

    public void setSubscribeButton(String email){
        subscribeButton.click();
        sleepFor(3);

        String url=driver.getCurrentUrl();
        System.out.println(url);
        if (url.equalsIgnoreCase("https://www.nytimes.com/subscription?campaignId=79FKF&redirect_uri=https%3A%2F%2Fwww.nytimes.com%2F")){
            System.out.println("url got matched");
        }else{
            System.out.println("url didn't match");
        }
        String actualText=subscribeValidation.getText();
        String expectedText="Unlimited access to all the journalism we offer.";
        Assert.assertEquals(actualText,expectedText,"the text does not match");

    }
}

