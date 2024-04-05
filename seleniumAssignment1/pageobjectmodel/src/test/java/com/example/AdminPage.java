package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
    //Decaration
    @FindBy(xpath = "//a[@class='oxd-main-menu-item' and contains(span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'], 'Admin')]\n")
    WebElement adminTab;
    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    WebElement addbutton;
    @FindBy(xpath = "(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[1]")
    WebElement userRole;
//    @FindBy(xpath = "(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[]")
//    WebElement status;
    @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
    WebElement username;

     @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[3]")
     WebElement password;

     @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[4]")
     WebElement confirmpassword;
     @FindBy(xpath = "//button[@class=\"oxd-input oxd-input--active\"]")
      WebElement save;


    //Initialization
    AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //Utilization
    public void clickAdmin(){
        adminTab.click();
    }
    public void clickAddButton(){
        addbutton.click();
    }
    public void selectUserRole(){
        userRole.click();
    }

//    public void selectStatus(){
//        status.click();
//    }

    public  void enterUsername(String str){
        username.sendKeys(str);
    }
    public void enterPassword(String str){
        password.sendKeys(str);
    }
    public void enterConfirmPassword(String str){
        confirmpassword.sendKeys(str);
    }
    public  void  clickSave(){
        save.click();
    }
}
