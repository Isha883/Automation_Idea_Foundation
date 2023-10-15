package TestScripts;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.ProfileDetailsPage;
import PageObjects.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileDetailsVerify extends BaseClass {

    LoginPage page;
    ProfileDetailsPage page2;

    @Test(description = "Let's test the flow of profile page ", priority = 1)
    public void TC_001() {
        page= new LoginPage();
        page.setLogin("kesharimanoj344@gmail.com", "123456");
        page2 = new ProfileDetailsPage();
        page2.enterSuppliersName();
        page2.selectCategory();
        page2.enterAddress1();
        page2.enterAddress2();
        page2.scrolldOWN();
       page2.enterDeliveryRadius();
        page2.enterCountry();
        page2.enterState();
        page2.enterCity();
        page2.enterZip();
        page2.scrolldOWN();
        page2.enterFrom();
        page2.enterTo();
      page2.pressAdd();
         page2.enterFrom();
        page2.enterTo();
        page2.pressAdd();
        page2.enterFrom();
        page2.enterTo();
        page2.scrolldOWN();
     //  page2.fileUploadTest();
     //  page2.enterText();
      page2.clicSubmitBtn();
      page2.verifymsg();
      Assert.assertEquals(page2.verifymsg(), "Profile Updated Successfully ", "Not matching");

    }

    @Test(description = "Let's test the texts on page", priority = 1)
    public void TC_002() {
        page= new LoginPage();
        page.setLogin("kesharimanoj344@gmail.com", "123456");


        page2 = new ProfileDetailsPage();
        page2.verifyText();
        Assert.assertEquals(  page2.verifyText(), "For Distance Measurement", "Not matching");
    }

    @Test(description = "Let's test the text header on page", priority = 1)
    public void TC_003() {
        page= new LoginPage();
        page.setLogin("kesharimanoj344@gmail.com", "123456");


        page2 = new ProfileDetailsPage();
        page2.verifyHeading2();
        Assert.assertEquals(  page2.verifyHeading2(), "Enter your Business details below", "Not matching");
    }

}





