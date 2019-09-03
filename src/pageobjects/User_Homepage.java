package pageobjects;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.SAXException;

import Generic.ReadXml;

public class User_Homepage {
	
	private static WebElement element = null;
	
	//Seat location select editable dropdown 
	
	public static WebElement userSeatLocation(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@class='search']"));
		
		return element;
	}
	
	public static WebElement userClickonSeat(WebDriver driver, String seatname) throws ParserConfigurationException, SAXException, IOException
	{
		
		seatname=ReadXml.ReadSeatLocation("SeatLocation", "name", 0);
		element=driver.findElement(By.xpath("//span[.='"+seatname+"']"));
		
		return element;
				
	}
	
	//save button after selecting seat location 
	
	public static WebElement userSeatLocationSaveButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[.='Save']"));
		
		return element;
	}
	
	//Home icon in top left of the page
	
	public static WebElement userHomeIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big Home']"));
		
		return element;
	}
	
	//contacts icon to switch and view contacts
	
	public static WebElement userContactsIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big Contacts']"));
		
		return element;
	}
	
	//textbox to search the contacts
	
	public static WebElement userSearchContactsTxtbox(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@type='text']"));
		
		return element;
	}
	
	//dropdown in contacts
	
	public static WebElement userCallIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("((//div[@class='content styles_room__2vmP2'])[1]/../../..//i)[3]"));
		
		return element;
	}
	
	//ROCC Call button in dropdown
	
	public static WebElement userCallROCCIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//span[.='ROCC Call'])[1]"));
		
		return element;
	}
	
	//Phone number call button in dropdown
	
	public static WebElement userCallPhoneNumber(WebDriver driver)
	{
		element=driver.findElement(By.xpath("((//span[.='ROCC Call'])[1]/../../..//span)[2]"));
		
		return element;
	}
	
	//User Dropdown in the top right corner
	
	public static WebElement userDropdown(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//i[@class='dropdown icon'])[1]"));
		
		return element;
	}
	
	//About link in user Dropdown
	
	public static WebElement aboutUser(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[.='About']"));
		
		return element;
	}
	
	//Logout link in user Dropdown
	
	public static WebElement userLogout(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[.='Logout']"));
		
		return element;
	}
	
	//Call Icon in contacts
	
	public static WebElement userCall(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='big icon Call styles_icon__2AJsE']"));
		
		return element;
	}
	
	
	//Tasks button on top right corner
	
	public static WebElement userTasksIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big ClipboardChecklist undefined']"));
		
		return element;
	}
	
	//notifications icon in top right corner
	
	public static WebElement userNotificationsIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big Alarm undefined']"));
		
		return element;
	}
	
	//Apps button in top right corner
	
	public static WebElement userAppsIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon big ImageOverview undefined']"));
		
		return element;
	}
	
	//User status icon in contacts menu
	
	public static WebElement userStatusIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//img[@class='ui image ui medium small image circular']/../i"));
		
		return element;
	}
	
	//user outgoing calling window
	
	public static WebElement userOutgoingCallWindow(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='ui grid OutgoingCall_callHeaderGrid__1kV3z']/../../../.."));
		
		return element;
	}
	
	// user outgoing caller name
	
	public static WebElement userOutgoingCallName(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//h3[@class='ui header OutgoingCall_display-name__1D17c']"));
		
		return element;
	}
	
	//user missed call status
	
	public static WebElement userMissedCallStatus(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//div[.='Call Missed'])[3]"));
		
		return element;
	}
	
	// close button of the window after call is missed
	
	public static WebElement userCLoseButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[.='Close']"));
		
		return element;
	}
	
	//Missed call status
	
	
	public static WebElement userMissedYourCallStatus(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='content' and contains(.,'missed')]"));
		
		return element;
	}
	
	
	//user incoming call window
	
	
	public static WebElement userIncomingCallWindow(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='row styles_callerName__tonSw']/../.."));
		
		return element;
	}
	
	//incoming caller name 
	
	
	public static WebElement userIncomingCallerName(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='row styles_callerName__tonSw']"));
		
		return element;
	}
	
	// supertech followed by hospital name in incoming call window
	
	public static WebElement userSupertech(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//div[@class='row styles_hospitalDetails__Wuant' and contains(.,'SuperTech')]"));
		
		return element;
	}
	
	//decline the call Icon in incoming caller window
	
	public static WebElement userEndCallIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='big icon Call styles_declineIcon__2UQpQ']"));
		
		return element;
	}
	
	
	//Decline the call button in incoming caller window
	
	public static WebElement userDeclineCall(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//span[@class='styles_decline__2FIn7']"));
		
		return element;
	}
	
	//Accept the call icon in incoming caller window
	
	public static WebElement userAcceptCallIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='big icon Call styles_answerIcon__wcbs7']"));
		
		return element;
	}
	
	//Accept call button in incoming caller window
	
	public static WebElement userAcceptCall(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//span[@class='styles_answer__3dDLU']"));
		
		return element;
	}
	
	//Message after the user declined the call
	
	public static WebElement userDeclinedYourCallStatus(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='content' and contains(.,'declined')]"));
		
		return element;
	}
	
	//Call Declined banner in the window after user declined your call
	
	public static WebElement userDeclinedCall(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//div[.='Call Declined'])[3]"));
		
		return element;
	}
	
	//Call Loading symbol when a call is made to user
	
	public static WebElement userCallLoading(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='css-5f7lqs-style-style']"));
		
		return element;
	}
	
	//calling message when call is made to user
	
	public static WebElement userCallingText(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//span[.='Calling']"));
		
		return element;
	}
	
	//Call end button when calling the user
	
	public static WebElement userCallEndIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='red phone circular inverted icon']"));
		
		return element;
	}
	
	
	//call window of the caller when user accepts the call
	
	public static WebElement userYourCallWindow(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//video)[2]"));
		
		return element;
	}
	
	public static WebElement userOtherCallWindow(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//video)[1]"));
		
		return element;
	}
	
	//call window of the acceptor
	
	public static WebElement userAddUserIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon PersonPortrait VideoComponent_iconStyle__3tjum']"));
		
		return element;
	}
	
	//Camera icon in the call window
	
	public static WebElement userCameraIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon video VideoComponent_iconStyle__3tjum']"));
		
		return element;
	}
	
	//mic icon in the call window
	
	public static WebElement userMicIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon microphone VideoComponent_iconStyle__3tjum']"));
		
		return element;
	}
	
	//end video call icon in then call window
	
	public static WebElement userEndVideoCallIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon phone VideoComponent_phone__14oG7']"));
		
		return element;
	}
	
	//volume icon in the call window
	
	public static WebElement userVolumeIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon Audio VideoComponent_iconStyle__3tjum']"));
		
		return element;
	}
	
	//video call settings icon in the call window
	
	public static WebElement userVideoCallSettingIcon(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//i[@class='icon Settings VideoComponent_iconStyle__3tjum']"));
		
		return element;
	}
	
	// Status of the device when in call
	
	
	public static WebElement userResourceStatusInCall(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='description styles_status__1U9NL' and contains(.,'IN_CALL')]"));
		
		return element;
	}
	
	//Status of the device  when its available
	
	public static WebElement userResourceStatusAvailable(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='description styles_status__1U9NL' and contains(.,'AVAILABLE')]"));
		
		return element;
	}
	
	// Status of the device when it is offline
	
	public static WebElement userResourceStatusOffLine(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='description styles_status__1U9NL' and contains(.,'OFFLINE')]"));
		
		return element;
	}
	
	//Name of the device
	
	
	public static WebElement userResourceName(WebDriver driver, String resource_name)
	{
		element=driver.findElement(By.xpath("//div[@class='content styles_roomName__HnQqP' and contains(.,'"+resource_name+"')]"));
		
		return element;
	}
	
	//View console link in device
	
	public static WebElement userViewConsoleLink(WebDriver driver,String resource_name)
	{
		element=driver.findElement(By.xpath("(//div[@class='content styles_roomName__HnQqP' and contains(.,'"+resource_name+"')]/../../..//span)[1]"));
		
		return element;
	}
	
	//enter room link in device
	
	public static WebElement userEnterRoomLink(WebDriver driver,String resource_name)
	{
		element=driver.findElement(By.xpath("(//div[@class='content styles_roomName__HnQqP' and contains(.,'"+resource_name+"')]/../../..//span)[4]"));
		
		return element;
	}
	
	//Call icon in device or resource
	
	public static WebElement userResourceCallIcon(WebDriver driver,String resource_name)
	{
		element=driver.findElement(By.xpath("(//div[@class='content styles_roomName__HnQqP' and contains(.,'"+resource_name+"')]/../../..//span)[6]"));
		
		return element;
	}
	
	
	
	//viewing banner when user is viewing console of device
	
	public static WebElement userViewingConsoleBanner(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//span[contains(.,'Viewing')]"));
		
		return element;
	}
	
	//close console link of device
	
	public static WebElement userCloseConsoleLink(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//span[.='Close Console'])[1]"));
		
		return element;
	}
	
	//banner when user is viewing another user console
	
	public static WebElement userViewingUserBanner(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//span[contains(.,'Viewing')]"));
		
		return element;
	}
	
	
	// banner when user is connecting to another user console
	
	public static WebElement userConnectingToConsoleBanner(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//span[contains(.,'Connecting to Console')]"));
		
		return element;
	}
	
	//text in the pop up
	
	public static WebElement userPopUpText(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//div[@class='content'])[2]"));
		
		return element;
	}
	
	//cancel button in popup
	
	public static WebElement userPopUpCancelButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[.='Cancel']"));
		
		return element;
	}
	
	// ok button in popup
	
	public static WebElement userPopUpOkButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[.='OK']"));
		
		return element;
	}
	
	//banner showing which user is controlling user console
	
	public static WebElement userControllingUserBanner(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//span[contains(.,'Controlling')]"));
		
		return element;
	}
	
	// timer of the call in call window
	
	
	public static WebElement userCallTimer(WebDriver driver)
	{
		element=driver.findElement(By.xpath("(//h3[@class='ui header VideoComponent_header-icon__1EzHE'])[2]"));
		
		return element;
	}
	
	//phone number of the user
	
	public static WebElement userPhoneNumber(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[@class='OutgoingCall_main-text__2SPWf']"));
		
		return element;
	}
	
	// status of user calling and phone number
	
	public static WebElement userPhoneNumberCallingStatus(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//div[.='Calling']"));
		
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
