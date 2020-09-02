package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static regression.RegressionElements.*;

public class HamburgerClass extends CommonAPI {

    @FindBy(how = How.XPATH,using = hamburgerButtonXP)
    public WebElement hamburgerButton;

    @FindBy(how = How.XPATH,using = worldButtonXP)
    public WebElement worldButton;

    public void setHamburgerButton(){
        hamburgerButton.click();
        sleepFor(2);
    }
    public void setWorldButton(){
        Actions actions=new Actions(driver);
        actions.moveToElement(worldButton).build().perform();

    }
}
