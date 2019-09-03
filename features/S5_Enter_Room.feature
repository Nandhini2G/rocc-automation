Feature: Enter Room

@SanityTC_5
Scenario: Login as user in 1 tab and a device in another. Click on ‘View Console’. Click on ‘Enter Room’. Accept the call from device’s side. Click on ‘Console’ icon. Click on ‘Ok’ on the ‘Would you like to Continue’ pop-up. Click on the ‘Console’ icon again on the device’s side
Given SC5_browser is launched and userA is on homepage
Then SC5_device is on homepage
Then SC5_userA views device console and enter device room
Then SC5_userA accepts device call
Then Sc5_perform Action on pop up
Then SC5_logout all the users and close the browser