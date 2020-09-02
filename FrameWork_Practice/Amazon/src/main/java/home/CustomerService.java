package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class CustomerService extends CommonAPI {
    @FindBy(how = How.XPATH,using = customerServiceXP)
    public WebElement customerService;
    @FindBy(how = How.XPATH,using = customerServiceVerificationXP)
    public WebElement customerServiceVerification;

    public void setCustomerService(){
        customerService.click();
        String actualText=customerServiceVerification.getText();
        String expectedText="Hello. What can we help you with?";
        Assert.assertEquals(actualText,expectedText,"text not verified");
    }
}
