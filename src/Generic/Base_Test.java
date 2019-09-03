package Generic;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Base_Test implements Auto_const {
	public WebDriver driver;
	
	Robot r;
	
	public void openUserApp() throws InterruptedException
	{
		System.setProperty(chrome_key,chrome_value);
//		ChromeOptions options=new ChromeOptions();
//		
//		options.addArguments("headless");
		driver=new ChromeDriver();
		
		driver.get("https://rocc-jenkins.cloud.pcftest.com/#/idn");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}
	
	
	public void openDeviceApp() throws InterruptedException
	{
		System.setProperty(chrome_key,chrome_value);
		
//		ChromeOptions options=new ChromeOptions();
//		
//		options.addArguments("headless");
		driver=new ChromeDriver();
		
		driver.get("https://rocc-jenkins.cloud.pcftest.com/#/devicelogin");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}
	
	public void pressTab() throws AWTException, InterruptedException
	{
		r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		
		
	}
	public void pressEnter() throws AWTException, InterruptedException
	{
		r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
	}
	public void openNewTab() throws AWTException
	{
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	
	
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}
