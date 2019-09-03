Feature: View console


@SanityTC_4
Scenario: Login as user in 1 tab and a device in another. Click on ‘View Console’. After sometime, click on ‘Close Console’
Given SC4_browser is launched and userA is on homepage
Then SC4_device is on homepage
Then SC4_userA views device console
Then SC4_userA close console after some time
Then SC4_logout all the users and close the browser
