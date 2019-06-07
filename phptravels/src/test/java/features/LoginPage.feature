@LoginPage
Feature: Verify login in phptravels feature

@CheckForUserLogin @Functional @Smoke 
Scenario: Verify existing user of phptravels is able to login successfully using valid credentials
	Given user is navigated to Login Page
	When user enters username and password on login page
	And the user clicks on login button
	Then user is landed on the home page

@CheckForUserLogin @Functional @Smoke
Scenario: Verify a user login using valid username and invalid password
	Given user is landed on Login Page
	When user enters valid username and invalid password on login page
	And the user clicks sign in or login button
	Then user gets a invalid credential message

@CheckForUserLogin @Functional @Smoke
Scenario: Verify a user login using valid username and no password
	Given user is on Login Page
	When user enters valid username on login page and clicks on login button
	Then user gets a invalid username or password message