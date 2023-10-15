package TestScripts;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTestVerify extends BaseClass {
    SignUpPage page;

    @Test(description = "Let's test the text SignUp on login page ", priority = 1)
    public void TC_001() {
        page = new SignUpPage();
        page.verifyTextEnabled();
        Assert.assertTrue(page.verifyTextEnabled(), "It is not visible");
    }
    @Test(description = "Let's click on the Signup ", priority = 1)
    public void TC_002() {
        page = new SignUpPage();
        page.clickSignUp();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pickndeal.oidea.online/laravel_app/public/user/register", "Not matching");
    }
    @Test(description = "Let's click on the Signup ", priority = 1)
    public void TC_003() {
        page = new SignUpPage();
        page.verifyHeading();
        Assert.assertTrue(page.verifyHeading(),"Not visible");
    }
    @Test(description = "Let's click on Supplier ", priority = 1)
    public void TC_004() {
        page = new SignUpPage();
        page.clickSupplier();
    }
    @Test(description = "Let's enter all details and click on Signup ", priority = 1)
    public void TC_005() {
        page = new SignUpPage();
        page.clickSignUp();
        page.clickSupplier();
        page.enterFirstName();
        page.enterLastName();
        page.enterEmail();
        page.enterNumber();
        page.enterPass();
        page.enterConfirmPass();

    }
    @Test(description = "Let's enter registered details again and click on Signup ", priority = 1)
    public void TC_006() {
        page = new SignUpPage();
        page.clickSignUp();
        page.clickSupplier();
        page.enterFirstName();
        page.enterLastName();
        page.enterEmail();
        page.enterNumber();
        page.enterPass();
        page.enterConfirmPass();
        page.scrolldOWN();
        page.clickSignUpBtn();
        page.verifyMsg();
        Assert.assertEquals(page.verifyMsg(), "Email already Exist!", "Message not showing");

    }

    @Test(description = "Let's verify the number placeholder ", priority = 1)
    public void TC_007() {
        page = new SignUpPage();
        page.verifyPlaceholder();
        Assert.assertTrue(page.verifyPlaceholder(), "Not displayed");
    }
    @Test(description = "Let's TEST the fields displayed on sign up page ", priority = 1)
    public void TC_0065() {
        page = new SignUpPage();
        page.clickSignUp();
        page.verifyFIRSTnAMEfIELD();
        Assert.assertTrue(page.verifyFIRSTnAMEfIELD(), "Not displayed");
        page.verifylASTnAMEfIELD();
        Assert.assertTrue(page.verifylASTnAMEfIELD(), "Not displayed");
        page.verifyeMAILfIELD();
        Assert.assertTrue(page.verifyeMAILfIELD(), "Not displayed");
        page.verifyNumberfIELD();
        Assert.assertTrue(page.verifyNumberfIELD(), "Not displayed");
        page.verifyPassfIELD();
        Assert.assertTrue(page.verifyPassfIELD(), "Not displayed");
        page.verifyConfirmPassFIELD() ;
        Assert.assertTrue(page.verifyConfirmPassFIELD(), "Not displayed");
    }
    @Test(description = "Let's verify the texts displayed on sign up page ", priority = 1)
    public void TC_0066() {
        page = new SignUpPage();
        page.clickSignUp();
        page.verifyHaveAnAccountText();
        Assert.assertTrue(page.verifyHaveAnAccountText(), "Not displayed");
        page.verifySignINtEXT();
        Assert.assertTrue(page.verifySignINtEXT(), "Not displayed");
    }
}








