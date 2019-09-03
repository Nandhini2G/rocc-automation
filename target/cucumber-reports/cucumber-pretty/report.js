$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mytest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login as 2 users in 2 different tabs. Check presence of each user from the other user�s tab. Make an AV call from one user and accept the call from the other user. Login as a 3rd user. Call 2nd user who is already IN_CALL. 2nd user declines the 3rd user�s call.",
  "description": "",
  "id": "login-action;login-as-2-users-in-2-different-tabs.-check-presence-of-each-user-from-the-other-user�s-tab.-make-an-av-call-from-one-user-and-accept-the-call-from-the-other-user.-login-as-a-3rd-user.-call-2nd-user-who-is-already-in-call.-2nd-user-declines-the-3rd-user�s-call.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTC_1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "SC1_Browser is launched and userA is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "SC1_userA checks the presence of userB",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "SC1_userB is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "SC1_userB checks the presence of userA",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "SC1_userA makes AV call to userB and userB accept the userA call",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "SC1_userC is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "SC1_userC call userB",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "SC1_userB declines userC call",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "SC1_Logout all the users and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_1.SC1_Browser_is_launched_and_userA_is_on_home_page()"
});
formatter.result({
  "duration": 38692375826,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_userA_checks_the_presence_of_userB()"
});
formatter.result({
  "duration": 4720214630,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_userB_is_on_home_page()"
});
formatter.result({
  "duration": 2072004601,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_userB_checks_the_presence_of_userA()"
});
formatter.result({
  "duration": 16410,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_userA_makes_AV_call_to_userB_and_userB_accept_the_userA_call()"
});
formatter.result({
  "duration": 25846,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_userC_is_on_homepage()"
});
formatter.result({
  "duration": 25026,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_userC_call_userB()"
});
formatter.result({
  "duration": 18872,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_userB_declines_userC_call()"
});
formatter.result({
  "duration": 66461,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_1.SC1_logout_all_the_users_and_close_the_browser()"
});
formatter.result({
  "duration": 16820,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login as 2 users in 2 different tabs. Make an AV call from one user and accept the call from the other user. Login as a 3rd user. Call the 1st user who is already IN_CALL. 1st user accepts the call. End the call from 3rd user",
  "description": "",
  "id": "login-action;login-as-2-users-in-2-different-tabs.-make-an-av-call-from-one-user-and-accept-the-call-from-the-other-user.-login-as-a-3rd-user.-call-the-1st-user-who-is-already-in-call.-1st-user-accepts-the-call.-end-the-call-from-3rd-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SanityTC_2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "SC2_Browser is launched and userA is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "SC2_userB is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "SC2_userB makes AV call to userA and userA accepts userB call",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "SC2_userC is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "SC2_userC make AV call to userA",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "SC2_userA accepts userC call",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "SC2_userC end the call",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "SC2_ logout all the users and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_2.SC2_browser_is_launched_and_userA_is_on_home_page()"
});
formatter.result({
  "duration": 64000,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_2.SC2_userB_is_on_home_page()"
});
formatter.result({
  "duration": 17641,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_2.SC2_userB_makes_AV_call_to_userA_and_userA_accepts_userB_call()"
});
formatter.result({
  "duration": 22564,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_2.SC2_user_is_on_homepage()"
});
formatter.result({
  "duration": 39385,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_2.SC2_userC_make_AV_call_to_userA()"
});
formatter.result({
  "duration": 19282,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_2.SC2_userA_accpets_userC_call()"
});
formatter.result({
  "duration": 19282,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_2.SC2_userC_end_the_call()"
});
formatter.result({
  "duration": 16410,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_2.SC2_logout_all_the_users_and_close_the_browser()"
});
formatter.result({
  "duration": 15590,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Login as 1 user. Leave the session idle for 10 minutes. On the session expiry notification, click on �Yes�. Leave the session idle for 10 minutes. On the session expiry notification, click on �Logout�",
  "description": "",
  "id": "login-action;login-as-1-user.-leave-the-session-idle-for-10-minutes.-on-the-session-expiry-notification,-click-on-�yes�.-leave-the-session-idle-for-10-minutes.-on-the-session-expiry-notification,-click-on-�logout�",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SanityTC_3"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "SC3_browser is launched and userA is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "SC3_userA leaves the session idle for 10 minutes_1",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "SC3_on the session expiry notification userA click on yes",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "SC3_userA leaves the session idle for 10 minutes",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "SC3_on the session expiry notification userA click on logout",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "SC3_logout all the users and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_3.SC3_browser_is_launched_and_userA_is_on_homepage()"
});
formatter.result({
  "duration": 104205,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_3.SC3_userA_leaves_the_session_idle_for_10_minutes()"
});
formatter.result({
  "duration": 24205,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_3.SC3_on_the_session_expiry_notification_userA_click_on_yes()"
});
formatter.result({
  "duration": 16821,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_3.SC3_userA_leaves_the_session_idle_for_10minutes()"
});
formatter.result({
  "duration": 16821,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_3.SC3_on_the_session_expiry_notification_userA_click_on_logout()"
});
formatter.result({
  "duration": 22154,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_3.SC3_logout_all_the_users_and_close_the_browser()"
});
formatter.result({
  "duration": 21743,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Login as user in 1 tab and a device in another. Click on �View Console�. After sometime, click on �Close Console�",
  "description": "",
  "id": "login-action;login-as-user-in-1-tab-and-a-device-in-another.-click-on-�view-console�.-after-sometime,-click-on-�close-console�",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@SanityTC_4"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "SC4_browser is launched and userA is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "SC4_device is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "SC4_userA views device console",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "SC4_userA close console after some time",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "SC4_logout all the users and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_4.SC4_browser_is_launched_and_userA_is_on_homepage()"
});
formatter.result({
  "duration": 96000,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_4.SC4_device_is_on_homepage()"
});
formatter.result({
  "duration": 44718,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_4.SC4_userA_views_device_console()"
});
formatter.result({
  "duration": 18051,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_4.SC4_userA_close_console_after_some_time()"
});
formatter.result({
  "duration": 16821,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_4.SC4_logout_all_the_users_and_close_the_browser()"
});
formatter.result({
  "duration": 23795,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Login as user in 1 tab and a device in another. Click on �View Console�. Click on �Enter Room�. Accept the call from device�s side. Click on �Console� icon. Click on �Ok� on the �Would you like to Continue� pop-up. Click on the �Console� icon again on the device�s side",
  "description": "",
  "id": "login-action;login-as-user-in-1-tab-and-a-device-in-another.-click-on-�view-console�.-click-on-�enter-room�.-accept-the-call-from-device�s-side.-click-on-�console�-icon.-click-on-�ok�-on-the-�would-you-like-to-continue�-pop-up.-click-on-the-�console�-icon-again-on-the-device�s-side",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@SanityTC_5"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "SC5_browser is launched and userA is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "SC5_device is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "SC5_userA views device console and enter device room",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "SC5_userA accepts device call",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Sc5_perform Action on pop up",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "SC5_logout all the users and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_5.SC5_browser_is_launched_and_userA_is_on_homepage()"
});
formatter.result({
  "duration": 71385,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_5.SC5_device_is_on_homepage()"
});
formatter.result({
  "duration": 17642,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_5.SC5_userA_views_device_console_and_enter_device_room()"
});
formatter.result({
  "duration": 18052,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_5.SC5_userA_accepts_device_call()"
});
formatter.result({
  "duration": 15589,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_5.SC5_perform_action_on_popup()"
});
formatter.result({
  "duration": 20923,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_5.SC5_logout_all_the_users_and_close_the_browser()"
});
formatter.result({
  "duration": 16410,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "Login as user in 1 tab and a device in another. Call the user from the device. Accept the call from the user�s side. Click on �Console icon from the device�s side",
  "description": "",
  "id": "login-action;login-as-user-in-1-tab-and-a-device-in-another.-call-the-user-from-the-device.-accept-the-call-from-the-user�s-side.-click-on-�console-icon-from-the-device�s-side",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 58,
      "name": "@SanityTC_6"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "SC6_browser is launched and userA is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "SC6_Device is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "SC6_Call User from device",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "SC6_user accepts the call from device",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "SC6_from device click on console icon",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_6.SC6_browser_is_launched_and_userA_is_on_homepage()"
});
formatter.result({
  "duration": 51692,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_6.SC6_device_is_on_homepage()"
});
formatter.result({
  "duration": 28718,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_6.sc6_call_user_from_device()"
});
formatter.result({
  "duration": 23385,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_6.sc6_user_accepts_the_call_from_device()"
});
formatter.result({
  "duration": 22564,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_6.sc6_from_device_click_on_console_icon()"
});
formatter.result({
  "duration": 18461,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "Open the ROCC App. Click on �Forgot Password�. Enter mail ID. Login as a user with the new password",
  "description": "",
  "id": "login-action;open-the-rocc-app.-click-on-�forgot-password�.-enter-mail-id.-login-as-a-user-with-the-new-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 69,
      "name": "@SanityTC_7"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "SC7_browser is launched and ROCC app is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "SC7_click on forgot password and reset the password",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "SC7_Login as user with new password",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_7.sc7_browser_is_launched_and_rocc_app_is_launched()"
});
formatter.result({
  "duration": 82872,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_7.sc7_click_on_forgot_password_and_reset_the_password()"
});
formatter.result({
  "duration": 29949,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_7.sc7_login_as_user_with_new_password()"
});
formatter.result({
  "duration": 40615,
  "status": "passed"
});
formatter.scenario({
  "line": 80,
  "name": "Login as a user. Click on �User settings�. Change the settings. Make a call. Click on �Gear� icon to see the newly changed settings being auto-populated",
  "description": "",
  "id": "login-action;login-as-a-user.-click-on-�user-settings�.-change-the-settings.-make-a-call.-click-on-�gear�-icon-to-see-the-newly-changed-settings-being-auto-populated",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 79,
      "name": "@SanityTC_8"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "SC8_browser is launched and user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "SC8_click on settings and change the settings",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "SC8_Make a call and check for new settings are populated",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_8.sc8_browser_is_launched_and_user_is_on_homepage()"
});
formatter.result({
  "duration": 67692,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_8.sc8_click_on_settings_and_change_the_Settings()"
});
formatter.result({
  "duration": 20103,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_8.sc8_make_A_call_and_check_for_new_Settings_are_populated()"
});
formatter.result({
  "duration": 19282,
  "status": "passed"
});
formatter.scenario({
  "line": 90,
  "name": "Login as a user. Click on the �dropdown� for any existing contact. Click on the phone number",
  "description": "",
  "id": "login-action;login-as-a-user.-click-on-the-�dropdown�-for-any-existing-contact.-click-on-the-phone-number",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 89,
      "name": "@SanityTC_9"
    }
  ]
});
formatter.step({
  "line": 91,
  "name": "SC9_browser is launched and user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 92,
  "name": "SC9_check for existing contact and click the phone number",
  "keyword": "Then "
});
formatter.match({
  "location": "SanityTC_9.sc9_browser_is_launched_and_user_is_on_homepage()"
});
formatter.result({
  "duration": 79180,
  "status": "passed"
});
formatter.match({
  "location": "SanityTC_9.sc9_check_for_existing_contact_and_click_on_the_phone_number()"
});
formatter.result({
  "duration": 29949,
  "status": "passed"
});
});