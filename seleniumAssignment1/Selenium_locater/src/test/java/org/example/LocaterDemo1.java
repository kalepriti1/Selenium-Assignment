package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class LocaterDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);
        //Id or name
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("T-shirts");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
        searchButton.click();
        WebElement imgElement = driver.findElement(By.className("s-image"));
        imgElement.click();

        WebElement image1 = driver.findElement(By.xpath("(//span[@id=\"a-autoid-8\"])[2]"));
        WebElement image2 = driver.findElement(By.xpath("(//span[@id=\"a-autoid-8\"])[3]"));
        WebElement image3 = driver.findElement(By.xpath("(//span[@id=\"a-autoid-8\"])[4]"));
        WebElement image4 = driver.findElement(By.xpath("(//span[@id=\"a-autoid-8\"])[5]"));
        WebElement image5 = driver.findElement(By.xpath("(//span[@id=\"a-autoid-8\"])[6]"));
        WebElement image6 = driver.findElement(By.xpath("(//span[@id=\"a-autoid-8\"])[7]"));
        WebElement image7 = driver.findElement(By.xpath("(//span[@id=\"a-autoid-8\"])[8]"));

        image1.click();
        Thread.sleep(1000);
        image2.click();
        Thread.sleep(1000);
        image3.click();
        Thread.sleep(1000);
        image4.click();
        Thread.sleep(1000);
        image5.click();
        Thread.sleep(1000);
        image6.click();
        Thread.sleep(1000);
        image7.click();
        Thread.sleep(1000);

        WebElement element1 = driver.findElement(By.xpath("a[@id=\"native_dropdown_selected_size_name_0\"]"));
        element1.click();

    }
}
