package com.natwest.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginDemoPage extends BasePage{
        @FindBy(xpath = "//input[@class=\"email\"]")
        WebElement email;
        @FindBy(xpath = "//input[@class=\"password\"]")
        WebElement password;
        @FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
        WebElement loginButton;

        public void enterEmialID(String emailId){
            email.sendKeys(emailId);
        }
        public void enterPassword(String psd){
            password.sendKeys(psd);
        }
        public void clickLogin(){
            loginButton.click();
        }

}
