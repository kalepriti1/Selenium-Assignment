package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ContactUs {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.get("https://advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click();
        Select select = new Select(driver.findElement(By.name("categoryListboxContactUs")));
        select.getOptions();

        driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click();
        Select select1 = new Select(driver.findElement(By.name("categoryListboxAboutus")));
        select1.getOptions();

        driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click();
        Select select2 = new Select(driver.findElement(By.name("categoryListboxKnowUs")));
        select2.getOptions();

        driver.findElement(By.xpath("//a[contains(text(),'send')]")).click();

    }

}
