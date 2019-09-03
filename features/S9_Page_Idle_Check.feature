
Feature: Page idle check

@SanityTC_3
Scenario: Login as 1 user. Leave the session idle for 10 minutes. On the session expiry notification, click on ‘Yes’. Leave the session idle for 10 minutes. On the session expiry notification, click on ‘Logout’
Given SC3_browser is launched and userA is on homepage
Then SC3_userA leaves the session idle for 10 minutes_1
Then SC3_on the session expiry notification userA click on yes
Then SC3_userA leaves the session idle for 10 minutes
Then SC3_on the session expiry notification userA click on logout
Then SC3_logout all the users and close the browser