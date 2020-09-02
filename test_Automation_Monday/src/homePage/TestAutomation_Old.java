package homePage;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestAutomation_Old {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/ramdaneameur/IdeaProjects/test_Automation_Monday/lib/browserDriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //    Enter amazon url in address bar and hit enter: Pass

//        System.setProperty("webdriver.gecko.driver","/Users/ramdaneameur/IdeaProjects/test_Automation_Monday/lib/browserDriver/geckodriver");
//        WebDriver driver1=new FirefoxDriver();
        String url="https://www.amazon.com/";
        String searchBox="//*[@id=\"twotabsearchtextbox\"]";
        String productSearch="men bikes";
        String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
        String menBikesActualText="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span";
        String menBikesExpectedText="Schwinn High Timber Youth and Adult Mountain Bike, Aluminum and Steel Frame Options, 7-21 Speeds Options, 24-29-Inch Wheels, Multiple Colors";

        driver.get(url);
        Thread.sleep(3000);

        //Click on search box: Pass

        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(5000);
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);

//        String ActualText=driver1.findElement(By.xpath(menBikesActualText)).getText();
//        String ExpectedText=driver1.findElement(By.name(menBikesExpectedText)).getText();
//        driver.findElement(By.xpath(menBikesActualText)).getText();
//        driver.findElement(By.name(menBikesExpectedText)).getText();
//        Assert.assertEquals(menBikesActualText,menBikesExpectedText);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.close();









    }
}
