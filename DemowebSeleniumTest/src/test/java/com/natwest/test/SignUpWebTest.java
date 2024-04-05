package com.natwest.test;

import com.natwest.pom.LoginPage;
import com.natwest.pom.Signupwebpage;
import com.natwest.util.DriverUtils;
import org.testng.annotations.Test;

public class SignUpWebTest {
    @Test
    public void SignUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        Signupwebpage signupwebpage = new Signupwebpage();
        DriverUtils.getDriver().get("https://demowebshop.tricentis.com/register");
        signupwebpage.selectFemaleGender();
        signupwebpage.enterFirstname("abcd");
        signupwebpage.enterLastname("xyz");
        signupwebpage.enterEmail("abcd12@gmail.com");
        signupwebpage.enterPassword("abcd@23");
        signupwebpage.enterConfirmPassword("abcd@23");
        signupwebpage.clickRegisterButton();
    }
}
