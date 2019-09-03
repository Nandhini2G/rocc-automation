package stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Generic.Base_Test;
import Generic.ReadXml;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.User_Homepage;
import pageobjects.User_LoginPage;

public class SanityTC_9  extends Base_Test{
	
	@Given("^SC9_browser is launched and user is on homepage$")
	
	public void sc9_browser_is_launched_and_user_is_on_homepage() throws InterruptedException, ParserConfigurationException, SAXException, IOException
	{
		
		try
		{
			
		
		
		openUserApp();
		
		Thread.sleep(2000);
		
		User_LoginPage.userNameTxtbox(driver).sendKeys(ReadXml.ReadEmailID("user", "emailid",0));
		
		Thread.sleep(2000);
		
		User_LoginPage.passWordTxtbox(driver).sendKeys(ReadXml.ReadPassword("user", "password",0));
		
		Thread.sleep(2000);
		
		User_LoginPage.userLoginButton(driver).click();
		
		Thread.sleep(5000);
		
		User_Homepage.userSeatLocation(driver).sendKeys(ReadXml.ReadSeatLocation("SeatLocation", "name", 0));
		
		Log.info("Seat Location Value is been entered");
		
		Thread.sleep(4000);
		
		
		
		User_Homepage.userClickonSeat(driver, ReadXml.ReadSeatLocation("SeatLocation", "name", 0)).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userSeatLocationSaveButton(driver).click();
		
		Thread.sleep(2000);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Then("^SC9_check for existing contact and click the phone number$")
	
	public void sc9_check_for_existing_contact_and_click_on_the_phone_number() throws InterruptedException, AWTException
	{
		try
		{
			
		
		User_Homepage.userContactsIcon(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userCall(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userCallPhoneNumber(driver).click();
		
		Thread.sleep(2000);
		
		pressTab();
		
		Thread.sleep(2000);
		
		pressEnter();
		
		Thread.sleep(2000);
		
		User_Homepage.userCallEndIcon(driver).click();
		
		Thread.sleep(2000);
		
		User_Homepage.userDropdown(driver).click();
		
		Thread.sleep(2000);

		User_Homepage.userLogout(driver).click();
		
		driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}











