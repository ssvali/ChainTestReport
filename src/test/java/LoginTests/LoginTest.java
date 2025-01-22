package LoginTests;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.sabre.qa.base.BaseTest;
import com.sabre.qa.pages.LoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LoginTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(LoginTest.class);



    @Test
    public void loginTest() {
            driver.get("https://www.saucedemo.com/");
            ChainTestListener.log("loginTest Execution Completed");
            captureImage();
    }

    @Test
    public void homepage() {
        ChainTestListener.log("homepage Execution Completed");
    }

    @Test
    public void logoutTest() throws IOException {
        ChainTestListener.log("logoutTest Execution Completed");
    }

    @Test
    public void CartPage(){
        ChainTestListener.log("CartPage Execution Completed");
        //Assert("CartPage Test Failed");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public static List<String> readPropertiesFile(String filePath) throws IOException {
        Properties properties = new Properties();
        List<String> propertiesList = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8)) {
            properties.load(reader);
        }

        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            propertiesList.add(entry.getKey() + "=" + entry.getValue());
        }

        return propertiesList;
    }
}
