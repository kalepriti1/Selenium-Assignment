package com.natwest.test;

import com.natwest.pom.BookPage;
import com.natwest.pom.LoginDemoPage;
import com.natwest.util.DriverUtils;
import org.testng.annotations.Test;

public class WebBookByDemoTest {
    @Test(groups = {"verifyLogin"})
    public void verifyLogin(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        LoginDemoPage loginDemoPage = new LoginDemoPage();
        DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
        loginDemoPage.enterEmialID("kalepriya@6234gmail.com");
        loginDemoPage.enterPassword("Kale@90");
        loginDemoPage.clickLogin();
    }
    @Test(dependsOnGroups = {"verifyLogin"} )
    public void verifyByBook(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        BookPage bookPage = new BookPage();
//        DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
        bookPage.clickBooks();
        bookPage.filterByPrice25();
        bookPage.clickAddcard();
        bookPage.clickShowCard();
        bookPage.accesptTermandCodition();
        bookPage.clickCheckout();
        bookPage.selectNewAddress();
        bookPage.entercityname("New York");
        bookPage.enterAddress("123 Main Street");
        bookPage.enterZipcard("10001");
        bookPage.enterPhonenumber("1234567890");
        bookPage.clickContinue();
    }

}
