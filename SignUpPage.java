package PageObjects;

import Actions.PreDefinedActions;
import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseClass {
    public SignUpPage()//create a constructor
    {
        PageFactory.initElements(driver, this);//initializing the driver and web-elements
    }
	@FindBy(css="a[href='https://pickndeal.oidea.online/laravel_app/public/user/register']")
	private WebElement SignUpText;

    public boolean verifyTextEnabled()
    {
       return  SignUpText.isEnabled();
    }
	@FindBy(css="a[href='https://pickndeal.oidea.online/laravel_app/public/user/register']")
	private WebElement SignUp;

    public void clickSignUp()
    {
        PreDefinedActions.clickMethod(SignUp, true);

    }
	@FindBy(css="img[src='https://pickndeal.oidea.online/laravel_app/public//assets/images/logo.png']")
	private WebElement WelcomeHeading;

    public boolean verifyHeading()
    {
        return WelcomeHeading.isDisplayed();
    }
	@FindBy(css="div[class='userSelect']")
	private WebElement Supplier;

    public void clickSupplier()
    {
        PreDefinedActions.clickMethod(Supplier, true);

    }
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement FirstName;

    public void enterFirstName()
    {
        PreDefinedActions.sendKeysMethod(FirstName, "Isha");

    }
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement LastName;

    public void enterLastName()
    {
        PreDefinedActions.sendKeysMethod(LastName, "Keshri");

    }
	@FindBy(css="#emailaddress")
	private WebElement Email;

    public void enterEmail()
    {
        PreDefinedActions.sendKeysMethod(Email, "kesharimanoj344@gmail.com");

    }
	@FindBy(css="#phoneNumber")
	private WebElement Number;

    public void enterNumber()
    {
        PreDefinedActions.sendKeysMethod(Number, "6575875587");

    }
	@FindBy(css="#password")
	private WebElement Password;

    public void enterPass()
    {
        PreDefinedActions.sendKeysMethod(Password, "123456");
    }
	@FindBy(css="#password_confirmation")
	private WebElement ConfirmPass;

    public void enterConfirmPass()
    {
        PreDefinedActions.sendKeysMethod(ConfirmPass, "123456");
    }

	@FindBy(xpath="//button[@type='submit']")
	private WebElement SignUpBtn;

    public void clickSignUpBtn()
    {
        PreDefinedActions.clickMethod(SignUpBtn, true);
    }
	@FindBy(css=".alert.alert-danger")
	private WebElement AlreadyExistMsg;

    public String verifyMsg()
    {
        return PreDefinedActions.getText(AlreadyExistMsg);
    }
    public void scrolldOWN()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by pixel value
        js.executeScript("window.scrollBy(0, 500);");
    }
	@FindBy(xpath="//input[@id='phoneNumber']")
	private WebElement VerifyNumberPlaceholder;

    public boolean verifyPlaceholder()
    {
        return VerifyNumberPlaceholder.isDisplayed();
    }
    public boolean verifyFIRSTnAMEfIELD()
    {
        return FirstName.isDisplayed();
    }
    public boolean verifylASTnAMEfIELD()
    {
        return LastName.isDisplayed();
    }
    public boolean verifyeMAILfIELD()
    {
        return Email.isDisplayed();
    }

    public boolean verifyNumberfIELD()
    {
        return Number.isDisplayed();
    }
    public boolean verifyPassfIELD()
    {
        return Password.isDisplayed();
    }
    public boolean verifyConfirmPassFIELD()
    {
        return ConfirmPass.isDisplayed();
    }
	@FindBy(css=".login-link")
	private WebElement HaveAnAccount;

    public boolean verifyHaveAnAccountText()
    {
        return HaveAnAccount.isDisplayed();
    }
	@FindBy(css="a[class='is-link has-text-brand'] strong")
	private WebElement SignInText;

    public boolean verifySignINtEXT()
    {
        return SignInText.isDisplayed();
    }



















}



