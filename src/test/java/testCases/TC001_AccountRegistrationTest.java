package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{

	
	 @Test
	 public void verify_account_registration()
	 {
		 logger.info("****** Strating TC001_AccountRegistrationTest****");
		 
		 try
		 {
		 HomePage hp= new  HomePage(driver);
		 hp.clickAccount();
		 logger.info("clicked on myaccount link");
		 
		 hp.clickRegister();
		 logger.info("Providing customer deatils");
		  
		 AccountRegistrationPage repage = new AccountRegistrationPage(driver);
		 logger.info("clicked on myRegister link");
		 repage.setFirstName(randomeString().toUpperCase());
		 repage.setLastName(randomeString().toUpperCase());
		 repage.setEmail(randomeString()+"@gmail.com");
		 repage.setTelephone(randomeNumber());
		 
		 String password= randomeAlphaNumber();
		 
		 repage.setPassword(password);
		 repage.setConfirmPassword(password);
		 repage.setPrivacyPolicy();
		 repage.clickContinue();
		 }
		 catch(Exception e)
		 {
			 logger.error("Test failed...");
			 logger.debug("debug logs..");
			
		 }
		 logger.info("****** finished TC001_AccountRegistrationTest****");
		 }
}
	 
	
