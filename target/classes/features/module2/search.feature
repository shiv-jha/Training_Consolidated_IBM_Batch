Feature: Search
	
	@smoke @regression
	Scenario: Testing multi scenario case1
		Given test multiple scenario case1
		
	@smoke
	Scenario: Testing multi scenario case2
		Given test multiple scenario case2
		
	@regression
	Scenario Outline: Validate Search functionality
		Given user is in Search page
		When user enters "<product>" product
		And Click on Search button
		Then Product "<product>" should be displayed
		Examples:
      | product |
      | iPhone  |
      | MacBook Air  |
      | MacBook Pro  |