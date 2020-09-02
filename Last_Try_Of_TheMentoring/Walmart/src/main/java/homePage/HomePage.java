package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static homePage.HomePageWebElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH,using = searchBoxXP)
    public WebElement searchBox;
    @FindBy(how = How.XPATH,using = searchButtonXP)
    public WebElement searchButton;

    @FindBy(how = How.CSS,using = clickOnMenuButtonCSS)
    public WebElement clickOnMenuButton;
    @FindBy(how = How.XPATH,using = localStoreXP)
    public WebElement localStore;
    @FindBy(how = How.XPATH,using = clickOnStoreFinderXP)
    public WebElement clickOnStoreFinder;


    public void setSearchField() throws InterruptedException, IOException {
        driver.manage().window().maximize();
        searchBox.sendKeys(itemSearched);
        searchButton.click();
        goBackToHomeWindow();
        takeScreenShot();
        sleepFor(3);
    }
    public void setMenu(){
        clickOnMenuButton.click();

    }


}
