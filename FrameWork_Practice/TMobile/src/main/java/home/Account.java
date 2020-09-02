package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElement.*;

public class Account extends CommonAPI {
    @FindBy(how = How.ID,using = myAccountButtonID)
    public WebElement accountButton;
    @FindBy(how = How.XPATH,using = signingButtonXP)
    public WebElement signingButton;
    @FindBy(how = How.ID,using = emailFieldID)
    public WebElement emailField;
    @FindBy(how = How.ID,using = nextButtonID)
    public WebElement nextButton;
    @FindBy(how = How.ID,using = validationCSS)
    public WebElement validation;

    public void SetAccountLogIn(String email){
        accountButton.click();
        signingButton.click();
        sleepFor(3);
        emailField.sendKeys(email);
        nextButton.click();
        String actualText=validation.getText();
        String expectedText="Sorry, something you entered does not match our records. Please try again.";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);

    }






}
