package regression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static regression.RegressionElements.*;

public class NewWindowClass extends CommonAPI {
    @FindBy(how = How.CSS,using = fashionButtonCSS)
    public WebElement fashionButton;
    @FindBy(how = How.XPATH,using = fashionVerificationXP)
    public WebElement fashionVerification;


    public void newWindow(){
        Actions actions =new Actions(driver);
        actions.moveToElement(fashionButton).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        sleepFor(5);
    }
    public void newWindowVerification(){
        String actualText=fashionVerification.getText();
        String expectedText="Fashion";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
}
