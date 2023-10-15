package PageObjects;

import Actions.PreDefinedActions;
import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {


    public LoginPage()//create a constructor
    {
        PageFactory.initElements(driver, this);//initializing the driver and web-elements
    }
	@FindBy(xpath="//img[@src='https://pickndeal.oidea.online/laravel_app/public//assets/images/logo.png']")
	private WebElement PickNDealHeading;

    public boolean verifyHeading()
    {
        return PickNDealHeading.isDisplayed();
    }
	@FindBy(xpath="//input[@id='userName']")
	private WebElement Username;


	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;

	@FindBy(css="button[type='submit']")
	private WebElement SignIn;

    public void setLogin(String id, String pass)
    {

        PreDefinedActions.clickMethod(Username, true);
        PreDefinedActions.sendKeysMethod(Username, id);
        PreDefinedActions.clickMethod(Password, true);
        PreDefinedActions.sendKeysMethod(Password, pass);
        PreDefinedActions.clickMethod(SignIn, true);
    }
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement Message1;

    public String getWarningMessage()
    {
        return PreDefinedActions.getText(Message1);
    }
    public boolean verifySignInButton()
    {
      return SignIn.isEnabled();
    }

	@FindBy(css="a[href='https://pickndeal.oidea.online/laravel_app/public/user/forgot']")
	private WebElement ForgotPass;

    public boolean verifyTextDisplayed()
    {
        return ForgotPass.isDisplayed();
    }
	@FindBy(css="a[href='https://pickndeal.oidea.online/laravel_app/public/user/register']")
	private WebElement SignUpText;

    public boolean verifyText2Displayed()
    {
        return SignUpText.isDisplayed();
    }

	@FindBy(css=".d-flex.justify-content-center.links")
	private WebElement AccountText;

    public boolean verifyText3Displayed()
    {
        return AccountText.isDisplayed();
    }



}










