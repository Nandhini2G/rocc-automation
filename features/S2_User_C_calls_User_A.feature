Feature: User C calls User A

@SanityTC_2
Scenario: Login as 2 users in 2 different tabs. Make an AV call from one user and accept the call from the other user. Login as a 3rd user. Call the 1st user who is already IN_CALL. 1st user accepts the call. End the call from 3rd user
Given SC2_Browser is launched and userA is on home page
Then SC2_userA checks the presence of userB
Then SC2_userB is on home page
Then SC2_userB checks the presence of userA
Then SC2_userB makes AV call to userA and userA accepts userB call
Then SC2_userC is on homepage
Then SC2_userC make AV call to userA
Then SC2_userA accepts userC call
Then SC2_userC end the call
Then SC2_ logout all the users and close the browser