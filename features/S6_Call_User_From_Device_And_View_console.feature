Feature: Call user from device and view console

@SanityTC_6
Scenario: Login as user in 1 tab and a device in another. Call the user from the device. Accept the call from the user’s side. Click on ‘Console icon from the device’s side
Given SC6_browser is launched and userA is on homepage
Then SC6_Device is on homepage
Then SC6_Call User from device 
Then SC6_user accepts the call from device
Then SC6_from device click on console icon