package TestScripts;
import Base.BaseClass;
import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestVerify extends BaseClass {
    LoginPage page;

    @Test(description = "Let's test the heading of login page ", priority = 1)
//in description we are describing about test cases and giving priority
    public void TC_001() {
        page = new LoginPage();
        page.verifyHeading();
        Assert.assertTrue(page.verifyHeading(), "It is not visible");

    }
    @Test(description = "Let's test enter valid email and password, click on sign in button of login page ", priority = 1)
    public void TC_002()
    {
        page= new LoginPage();
        page.setLogin("kesharimanoj344@gmail.com", "123456");


    }
    @Test(description = "Let's test BLANK EMAIL AND PASSWORD and click on sign in button of login page ", priority = 1)
    public void TC_003()
    {
        page= new LoginPage();
        page.setLogin(" ", " ");

    }
    @Test(description = "Let's test passing invalid email and invalid password on login page ", priority = 1)
    public void TC_004()
    {
        page= new LoginPage();
        page.setLogin("72837209", "7090");
        page.getWarningMessage();
        System.out.println(page.getWarningMessage());
        Assert.assertEquals(page.getWarningMessage(), "Invalid Login Credentials!", "Message not displayed");
    }

    @Test(description = "Let's test passing valid email and blank password login page ", priority = 1)
    public void TC_005()
    {
        page= new LoginPage();
        page.setLogin("kesharimanoj344@gmail.com", " ");
    }
    @Test(description = "Let's test passing blank email and valid password login page ", priority = 1)
    public void TC_006()
    {
        page= new LoginPage();
        page.setLogin(" ", "123456");
    }
    @Test(description = "Let's test passing valid email and invalid password login page ", priority = 1)
    public void TC_007()
    {
        page= new LoginPage();
        page.setLogin("kesharimanoj344@gmail.com", "89ty");
        page.getWarningMessage();
        System.out.println(page.getWarningMessage());
        Assert.assertEquals(page.getWarningMessage(), "Invalid Login Credentials!", "Message not displayed");
    }
    @Test(description = "Let's test passing invalid email and valid password login page ", priority = 1)
    public void TC_008()
    {
        page.setLogin("ik123@gmail.com", "123456");
        page.getWarningMessage();
        System.out.println(page.getWarningMessage());
        Assert.assertEquals(page.getWarningMessage(), "Invalid Login Credentials!", "Message not displayed");
    }
    @Test(description = "Let's test sign in button is enabled or not on login page ", priority = 1)

    public void TC_009()
    {
        page= new LoginPage();
        page.verifySignInButton();
        Assert.assertTrue(page.verifySignInButton(), "Not enabled");
    }
    @Test(description = "Let's forgot password text  is displayed or not on login page ", priority = 1)
    public void TC_010()
    {
        page= new LoginPage();
        page.verifyTextDisplayed();
        Assert.assertTrue(page.verifyTextDisplayed(), "Not enabled");
    }
    @Test(description = "Let's sign up text  is displayed or not on login page ", priority = 1)
    public void TC_011()
    {
        page= new LoginPage();
        page.verifyText2Displayed();
        Assert.assertTrue(page.verifyText2Displayed(), "Not enabled");
    }
    @Test(description = "Let's Don't have an account text  is displayed or not on login page ", priority = 1)
    public void TC_012()
    {
        page= new LoginPage();

        Assert.assertTrue(page.verifyText3Displayed(), "Not enabled");
    }




}













