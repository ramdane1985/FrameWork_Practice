package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IFrameClass extends CommonAPI {

    public void setIFrame(){
        List<WebElement> elements=driver.findElements(By.tagName("iFrame"));
        int numberOftags=elements.size();
        System.out.println("no of iFrames on this webPage are "+ numberOftags) ;
        for (WebElement st:elements) {
            System.out.println(st);
        }
        //switch to iFrame by index
        driver.switchTo().frame(1);
        //switch back to parent frame
        driver.switchTo().parentFrame();
        // switch back to a parent frame
        driver.switchTo().parentFrame();

// Print the frame source code
        System.out.println("Frame Source" +driver.getPageSource());

// Switch back to main web page
        driver.switchTo().defaultContent();
    }
}
