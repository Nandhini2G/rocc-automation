package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class User_LoginPage {
	
	private static WebElement element = null;
	
	//To enter the username in login page
	
	 public static WebElement userNameTxtbox(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@name='email']"));

	    return element;

	    }
	 
	 //To enter the password in login page
	 
	 public static WebElement passWordTxtbox(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@name='password']"));

	 return element;

	    }
	 
	 //Login button to login
	 
	 public static WebElement userLoginButton(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//button[.='Login']"));
		 
		 return element;
	 }
	 
	 // Reset password link in login page
	 
	 public static WebElement UserResetPasswordLink(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//a[.='Forgot password?']"));
		 
		 return element;
	 }
	 
	 //philips logo in login page
	 
	 public static WebElement UserPhilipsLogo(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//img[@class='LoginForm_appLogo__14xeJ']/../.."));
		 
		 return element;
	 }
	 
	 //warning logo in login page
	 
	 public static WebElement userWarningLogo(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//i[@class='icon Brand_Warning_28X24']"));
		 
		 return element;
	 }
	 
	 //user references logo in login page
	 
	 public static WebElement userReferencesLogo(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//i[@class='icon Brand_ReadManual_31X24']"));
		 
		 return element;
	 }
	 
	 //copyRight link in login page
	 
	 public static WebElement userCopyRight(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//footer[@class='LoginForm_copyright__34rca']"));
		 
		 return element;
	 }
	 
	 // show password icon in login page
	 
	 public static WebElement userShowPasswordICon(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath("//i[@class='icon showPasswordIcon Hide']"));
		 
		 return element;
	 }
	 
	 

	}


