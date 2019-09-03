package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class Base_Page implements Auto_const
{
	public WebDriver driver;
		
	//Constructor initialization
	public Base_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method to verify title
	public boolean verifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			System.out.println("Title Matches");
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	//Method to verify webelement
	public boolean verifyElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			Assert.fail("The element is not present");
			wait.until(ExpectedConditions.visibilityOf(element));
			
			
			return true;
		}
		
		catch(Exception e)
		{
			//Reporter.log("Element is not present", true);
			Assert.fail("The element is not present");
			return false;
		}
	}
	
	//Method to find user status
	
	public String findUserStatus(WebElement userStatusIcon)
	{
		String status="";
		String statusClass=userStatusIcon.getAttribute("class");
		if(statusClass.contains("OFFLINE"))
			status="OFFLINE";
		else if(statusClass.contains("AVAILABLE"))
			status="ONLINE";
		else if(statusClass.contains("IN_CALL"))
			status="IN_CALL";
		else
			status="INVALID";
		return status;
	}
}
