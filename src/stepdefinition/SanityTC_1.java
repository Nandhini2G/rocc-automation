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


public class SanityTC_1 extends Base_Test{
	
	
	
	
	
	
	
	@Given("^SC1_Browser is launched and userA is on home page$")
	
	public void SC1_Browser_is_launched_and_userA_is_on_home_page() throws InterruptedException, ParserConfigurationException, SAXException, IOException
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
		
		Thread.sleep(4000);
		
		pressEnter();
		
		User_Homepage.userSeatLocationSaveButton(driver).click();
		
		Thread.sleep(2000);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	@Then("^SC1_userA checks the presence of userB$")
	
	public void SC1_userA_checks_the_presence_of_userB()
	{
		
		try
		{
			
			User_Homepage.userContactsIcon(driver).click();
			
			Log.info("Contacts Icon clicked");
			
			Thread.sleep(2000);
			
			User_Homepage.userSearchContactsTxtbox(driver).sendKeys(ReadXml.ReadUsername("user", "username", 1));
			
			Log.info("Second user name is searched");
			
			Thread.sleep(2000);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
		
	@Then("^SC1_userB is on home page$")
	
	public void SC1_userB_is_on_home_page() throws AWTException, InterruptedException, ParserConfigurationException, SAXException, IOException
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
	
	@Then("^SC1_userB checks the presence of userA$")
	
	public void SC1_userB_checks_the_presence_of_userA() throws ParserConfigurationException, SAXException, IOException, InterruptedException
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
	
	@Then("^SC1_userA makes AV call to userB and userB accept the userA call$")
	
	public void SC1_userA_makes_AV_call_to_userB_and_userB_accept_the_userA_call() throws ParserConfigurationException, SAXException, IOException, InterruptedException, AWTException
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
	
	@Then("^SC1_userC is on home page$")
	
	public void SC1_userC_is_on_homepage() throws AWTException, InterruptedException, ParserConfigurationException, SAXException, IOException
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
	
	@Then("^SC1_userC call userB$")
	
	public void SC1_userC_call_userB() throws InterruptedException, ParserConfigurationException, SAXException, IOException
	{
		try
		{
			
		
		User_Homepage.userContactsIcon(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userSearchContactsTxtbox(driver).sendKeys(ReadXml.ReadUsername("user", "username", 1));
		
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
	
	@Then("^SC1_userB declines userC call$")
	
	public void SC1_userB_declines_userC_call() throws InterruptedException
	{
		
		try 
		{
			
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);
		
		User_Homepage.userDeclineCall(driver).click();
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	@Then("^SC1_Logout all the users and close the browser$")
	
	public void SC1_logout_all_the_users_and_close_the_browser() throws InterruptedException
	{
		
		try
		{
			
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(2));
		
		Thread.sleep(2000);
		
		User_Homepage.userDropdown(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userLogout(driver).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);
		
		User_Homepage.userDropdown(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userLogout(driver).click();
		
		Thread.sleep(2000);

		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(2000);
		
		User_Homepage.userDropdown(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userLogout(driver).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	

}





