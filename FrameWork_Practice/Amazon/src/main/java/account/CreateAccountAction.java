package account;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static account.SigningElements.*;

public class CreateAccountAction extends CommonAPI {

    @FindBy(how = How.XPATH, using = signingButtonXP)
    public WebElement signing;


    @FindBy(how = How.XPATH,using = SigningActionXP)
    public WebElement signingAction;

    @FindBy(how = How.XPATH,using =userFieldlXP)
    public WebElement field;

    @FindBy(how = How.XPATH,using = continueButtonXP)
    public WebElement continueButton;

    @FindBy(how = How.CLASS_NAME,using = continueButtonValidation)
    public WebElement validationText;


    public void setSigningAction(){
          Actions actions=new Actions(driver);
        actions.moveToElement(signing).build().perform();
        sleepFor(2);
        signingAction.click();
        sleepFor(3);
    }
    public void setField(String Email){
        field.sendKeys(Email);
        sleepFor(3);
    }
    public void setContinueButton(){
        continueButton.click();
        sleepFor(2);
    }
    public void setValidationText(){
        String actualResult="There was a problem";
        String expectedResult=validationText.getText();
        Assert.assertEquals(actualResult,expectedResult,"text doesn't match");

    }

}

