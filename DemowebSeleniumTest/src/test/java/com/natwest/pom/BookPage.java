package com.natwest.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookPage extends BasePage {
        @FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
        WebElement books;

        @FindBy(xpath = "//span[text()='25.00']")
        WebElement price;
        @FindBy(xpath = "//input[@class='button-2 product-box-add-to-cart-button']")
        WebElement addcard;
        @FindBy(xpath = "//a[@href='/cart'][1]")
        WebElement showcard;

        @FindBy(xpath = "//input[@id = 'termsofservice']")
        WebElement termcondition;
        @FindBy(xpath = "//input[@name = 'checkout']")
        WebElement checkout;
        @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
        WebElement city;
        @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
        WebElement address;
        @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
        WebElement zipPostalCode;
        @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
        WebElement phoneNumber;
        @FindBy(xpath = "//input[@value='Continue'][1]])")
        WebElement continue1;
        @FindBy(xpath = "//select[@name='billing_address_id']/option[text()='New Address']")
        WebElement newAddress;
        public void clickBooks(){
            books.click();
        }
        public void filterByPrice25(){
            price.click();
        }
        public void clickAddcard(){
            addcard.click();
        }
        public void clickShowCard(){
            showcard.click();
        }
        public void accesptTermandCodition(){
            termcondition.click();
        }
        public void clickCheckout(){
            checkout.click();
        }
        public void selectNewAddress(){
                newAddress.click();
        }
        public void entercityname(String str){
                city.sendKeys(str);
        }
        public void enterAddress(String str){
                address.sendKeys(str);
        }
        public void enterZipcard(String str){
                zipPostalCode.sendKeys(str);
        }
        public void enterPhonenumber(String str){
                phoneNumber.sendKeys(str);
        }
        public void clickContinue(){
                continue1.click();
        }


}
