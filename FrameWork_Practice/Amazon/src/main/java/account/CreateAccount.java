package account;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static account.SigningElements.*;

public class CreateAccount extends CommonAPI {

    @FindBy(how = How.XPATH, using = signingButtonXP)
    public WebElement signing;

    @FindBy(how = How.ID, using = createAccountButtonID)
    public WebElement accountButton;

    @FindBy(how = How.XPATH, using = customerNameXP)
    public WebElement customerName;

    @FindBy(how = How.CSS, using = customerEmailCSS)
    public WebElement customerEmail;

    @FindBy(how = How.XPATH, using = customerPassWord1XP)
    public WebElement passWord1;

    @FindBy(how = How.CSS, using = customerPassWord2CSS)
    public WebElement passWord2;

    @FindBy(how = How.XPATH,using = amazonAccountXP)
    public WebElement account;

    @FindBy(how = How.XPATH,using = emailVerificationXP)
    public WebElement verificationEmail;



    public void setSigning() {
        signing.click();
        sleepFor(3);
    }


    public void setAccountButton() {
        accountButton.click();
        sleepFor(3);
    }

    public void setCustomerName(String name) {
        customerName.sendKeys(name);
        sleepFor(3);
    }

    public void setCustomerEmail(String email) {
        customerEmail.sendKeys(email);
        sleepFor(3);
    }

    public void setPassWord1(String pass1) {
        passWord1.sendKeys(pass1);
        sleepFor(3);
    }

    public void setPassWord2(String pass2) {
        passWord2.sendKeys(pass2);
        sleepFor(3);
    }
    public void setAccount(){
        account.click();
        sleepFor(3);
    }
    public void setVerificationEmail(){
        String actualText=verificationEmail.getText();
        String expectedText="\"Conditions of Use\"";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
}