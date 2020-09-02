package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static home.HomePageWebElements.*;

public class SearchClass extends CommonAPI {
    @FindBy(how = How.XPATH,using = searchButtonXP)
    public WebElement searchButton;
    @FindBy(how = How.XPATH,using = searchFieldXP)
    public WebElement searchField;
    @FindBy(how = How.XPATH,using = goButtonXP)
    public WebElement goButton;
    @FindBy(how = How.XPATH,using = searchValidationXP)
    public WebElement searchValidation;

    public void setSearchButton(){
        searchButton.click();
        searchField.sendKeys("today's news");
        goButton.click();
        String actualText=searchValidation.getText();
        String expectedText="\n" +
                "Have search feedback? Let us know what you think.";
        Assert.assertEquals(actualText,expectedText,"text not verified");
        sleepFor(3);

    }


}
