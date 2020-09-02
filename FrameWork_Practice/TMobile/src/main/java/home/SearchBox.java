package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElement.*;

public class SearchBox extends CommonAPI {

    @FindBy(how = How.XPATH,using = searchButtonXP)
    public WebElement searchButton;
    @FindBy(how = How.ID,using = searchFieldID)
    public WebElement searchField;
    @FindBy(how = How.XPATH,using = searchBoxValidationXP)
    public WebElement searchBoxValidation;


    public void setSearchBox(){
        searchButton.click();
        searchField.sendKeys("Iphone11");
        searchField.submit();
        String actualTex=searchBoxValidation.getText();
        String expectedText="www.t-mobile.com - Additional security check is required";
        Assert.assertEquals(actualTex,expectedText,"text doesn't match");
        sleepFor(6);
    }
}
