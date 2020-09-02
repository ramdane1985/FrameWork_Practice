package ebayPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBoxTest extends SearchBox {
    @Test
    public void testSearchBoxCheck ( ) throws InterruptedException {
        searchBoxCheck();
        String actualText = driver.findElement(By.xpath(actualText1)).getText();
        Assert.assertEquals(actualText, expectedText);



    }


    }



