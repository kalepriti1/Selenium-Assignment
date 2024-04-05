package com.natwest.pom;

import com.natwest.util.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    public BasePage(){
        driver = DriverUtils.getDriver();
        PageFactory.initElements(driver,this);
    }
}
