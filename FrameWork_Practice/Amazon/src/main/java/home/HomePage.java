package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class HomePage extends CommonAPI {

   @FindBy(how = How.CLASS_NAME,using =logoSignCN)
     public WebElement logoSign;

   public void setLogoSign(){
       String expectedText="https://www.amazon.com/ref=nav_logo";
       String actualText="https://www.amazon.com/ref=nav_logo";
       Assert.assertEquals(actualText,expectedText,"text doesn't match");

   }





}
