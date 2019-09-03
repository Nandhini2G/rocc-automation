Feature: Settings

@SanityTC_8
Scenario: Login as a user. Click on ‘User settings’. Change the settings. Make a call. Click on ‘Gear’ icon to see the newly changed settings being auto-populated
Given SC8_browser is launched and user is on homepage
Then SC8_click on settings and change the settings
Then SC8_Make a call and check for new settings are populated

