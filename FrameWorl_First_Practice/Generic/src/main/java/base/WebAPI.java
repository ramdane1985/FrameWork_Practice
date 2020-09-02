package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class WebAPI {
    //ExtentReport
//    public static ExtentReports extent;
//
//    @BeforeSuite
//    public void extentSetup(ITestContext context) {
//        ExtentManager.setOutputDirectory(context);
//        extent = ExtentManager.getInstance();
//    }
//
//    @BeforeMethod
//    public void startExtent(Method method) {
//        String className = method.getDeclaringClass().getSimpleName();
//        String methodName = method.getName().toLowerCase();
//        ExtentTestManager.startTest(method.getName());
//        ExtentTestManager.getTest().assignCategory(className);
//    }
//
//    protected String getStackTrace(Throwable t) {
//        StringWriter sw = new StringWriter();
//        PrintWriter pw = new PrintWriter(sw);
//        t.printStackTrace(pw);
//        return sw.toString();
//    }
//
//    @AfterMethod
//    public void afterEachTestMethod(ITestResult result) {
//        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
//        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
//
//        for (String group : result.getMethod().getGroups()) {
//            ExtentTestManager.getTest().assignCategory(group);
//        }
//
//        if (result.getStatus() == 1) {
//            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
//        } else if (result.getStatus() == 2) {
//            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
//        } else if (result.getStatus() == 3) {
//            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
//        }
//        ExtentTestManager.endTest();
//        extent.flush();
//        if (result.getStatus() == ITestResult.FAILURE) {
//            captureScreenshot(driver, result.getName());
//        }
//        driver.quit();
//    }
//
//    @AfterSuite
//    public void generateReport() {
//        extent.close();
//    }
//
//
//    private Date getTime(long millis) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(millis);
//        return calendar.getTime();
//    }
//
//    public static void captureScreenshot(WebDriver driver, String screenshotName) {
//        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
//        Date date = new Date();
//        df.format(date);
//
//        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(file,
//                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
//            System.out.println("Screenshot captured");
//        } catch (Exception e) {
//            System.out.println("Exception while taking screenshot " + e.getMessage());
//        }
//
//    }

    //Browser SetUp
    public static WebDriver driver = null;


    @Parameters({"url"})

    @BeforeMethod
    public void setUp(@Optional("https://www.google.com") String url){
        System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        //driver.close();
        driver.quit();
    }










}
