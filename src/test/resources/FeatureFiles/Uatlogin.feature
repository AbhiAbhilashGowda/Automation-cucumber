Feature: Validate the login functionality for e2eHiring application
		
		@login @one
	  Scenario: Verification of login functionality with valid credentials
Given I launch the application
When I enter emailid "sunny@mail7.io"
When I enter password "Diatoz@123"  
Then I click on login button

    @login @two
	  Scenario: Verification of login functionality with invalid crdentials
Given I launch the application
When I enter invalid emailid "agowda123@gmail.com" 
When I enter invalid password "manag"  
Then I click on login button
And I should get the error message


    