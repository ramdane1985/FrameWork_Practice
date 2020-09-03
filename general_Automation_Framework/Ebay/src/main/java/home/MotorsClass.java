package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeElements.*;

public class MotorsClass extends CommonAPI {

    @FindBy(how = How.CSS,using = motorsCSS)
    public WebElement motors;

    @FindBy(how = How.XPATH,using = boatXP)
    public WebElement boat;

    @FindBy(how = How.XPATH,using = boatVerificationXP)
    public WebElement boatVerification;

    @FindBy(how = How.XPATH,using = classicXP)
    public WebElement classic;
    @FindBy(how = How.XPATH,using = motorCyclesXP)
    public WebElement motorCycles;

    @FindBy(how = How.XPATH,using = classicVerificationXP)
    public WebElement classicVerification;
    @FindBy(how = How.XPATH,using = motorCycleVerificationXP)
    public WebElement motorCycleVerification;


    public void setBoat(){
        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();
        sleepFor(3);
        boat.click();
        sleepFor(3);
    }
    public void setBoatVerification(){
        String actualText=boatVerification.getText();
        String expectedText="Boats";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }
    public void setClassic(){
        Actions actions=new Actions(driver);
        actions.moveToElement(motors).build().perform();
        sleepFor(3);
        classic.click();
        sleepFor(3);
    }
    public void setClassicVerification(){
        String actualText=classicVerification.getText();
        String expectedText="Classic Cars";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setMotorCycles(){
        Actions actions =new Actions(driver);
        actions.moveToElement(motors).build().perform();
        sleepFor(3);
        motorCycles.click();
        sleepFor(3);
    }
    public void setMotorCycleVerification(){
        String actualText=motorCycleVerification.getText();
        String expectedText="Motorcycles";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

}
