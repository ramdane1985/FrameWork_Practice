package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomeWebElements.*;

public class SearchBox extends CommonAPI {
    @FindBy(how = How.XPATH,using = searchFieldXP)
    public WebElement searchField;
    @FindBy(how = How.XPATH,using = searchButtonXP)
    public WebElement searchButton;


    public void setSearchField(){
        searchField.sendKeys(searchItem);
        searchButton.click();
        sleepFor(3);
    }
}
