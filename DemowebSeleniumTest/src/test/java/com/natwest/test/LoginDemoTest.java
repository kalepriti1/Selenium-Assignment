package com.natwest.test;

import com.natwest.pom.LoginDemoPage;
import com.natwest.pom.LoginPage;
import com.natwest.util.DriverUtils;
import org.testng.annotations.Test;

public class LoginDemoTest {

    @Test
    public void verifyLogin(){


        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        LoginDemoPage loginDemoPage = new LoginDemoPage();
        DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
        loginDemoPage.enterEmialID("kalepriya@6234gmail.com");
        loginDemoPage.enterPassword("Kale@90");
        loginDemoPage.clickLogin();
    }
}
