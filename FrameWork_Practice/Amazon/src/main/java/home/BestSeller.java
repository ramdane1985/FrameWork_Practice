package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class BestSeller extends CommonAPI {

    @FindBy(how = How.XPATH,using = bestSellerButtonXP)
    public WebElement bestSellerButton;

    @FindBy(how = How.XPATH,using = BestSellerValidationXP)
    public WebElement bestsellervalidation;

    @FindBy(how = How.XPATH,using =babyXP )
    public WebElement baby;




    public void setbestSellerButton(){bestSellerButton.click();}


    public void setBestsellervalidation(){
        String actualResult=BestSellerValidationXP;
        String expectedResult="\"Echo Dot (3rd Gen) - Smart speaker with Alexa - Charcoal\"";
        Assert.assertEquals(actualResult,expectedResult,"text doesn't match");
    }

    public void setBaby(){
        baby.click();
    }






}
