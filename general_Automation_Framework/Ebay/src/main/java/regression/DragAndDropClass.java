package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static regression.RegressionElements.*;

public class DragAndDropClass extends CommonAPI {
    @FindBy(how = How.XPATH,using = bankXP)
    public WebElement bank;
    @FindBy(how = How.XPATH,using = money5000XP)
    public WebElement money5000;
    @FindBy(how = How.XPATH,using = salesXP)
    public WebElement sales;
    @FindBy(how = How.XPATH,using = debitSideAccountXP)
    public WebElement debitSideAccount;
    @FindBy(how = How.XPATH,using = debitSideAmountXP)
    public WebElement debitSideAmount;
    @FindBy(how = How.XPATH,using = creditSideAccountXP)
    public WebElement creditSideAccount;
    @FindBy(how = How.XPATH,using = creditSideAmountXP)
    public WebElement creditSideAmount;
    @FindBy(how = How.XPATH,using = dragAndDropsValidationXP)
    public WebElement dragAndDropsValidation;



    public void setDragAndDrops(){
        Actions actions=new Actions(driver);
        actions.dragAndDrop(bank,debitSideAccount).build().perform();
        sleepFor(3);
        actions.dragAndDrop(money5000,debitSideAmount).build().perform();
        sleepFor(3);
        actions.dragAndDrop(sales,creditSideAccount).build().perform();
        sleepFor(3);
        actions.dragAndDrop(money5000,creditSideAmount).build().perform();
        sleepFor(3);
    }
    public void setDragAndDropsValidation(){
        String actualText=dragAndDropsValidation.getText();
        String expectedText="Perfect!";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

}
