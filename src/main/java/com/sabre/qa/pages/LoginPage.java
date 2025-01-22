package com.sabre.qa.pages;

import com.sabre.qa.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseTest {

    WebDriver driver;
    By bookDemoButton = By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]");
    By passwordField = By.id("password");
    By loginButton = By.id("loginBtn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookDemoButton(){
        driver.findElement(bookDemoButton).click();
    }


}
