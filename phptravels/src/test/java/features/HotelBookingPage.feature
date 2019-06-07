@HotelBookingPage
Feature: Book a hotel in  phptravels feature

@CheckForUserLogin @Functional @EndToEnd
Scenario: Verify a active user of phptravels is able to book a hotel 
	Given user is landed on home Page
	When the user clicks hotels link on the home page
	And the user enters search details and clicks on search button
	And the user provides hotel selection and clicks on Book now button
	And user enters personal details and clicks on confirm booking button
	Then user is on invoice page and navigates to home page
	
	