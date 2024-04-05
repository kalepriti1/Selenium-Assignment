package com.natwest.test;

import com.natwest.pom.LoginPage;
import com.natwest.util.DriverUtils;
import com.natwest.util.ExcelData;
import org.testng.annotations.Test;

public class TestLogin1 {
    @Test
    public void verifyLogin(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        LoginPage lp= new LoginPage();
        DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String Username = ExcelData.getData("C:\\Users\\rbs\\Desktop\\rbs\\Practice\\DemowebSeleniumTest\\src\\test\\java\\Data\\AutoExcel.xlsx","Sheet1",0,0);

        String Password = ExcelData.getData("C:\\Users\\rbs\\Desktop\\rbs\\Practice\\DemowebSeleniumTest\\src\\test\\java\\Data\\AutoExcel.xlsx","Sheet1",0,1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clicklogin();
    }
}
