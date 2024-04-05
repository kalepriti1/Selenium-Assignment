package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        LoginPage lp= new LoginPage(driver);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clicklogin();
        Thread.sleep(3000);
        AdminPage adminPage = new AdminPage(driver);
        adminPage.clickAdmin();
        Thread.sleep(3000);
        adminPage.clickAddButton();
        Thread.sleep(3000);
        adminPage.selectUserRole();
        Thread.sleep(3000);

//        adminPage.selectStatus();
        adminPage.enterUsername("lakhan");
        Thread.sleep(3000);
//
        adminPage.enterPassword("Lakhan@123");
        Thread.sleep(3000);

        adminPage.enterConfirmPassword("Lakhan@123");
        Thread.sleep(3000);

        adminPage.clickSave();
    }
}
