Feature: user C calls user B

@SanityTC_1
Scenario: Login as 2 users in 2 different tabs. Check presence of each user from the other user’s tab. Make an AV call from one user and accept the call from the other user. Login as a 3rd user. Call 2nd user who is already IN_CALL. 2nd user declines the 3rd user’s call. 
Given SC1_Browser is launched and userA is on home page
Then SC1_userA checks the presence of userB
Then SC1_userB is on home page
Then SC1_userB checks the presence of userA
Then SC1_userA makes AV call to userB and userB accept the userA call
Then SC1_userC is on home page
Then SC1_userC call userB
Then SC1_userB declines userC call
Then SC1_Logout all the users and close the browser