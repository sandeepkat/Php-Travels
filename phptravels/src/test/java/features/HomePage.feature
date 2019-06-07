@HomePage
Feature: Search for hotels in  phptravels feature


@Login @Functional
Scenario: Verify existing user of phptravels is able to search for hotels 
	Given user is navigated to home Page
	When user clicks on hotels link on home page
	And the user clicks on search by hotel or city name text field
	And the user enters city name and selects the city name from dropdown
	And the user enters check in and check out dates
	And the user enters personal count and clicks on search button
	Then user is landed on the search list page