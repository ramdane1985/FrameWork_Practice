package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class TodayDeal extends CommonAPI {
    @FindBy(how = How.XPATH,using = todayDealXP)
    public WebElement todayDeal;
    @FindBy(how = How.CLASS_NAME,using = todayDealVerificationC)
    public WebElement todayDealVerification;

    public void setTodayDeal(){
        todayDeal.click();
        String actualText=todayDealVerification.getText();
        String expectedText="Today's Deals";
        Assert.assertEquals(actualText,expectedText,"text not verified");
    }

}
