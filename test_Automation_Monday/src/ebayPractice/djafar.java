package ebayPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class djafar extends SearchBox{


    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement search;




    public void search(String iphone11) {
        search.sendKeys();
    }
}
