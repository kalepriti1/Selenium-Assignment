package com.natwest.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    //Decaration
    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement txtUsername;

    @FindBy(xpath = "//input[@name='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonLogin;

    public void enterUsername(String str){
        txtUsername.sendKeys(str);
    }
    public void enterPassword(String str){
        txtPassword.sendKeys(str);
    }
    public void clicklogin(){
        buttonLogin.click();
    }

}
