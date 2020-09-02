package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    /**
     * This method create driver instance for the local execution
     *
     * @param browserName name of the browser
     * @param platform platform name
     * @return WebDriver webdriver instance for the driver
     * @Author - ramdane
     */

    public static WebDriver driver=null;


    @Parameters({"url","platform","browserName"})
    @BeforeMethod

    public void setUp(String url, String platform, String browserName) {
        if (platform.equalsIgnoreCase("mac") && (browserName.equalsIgnoreCase("chrome"))) {
            System.setProperty("webdriver.chrome.driver", "../Generic/Browsers/mac/chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && (browserName.equalsIgnoreCase("chrome"))) {
            System.setProperty("webdriver.chrome.driver", "../Generic/Browsers/windows/chromedriver.exe");
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }
    /**
     * This method will wait for any condition
     *
     * @param Seconds The seconds that the thread must wait
     * @Author - ramdane
     */

    public void sleepFor(int Seconds) {
        try {
            Thread.sleep(Seconds * 1000);
        } catch (Exception e) {
        }
    }


    @AfterMethod(alwaysRun = true)
    public void cleanUp(){
        //driver.close();
        driver.quit();
    }





}
