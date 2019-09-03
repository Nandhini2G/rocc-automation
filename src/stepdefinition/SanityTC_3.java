package stepdefinition;

import Generic.Base_Test;

import Generic.ReadXml;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.Device_Homepage;
import pageobjects.User_Homepage;
import pageobjects.User_LoginPage;

public class SanityTC_3 extends Base_Test{
	
	@Given("^SC3_browser is launched and userA is on homepage$")
	
	public void SC3_browser_is_launched_and_userA_is_on_homepage()
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
	
	@Then("^SC3_userA leaves the session idle for 10 minutes_1$")
	
	public void SC3_userA_leaves_the_session_idle_for_10_minutes() throws InterruptedException
	{
		Thread.sleep(610000);
	}
	
	@Then("^SC3_on the session expiry notification userA click on yes$")
	
	public void SC3_on_the_session_expiry_notification_userA_click_on_yes()
	{
		try
		{
			
		
		Device_Homepage.deviceContinueSessionYesButton(driver).click();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^SC3_userA leaves the session idle for 10 minutes$")
	
	public void SC3_userA_leaves_the_session_idle_for_10minutes() throws InterruptedException
	{
		Thread.sleep(610000);
	}
	
	@Then("^SC3_on the session expiry notification userA click on logout$")
	
	public void SC3_on_the_session_expiry_notification_userA_click_on_logout()
	{
		try
		{
			
		
		Device_Homepage.deviceContinueSessionLogoutButton(driver).click();
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Then("^SC3_logout all the users and close the browser$")
	
	public void SC3_logout_all_the_users_and_close_the_browser()
	{
		
	}

}






