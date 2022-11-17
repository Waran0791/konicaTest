Feature: Log ont into Gmail in the Google Browser 

Scenario Outline: Enter the Login Credentials inside the Gmail Website

Given user navigate to the Gmail login page
When user enter valid login credentials the "<Username>" and "<Password>"
Then User should Verify the profile in top right corner

Examples:
|Username|Password|
|maheshwaran0791@gmail.com|Mahesh@1991|
|maheshwaran0791@gmail.com|Mahesh@1991|
