package PageObjects;

import Actions.PreDefinedActions;
import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProfileDetailsPage extends BaseClass {
    public ProfileDetailsPage()//create a constructor
    {
        PageFactory.initElements(driver, this);//initializing the driver and web-elements
    }
    @FindBy(css="img[src='https://pickndeal.oidea.online/laravel_app/public//assets/images/logo.png']")
    private WebElement WelcomeHeading;

    public boolean verifyHeading()
    {
        return WelcomeHeading.isDisplayed();
    }
	@FindBy(xpath="(//input[@id='business_name'])[1]")
	private WebElement SuppliersName;

    public void enterSuppliersName()
    {
        PreDefinedActions.clickMethod(SuppliersName, true);
        PreDefinedActions.sendKeysMethod(SuppliersName, "Isha's Multinational Business");
    }
	@FindBy(xpath="//span[text()=' Biscut']")
	private WebElement Categories;

	@FindBy(css="div[role='listbox']")
	private WebElement webElement1;


    public void selectCategory()
    {
         PreDefinedActions.clickMethod(webElement1, true);
        PreDefinedActions.clickMethod(Categories, true);
      //  Select prod= new Select(webElement1);
       // prod.selectByVisibleText("Biscut");

    }
	@FindBy(css="body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > input:nth-child(2)")
	private WebElement Address1;

    public void enterAddress1()
    {
        PreDefinedActions.clickMethod(Address1, true);

        PreDefinedActions.sendKeysMethod(Address1, "U.P");
    }
	@FindBy(css="body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > input:nth-child(2)")
	private WebElement Address2;

    public void enterAddress2()
    {
       // PreDefinedActions.clickMethod(Address2, true);

        PreDefinedActions.sendKeysMethod(Address2, "Lot 24-C-12, U.P. Diliman, East Campus, Katipunan Ave, Diliman, Quezon City, 1800 Metro Manila, Philippines");
      PreDefinedActions.clickMethod(Address2, true);
    }

	@FindBy(xpath="//small[normalize-space()='For Distance Measurement']")
	private WebElement MeasurementText;

    public String verifyText()
    {
        return PreDefinedActions.getText(MeasurementText);

    }
	@FindBy(id="address")
	private WebElement DeliveryRadius;
    public void enterDeliveryRadius()
    {

        PreDefinedActions.clickMethod(DeliveryRadius, true);

        PreDefinedActions.sendKeysMethod(DeliveryRadius, "12");
    }
	@FindBy(css="div[id='vs1__combobox'] div[class='vs__selected-options']")
	private WebElement Country;

	@FindBy(css="#vs1__option-100")
	private WebElement webElement2;


    public void enterCountry()
    {
        PreDefinedActions.clickMethod(Country, true);
       // PreDefinedActions.sendKeysMethod(webElement2, "India");
        PreDefinedActions.clickMethod(webElement2, true);
        //select.selectByVisibleText("India");
    }
	@FindBy(css="#vs2__combobox")
	private WebElement State;

	@FindBy(css="#vs2__option-3")
	private WebElement webElement3;

    public void enterState()
    {
        PreDefinedActions.clickMethod(State, true);
        PreDefinedActions.clickMethod(webElement3, true);

    }
	@FindBy(css="#vs3__combobox")
	private WebElement City;

	@FindBy(css="#vs3__option-0")
	private WebElement webElement4;

    public void enterCity()
    {
        PreDefinedActions.clickMethod(City, true);
        PreDefinedActions.clickMethod(webElement4, true);

    }
	@FindBy(css="#zip")
	private WebElement Zip;

    public void enterZip()
    {
        PreDefinedActions.clickMethod(Zip, true);

        PreDefinedActions.sendKeysMethod(Zip, "567896");
    }
	@FindBy(css="select[class='mb-2 mob']")
    private WebElement Day;

    public void enterDay()
    {
        PreDefinedActions.clickMethod(Day, true);
        Select select= new Select(Day);
        select.selectByVisibleText("Monday");
    }
	@FindBy(xpath="//input[@name='from']")
	private WebElement From;

    public void enterFrom()
    {
        PreDefinedActions.clickMethod(From, true);
        PreDefinedActions.sendKeysMethod(From, "22:49");

   }
	@FindBy(css="input[name='to']")
	private WebElement To;

    public void enterTo()
    {
        PreDefinedActions.clickMethod(To, true);
        PreDefinedActions.sendKeysMethod(To, "22:50");

    }
	@FindBy(css=".fa.fa-plus-circle")
	private WebElement Add;

    public void pressAdd()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", Add);

    }
    public void scrolldOWN()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by pixel value
        js.executeScript("window.scrollBy(0, 500);");
    }
	@FindBy(xpath="//textarea[@class='form-control']")
	private WebElement AboutUs;

    public void enterText()
    {

        PreDefinedActions.clickMethod(AboutUs, true);
        PreDefinedActions.sendKeysMethod(AboutUs, "Read carefully!");
    }

	@FindBy(css="#uploads")
	private WebElement File;


        public void fileUploadTest() {


        PreDefinedActions.clickMethod(File, true);
         PreDefinedActions.sendKeysMethod(File, "C:\\Users\\Himanshu\\Desktop\\Selenium.txt");
    }

	@FindBy(css="button[type='submit']")
	private WebElement Submit;

    public void clicSubmitBtn()
    {
        Submit.submit();

        PreDefinedActions.clickMethod(Submit, true);

    }
	@FindBy(css="div[class='headerForm'] p")
	private WebElement Heading2;

    public String verifyHeading2()  {
      return PreDefinedActions.getText(Heading2);

}
	@FindBy(xpath="//div[text()='Profile Updated Successfully ")
	private WebElement msg;

    public String verifymsg()
    {
        return PreDefinedActions.getText(msg);

    }



}

















