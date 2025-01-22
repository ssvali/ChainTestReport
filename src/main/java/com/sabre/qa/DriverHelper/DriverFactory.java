package com.sabre.qa.DriverHelper;

import com.sabre.qa.base.BaseTest;
import com.sabre.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory extends BaseTest {

    public static WebDriver createDriver() {
        String browser = ConfigReader.getProperty("browser");

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                return new ChromeDriver(options);
            case "firefox":
                driver = new FirefoxDriver();
                return new FirefoxDriver();
            case "edge":
                driver = new EdgeDriver();
                return new EdgeDriver();
            default:
                throw new RuntimeException("Invalid browser name: " + browser);
        }
    }
}
