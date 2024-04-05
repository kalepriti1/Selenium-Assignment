package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTests {
    public static void main(String[] args) {
        testOpenDifferentBrowsers();
    }
    public static void testOpenDifferentBrowsers() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();
        openBrowser(chromeDriver, "Chrome");

    }
    public static void openBrowser(WebDriver driver, String browserName) {
        driver.get("https://www.google.com");
        String greetingMessage = "Welcome to Google";
//        System.out.println(driver.getTitle());
        if (driver.getTitle().contains("Google")) {
            System.out.println("Successfully opened " + browserName + " browser and navigated to Google.");
        } else {
            System.out.println("Failed to open " + browserName + " browser.");
        }
        driver.quit();
    }
}

