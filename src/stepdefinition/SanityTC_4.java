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
import pageobjects.Device_Loginpage;
import pageobjects.User_Homepage;
import pageobjects.User_LoginPage;

public class SanityTC_4 extends Base_Test{
	
	@Given("^SC4_browser is launched and userA is on homepage$")
	
	public void SC4_browser_is_launched_and_userA_is_on_homepage()
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
	
	@Then("^SC4_device is on homepage$")
	
	public void SC4_device_is_on_homepage() throws InterruptedException, ParserConfigurationException, SAXException, IOException, AWTException
	{
		openNewTab();
		
		Thread.sleep(2000);
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		
	
		
		Thread.sleep(2000);
		
		driver.get(ROCC_DEVICELOGIN_URL);
		
		Thread.sleep(2000);
		
		Device_Loginpage.deviceId(driver).sendKeys(ReadXml.ReadDeviceID("device", "deviceId",1));
		
		System.out.println(ReadXml.ReadDeviceID("device", "deviceId",1));
		
		Thread.sleep(2000);
		
		Device_Loginpage.deviceLoginButton(driver).click();
		
		Thread.sleep(2000);
		
	}
	
	@Then("^SC4_userA views device console$")
	
	public void SC4_userA_views_device_console()
	{
		
	}
	
	@Then("^SC4_userA close console after some time$")
	
	public void SC4_userA_close_console_after_some_time()
	{
		
	}
	
	@Then("^SC4_logout all the users and close the browser$")
	
	public void SC4_logout_all_the_users_and_close_the_browser()
	{
		
	}
	
	

}







