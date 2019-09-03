package stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Generic.Base_Test;
import Generic.ReadXml;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.User_Homepage;
import pageobjects.User_LoginPage;

public class SanityTC_2 extends Base_Test{
	
	@Given("^SC2_Browser is launched and userA is on home page$")
	
	public void SC2_browser_is_launched_and_userA_is_on_home_page()
	{
		try
		{
			
		openUserApp();
		
		Thread.sleep(2000);
		
		Log.info("The application is launched in the browser");
		
		Thread.sleep(2000);
		
		User_LoginPage.userNameTxtbox(driver).sendKeys(ReadXml.ReadUsername("user", "emailid", 0));
		
		Log.info("The username is entered");
		
		Thread.sleep(2000);
		
		User_LoginPage.passWordTxtbox(driver).sendKeys(ReadXml.ReadPassword("user", "password", 0));
		
		Log.info("The password is entered");
		
		Thread.sleep(2000);
		
		User_LoginPage.userLoginButton(driver).click();
		
		Log.info("The First user is logged into the application");
		
		Thread.sleep(5000);
		
		User_Homepage.userSeatLocation(driver).sendKeys(ReadXml.ReadSeatLocation("SeatLocation", "name", 0));
		
		Log.info("Seat Location Value is been entered");
		
		Thread.sleep(5000);
		
		User_Homepage.userClickonSeat(driver, ReadXml.ReadSeatLocation("SeatLocation", "name", 0)).click();;
		
		Thread.sleep(2000);
		
		User_Homepage.userSeatLocationSaveButton(driver).click();
		
		Thread.sleep(2000);
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
		
	@Then("^SC2_userA checks the presence of userB$")
	
	public void SC2_userA_checks_the_presence_of_userB()
	{
		try
		{
			User_Homepage.userContactsIcon(driver).click();
			
			Thread.sleep(2000);
			
			User_Homepage.userSearchContactsTxtbox(driver).sendKeys(ReadXml.ReadUsername("user", "username", 1));
			
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^SC2_userB is on home page$")
	
	public void SC2_userB_is_on_home_page()
	{
		try
		{
			
			openNewTab();
			
			Thread.sleep(2000);
			
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			
			
			
			Thread.sleep(3000);

			driver.switchTo().window(tabs.get(1));
			
			Thread.sleep(2000);
			
			driver.get(ROCC_USERLOGIN_URL);
			
			Thread.sleep(2000);
			
			User_LoginPage.userNameTxtbox(driver).sendKeys(ReadXml.ReadEmailID("user", "emailid", 1));
			
			Thread.sleep(1000);
			
			User_LoginPage.passWordTxtbox(driver).sendKeys(ReadXml.ReadPassword("user", "password", 1));
			
			Thread.sleep(2000);
			
			User_LoginPage.userLoginButton(driver).click();
			
			Thread.sleep(2000);
			
			Log.info("The First user is logged into the application");
			
			Thread.sleep(3000);
			
			User_Homepage.userSeatLocation(driver).sendKeys(ReadXml.ReadSeatLocation("SeatLocation", "name", 0));
			
			Log.info("Seat Location Value is been entered");
			
			Thread.sleep(2000);
			
			User_Homepage.userClickonSeat(driver,ReadXml.ReadSeatLocation("SeatLocation", "name", 0)).click();
			
			Thread.sleep(2000);
			
			User_Homepage.userSeatLocationSaveButton(driver).click();
			
			Thread.sleep(2000);
			
			
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^SC2_userB checks the presence of userA$")
	
	public void SC2_userB_checks_the_presence_of_userA() throws InterruptedException, ParserConfigurationException, SAXException, IOException
	{
		
		try
		{
		User_Homepage.userContactsIcon(driver).click();
		
		Thread.sleep(2000);

		User_Homepage.userSearchContactsTxtbox(driver).sendKeys(ReadXml.ReadUsername("user","username",0));
		
		Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^SC2_userB makes AV call to userA and userA accepts userB call$")
	
	public void SC2_userB_makes_AV_call_to_userA_and_userA_accepts_userB_call()
	{
		
		try
		{
			
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(tabs.get(0));
			
			Thread.sleep(2000);
			
			User_Homepage.userCall(driver).click();
			
			Thread.sleep(2000);
			
			User_Homepage.userCallROCCIcon(driver).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().window(tabs.get(1));
			
			Thread.sleep(2000);
			
			User_Homepage.userAcceptCall(driver).click();
			
			Thread.sleep(5000);
			
			pressTab();
			
			pressEnter();
			
			Thread.sleep(2000);
			
			driver.switchTo().window(tabs.get(0));
			
			Thread.sleep(2000);
			
			for(int i=0;i<7;i++)
			{
				pressTab();
				
				Thread.sleep(2000);
			}
			
			
			pressEnter();
			
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Then("^SC2_userC is on homepage$")
	
	public void SC2_user_is_on_homepage() throws AWTException, InterruptedException, ParserConfigurationException, SAXException, IOException
	{
		try
		{
			openNewTab();
			
			Thread.sleep(2000);
			
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(tabs.get(2));
			
			driver.get(ROCC_USERLOGIN_URL);
			
			Thread.sleep(2000);
			
			User_LoginPage.userNameTxtbox(driver).sendKeys(ReadXml.ReadEmailID("user", "emailid", 2));
			
			Thread.sleep(1000);
			
			User_LoginPage.passWordTxtbox(driver).sendKeys(ReadXml.ReadPassword("user", "password", 2));
			
			Thread.sleep(2000);
			
			User_LoginPage.userLoginButton(driver).click();
			
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			
			User_Homepage.userSeatLocation(driver).sendKeys(ReadXml.ReadSeatLocation("SeatLocation", "name", 0));
			
			Log.info("Seat Location Value is been entered");
			
			Thread.sleep(2000);
			
			User_Homepage.userClickonSeat(driver,ReadXml.ReadSeatLocation("SeatLocation", "name", 0)).click();
			
			Thread.sleep(2000);
			
			User_Homepage.userSeatLocationSaveButton(driver).click();
			
			Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Then("^SC2_userC make AV call to userA$")
	
	public void SC2_userC_make_AV_call_to_userA()
	{
		try
		{
			User_Homepage.userContactsIcon(driver).click();
			
			Thread.sleep(2000);
			
			User_Homepage.userSearchContactsTxtbox(driver).sendKeys(ReadXml.ReadUsername("user", "username", 0));
			
			Thread.sleep(2000);
			
			User_Homepage.userCallIcon(driver).click();
			
			Thread.sleep(2000);
			
			User_Homepage.userCallROCCIcon(driver).click();
			
			Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^SC2_userA accepts userC call$")
	
	public void SC2_userA_accpets_userC_call()
	{
		try
		{
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(tabs.get(0));
			
			Thread.sleep(2000);
			
			User_Homepage.userAcceptCall(driver).click();
			
			Thread.sleep(2000);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^SC2_userC end the call$")
	
	public void SC2_userC_end_the_call()
	{
		try
		{
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(tabs.get(2));
			
			Thread.sleep(2000);
			
			User_Homepage.userCallEndIcon(driver).click();
			
			Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^SC2_ logout all the users and close the browser$")
	
	public void SC2_logout_all_the_users_and_close_the_browser() throws InterruptedException
	{
		
		try
		{
			
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
		Thread.sleep(2000);
		
		User_Homepage.userDropdown(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userLogout(driver).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);
		
		User_Homepage.userDropdown(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userLogout(driver).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(2000);
		
		User_Homepage.userDropdown(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userLogout(driver).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
}




