package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestAutomation {
    //  #Search box functionality test: Pass
//    Open Chrome browser: Pass
//    Enter amazon url in address bar and hit enter: Pass
//    Click on search box: Pass
//    Enter Hand sanitizer: Pass
//    Click on search button: pass
//    Verify Hand sanitizer is displayed properly: Pass
//    ExpectedResult: Hand sanitizer should display properly
//    ActualResult: Hand sanitizer display properly
    public WebDriver driver;
    public String chromeDriver="webdriver.chrome.driver";
    public String chromeDriverPath="lib/browserDriver/chromedriver";
    public String url="https://www.amazon.com/";
    public String searchBox="//*[@id=\"twotabsearchtextbox\"]";
    public String productSearch="hand sanitiser";
    public String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div";
    public String handSanitiserActualText="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[7]/div/span/div/div/div[2]/h2/a";
    public String ExpectedText="6-pack myDerm Hand Sanitizer with Aloe - 62% Alcohol kills 99.9% of germs";
    @BeforeMethod
    public void welcome(){
        System.out.println("Welome to Amazon Automation World");

    }
    public void setUp(String driveUrl,String drivePath,String url){
        System.setProperty(driveUrl,drivePath);
        driver=new ChromeDriver();
        driver.get(url);
    }
    @AfterMethod
    public void closeBrowser(){driver.close(); }


    // Test case Action method
    public void setSearchBoxCheck() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);

        //Click on search box and Enter Hand sanitizer

        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(3000);
        //Click on search button
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);


    }






}
