Feature: Login into the portal
		
		@Login
	  Scenario: Access a Product via category after applying multiple filters
    Given I launch the application
    Then I navigate to Cell Phones and Accessories
    Then I navigate to Cell Phones and Smartphone
    And I click on See All
    Then I apply the filters as ScreenSize
    And I Verfy the filter tags applied
    
    