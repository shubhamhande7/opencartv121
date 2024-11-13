package testCases;

import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import org.testng.annotations.Test;

public class TC002_LoginTest extends BaseClass {

	@Test
	public void verify_login() {
		logger.info("****Starting TC002_LoginTest.class****");
		try
		{
		//HomePage 
		HomePage hp =new HomePage(driver);
		hp.clickAccount();
		hp.clicklLogin();
		
		LoginPage lp =new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clicklogin();
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExits();
		
		Assert.assertTrue(targetPage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("****Finished TC002_LoginTest.class****");
		}
	
}
