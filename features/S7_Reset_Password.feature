Feature: Reset pasword

@SanityTC_7
Scenario: Open the ROCC App. Click on ‘Forgot Password’. Enter mail ID. Login as a user with the new password
Given SC7_browser is launched and ROCC app is launched
Then SC7_click on forgot password and reset the password
Then SC7_Login as user with new password 
