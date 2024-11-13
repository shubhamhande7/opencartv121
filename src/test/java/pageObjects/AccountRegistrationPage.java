package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

WebDriver driver;
	public AccountRegistrationPage (WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement txtFirstName;
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement txtLasttName;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement txtTelephne;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement txtConfirmPassword;
 
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement chkPolicy;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement btnContinue;
	
	
	
	 public void setFirstName(String fname)
	 {
		 txtFirstName.sendKeys(fname); ;
	 }
	 
	 public void setLastName(String lname)
	 {
		 txtLasttName.sendKeys(lname); ;
	 }
	 
	 public void setEmail(String email)
	 {
		 txtEmail.sendKeys(email); 
	 }
	 
	 public void setTelephone(String tel)
	 {
		 txtTelephne.sendKeys(tel);;
	 }
	 
	 public void setPassword(String pwd)
	 {
		 txtPassword.sendKeys(pwd);
	 }
	 
	 public void setConfirmPassword(String pwd)
	 {
		 txtConfirmPassword.sendKeys(pwd);
	 }
	 
	 public void setPrivacyPolicy()
	 {
		 chkPolicy.click();
	 }
	 
	 public void clickContinue()
	 {
		 btnContinue.click();
		 
		 //btnContinue.submit();
		 
		// Actions act = new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
		 
		 //btnContinue.sendKeys(Keys.RETURN);
	 }

} 


