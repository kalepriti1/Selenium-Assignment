package com.natwest.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signupwebpage {

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;
    @FindBy(xpath = "//input[@name = 'FirstName']")
    WebElement firstname;
    @FindBy(xpath = "//input[@name = 'LastName']")
    WebElement lastname;
    @FindBy(xpath = "//input[@name = 'Email']")
    WebElement email;
    @FindBy(xpath = "//input[@name = 'Password']")
    WebElement password;
    @FindBy(xpath = "//input[@name = 'ConfirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@class='button-1 register-next-step-button']")
    WebElement registerButton;
    public void selectFemaleGender(){
        gender.click();
    }
    public void enterFirstname(String str){
        firstname.sendKeys(str);
    }
    public void enterLastname(String str){
        lastname.sendKeys(str);
    }
    public void enterEmail(String str){
        email.sendKeys(str);
    }
    public void enterPassword(String str){
        password.sendKeys(str);
    }
    public void enterConfirmPassword(String str){
        confirmPassword.sendKeys(str);
    }
    public void clickRegisterButton(){
        registerButton.click();
    }

}
