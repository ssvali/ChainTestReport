package com.sabre.qa.base;



import com.aventstack.chaintest.plugins.ChainTestListener;
import com.sabre.qa.utils.LogUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(ChainTestListener.class)
public class BaseTest {

    public static WebDriver driver;



    @BeforeTest
    public void setUpTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDownTest() {
        driver.quit();
        ChainTestListener.log("Test Execution Completed");
        LogUtils.info("Test Execution Completed");
    }

    public void captureImage(){
        byte[] imageBytes = null;
        TakesScreenshot ts = (TakesScreenshot) driver;
        imageBytes = ts.getScreenshotAs(OutputType.BYTES);
        ChainTestListener.embed(imageBytes, "image/png");
    }

}
