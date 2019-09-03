package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Device_Loginpage {
	
	private static WebElement element = null;
	
	
	// Textbox to enter Device ID in device login page
	
	 public static WebElement deviceId(WebDriver driver){

	element= driver.findElement(By.xpath("//input[@id='deviceIdentity']"));

	    return element;

	    }
	 
	 //philips logo in device login page
	 
	 public static WebElement deviceLogo(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//img[@class='LoginForm_appLogo__14xeJ']/../.."));
		 
		 return element;
	 }
	 
	 //login button in device login page
	 
	 public static WebElement deviceLoginButton(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//button[.='Login']"));
		 
		 return element;
	 }
	 
	 //ReadManual Icon in device login page
	 
	 public static WebElement deviceReferencesLogo(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//i[@class='icon Brand_ReadManual_31X24']"));
		 
		 return element;
	 }

	 //Warning logo in device login page
	 
	 public static WebElement deviceWarningLogo(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//i[@class='icon Brand_Warning_28X24']"));
		 
		 return element;
	 }
	 
	 //copy rights in device login page
	 
	 public static WebElement deviceCopyRights(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//footer[@class='LoginForm_copyright__34rca']"));
		 
		 return element;
	 }

	 
}
