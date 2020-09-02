package banks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TdBank {
    public WebDriver driver;
    public String chromeDriver="webdriver.chrome.driver";
    public String chromeDriverPath="lib/browserDriver/chromedriver";
    public String url="https://www.td.com/us/en/personal-banking/";
    public String getOffer="//*[@id=\"login-body-content-cloned\"]/div/div/button";
    public String homePage="/html/body/div[1]/header[1]/div[2]/div/div/div/a/img";
    public String personnel="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[1]/a";
    public String smallBusiness="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[2]/a";
    public String commercial="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[3]/a";
    public String investingWealth="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[4]/a";

    @BeforeMethod
    public void welcome (){
        System.out.println("Welcome To TD Bank Automation ");}

     public void setUp(String driverUrl, String driverPath, String url) throws InterruptedException {
        System.setProperty(driverUrl,driverPath);
        driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(3000);
     }
     @AfterMethod
    public void closeBrowser(){driver.close();}
    //Test case Action method
    public void TdBankCheck() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath(getOffer)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(homePage)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(personnel)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(smallBusiness)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(commercial)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(investingWealth)).click();
        Thread.sleep(3000);


    }




}
