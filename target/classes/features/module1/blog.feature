Feature: blog
		
	@smoke
	Scenario: Validate blog entering functionality
		Given user is in Blog page
		When user enters data in search field
		Then data should appear in search field
		