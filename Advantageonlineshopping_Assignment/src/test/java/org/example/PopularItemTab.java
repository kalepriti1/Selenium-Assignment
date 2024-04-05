package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PopularItemTab {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://advantageonlineshopping.com/#/");
        try {

            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

            WebElement popularItemsLink = driver.findElement(By.xpath("//a[text()='POPULAR ITEMS']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", popularItemsLink);

            wait.until(ExpectedConditions.elementToBeClickable(popularItemsLink));

            popularItemsLink.click();

            System.out.println("Successfully clicked on the 'POPULAR ITEMS' link.");

            WebElement viewDetailsLabel = wait.until(ExpectedConditions.elementToBeClickable(By.id("details_16")));
            viewDetailsLabel.click();

            System.out.println("Successfully clicked on the 'View Details' label.");

            WebElement addToCartButton = driver.findElement(By.name("save_to_cart"));
            addToCartButton.click();

            System.out.println("Successfully clicked on the 'ADD TO CART' button.");
            WebElement checkoutButton = driver.findElement(By.id("checkOutPopUp"));
            checkoutButton.click();

            System.out.println("Successfully clicked on checkoutButton");

        }  catch (Exception e) {
            System.err.println("Failed to perform the actions: " + e.getMessage());
        }
        driver.quit();
    }
}
