package com.example.test;

import com.example.Pom.LoginPage;
import com.example.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest1 {
    @Test
    public void verifyLogin(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        LoginPage lp= new LoginPage();
        DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clicklogin();
    }
}
