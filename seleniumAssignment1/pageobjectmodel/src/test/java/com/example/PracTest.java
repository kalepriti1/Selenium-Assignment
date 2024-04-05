package com.example;

import org.testng.annotations.Test;

public class PracTest {
//    @Test
//    public void OrangeHRMVerifyLogin(){
//        System.out.println("Login Validated");
//    }
    @Test(groups = {"TestNGVerifyLogin","OrangeHRVerifyLogin"})
    public void TestNGVerifyLogin(){
        System.out.println("Test Login Validated");
    }
    @Test(dependsOnGroups = {"TestNGVerifyLogin","OrangeHRVerifyLogin"})
    public void AmazonVerifyLogout(){
        System.out.println("Logout Validated");
    }
//    @Test(priority = 3)

    @Test(enabled = false)//It will not run the code
    public void addition(){
        System.out.println("Addition");
    }
    @Test(priority = 2)
    public void subtraction(){
        System.out.println("Subtracst(priority = 1)\n" +
                "    public void division(){\n" +
                "        System.out.println(\"division\");\n" +
                "    }tion");
    }

}
