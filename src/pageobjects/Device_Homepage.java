package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Device_Homepage {
	
	private static WebElement element = null;
	
	//Textbox to search the device
	
	public static WebElement deviceSearchContactsTxtbox(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@type='text']"));
		
		return element;
	}
	
	// call icon of the device
	
	public static WebElement deviceCallIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("((//div[@class='content styles_room__2vmP2'])[1]/../../..//i)[3]"));
		
		return element;
	}
	
	//Call ROCC icon of the device
	
	public static WebElement deviceCallROCCIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//span[.='ROCC Call'])[1]"));
		
		return element;
	}
	
	//call phone number icon of the device
	
	public static WebElement deviceCallPhoneNumberIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("((//span[.='ROCC Call'])[1]/../../..//span)[2]"));
		
		return element;
	}
	
	//Dropdown button of the device 
	
	public static WebElement deviceDropdown(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//i[@class='dropdown icon'])[1]"));
		
		return element;
	}
	
	//Reset link of the device
	
	public static WebElement deviceResetLink(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//a[.='Reset Device']"));
		
		return element;
	}
	
	//call button to make a device call
	
	public static WebElement deviceCall(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big Call white']"));
		
		return element;
	}
	
	// task button in the top right corner of the device page
	
	public static WebElement deviceTaskIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big ClipboardChecklist undefined']"));
		
		return element;
	}
	
	//Notifications button in the top right corner of the device page
	
	public static WebElement deviceNotificationsIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[@class='ui active toggle button trigger-button']"));
		
		return element;
	}
	
	//Apps button in the top right corner of the device page

	public static WebElement deviceAppsIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big ImageOverview undefined']"));
		
		return element;
	}
	
	public static WebElement deviceContinueSessionYesButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[.='Yes']"));
		
		return element;
	}
	
	public static WebElement deviceContinueSessionLogoutButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[.='Logout']"));
		
		return element;
	}
	
}

