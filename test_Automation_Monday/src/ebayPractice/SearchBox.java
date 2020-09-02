package ebayPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SearchBox {
    public WebDriver driver;
    public String chromeDriver="webdriver.chrome.driver";
    public String chromeDriverPath="lib/browserDriver/chromedriver";
    public String url="https://www.ebay.com/";
    public String searchBox="//*[@id=\"gh-ac\"]";
    public String productSearch="Iphone11";
    public String searchButton="gh-btn";
    public String actualText1="//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3";
    public String expectedText="Apple iPhone 11 64/128/256GB White Black Red Green Yellow Purple GSM Unlocked";
    public String colorButton="//*[@id=\"msku-sel-1\"]";
    public String whiteColor="white";
    public String storageCapacity="//*[@id=\"msku-sel-2\"]";
    public String capacity128="128GB";
    public String quantityButton="//*[@id=\"qtyTextBox\"]";
    public String quantity="2";
    public String homePage="//*[@id=\"gh-la\"]";
    public String motors="//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a";
    public String year="//*[@id=\"s0-26-9-0-1[0]-0-2-4-CAR_AND_TRUCK_0\"]/select";
    public String carYear="2021";
    public String make="//*[@id=\"s0-26-9-0-1[0]-0-2-4-CAR_AND_TRUCK_1\"]/select";
    public String makeBrand="Audi";
    public String model="//*[@id=\"s0-26-9-0-1[0]-0-2-4-CAR_AND_TRUCK_2\"]/select";
    public String carModel="A3 S Line Quat";
    public String trim="//*[@id=\"s0-26-9-0-1[0]-0-2-4-CAR_AND_TRUCK_3\"]/select";
    public String trimName="Premium Plus";
    public String findPartButton="//*[@id=\"s0-26-9-0-1[0]-0-2-4-7[0[0]]\"]";


    @BeforeMethod
    public void welcome(){
        System.out.println("Welcome To Ebay Automation practice");
    }
    public void setUp(String driveUrl,String drivePath,String url) throws InterruptedException {
        System.setProperty(driveUrl,drivePath);
        driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(3000);

    }
    @AfterMethod
    public void closeBrowser(){driver.close();}
    public void searchBoxCheck() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(2000);
        driver.findElement(By.id(searchButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(actualText1)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(colorButton)).sendKeys(whiteColor);
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.xpath(storageCapacity)).sendKeys(capacity128);
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.xpath(quantityButton)).sendKeys(quantity);
        Thread.sleep(2000);
        driver.findElement(By.xpath(homePage)).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(motors)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(year)).sendKeys(carYear);
        Thread.sleep(2000);
        driver.findElement(By.xpath(make)).sendKeys(makeBrand);
        Thread.sleep(2000);
        driver.findElement(By.xpath(model)).sendKeys(carModel);
        Thread.sleep(2000);
        driver.findElement(By.xpath(trim)).sendKeys(trimName);
        Thread.sleep(2000);
        driver.findElement(By.xpath(findPartButton)).click();
        Thread.sleep(8000);



    }

}
