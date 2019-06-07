@LandingPage
Feature: Landing to Login page in phptravels feature

@CheckForUserLogin @Functional @Sanity
Scenario: Verify a user is able to open login page 
	Given user is navigated to Landing Page
	When user clicks on My account drop down button
	And the user clicks on login button of landing page
	Then user is landed on the Login page