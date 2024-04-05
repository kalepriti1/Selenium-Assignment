package com.natwest.test;

import com.natwest.pom.LoginPage;
import com.natwest.util.DriverUtils;
import org.testng.annotations.Test;

public class LoginTest {
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
