package account;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static account.AccountElements.*;

public class LogIn extends CommonAPI {

    @FindBy(how = How.XPATH,using = LogInButtonXP)
    public WebElement loginButton;
    @FindBy(how = How.XPATH,using = emailFieldXP)
    public WebElement emailField;
    @FindBy(how = How.XPATH,using = passWordFieldXP)
    public WebElement passWord;
    @FindBy(how = How.XPATH,using = logInConfirmXP)
    public WebElement logInConfirm;
    @FindBy(how = How.XPATH,using = logInValidationXP)
    public WebElement logInvalidation;


    public void setLoginButton(String email,String password) {
        loginButton.click();
        emailField.sendKeys(email);
        passWord.sendKeys(password);
        logInConfirm.click();
        String actualText=logInvalidation.getText();
        String expectedText="The email address and password you entered don't match any NYTimes account. Please try again.";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);
    }

}

