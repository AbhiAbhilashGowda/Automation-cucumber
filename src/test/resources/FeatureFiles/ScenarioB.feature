Feature: Login into the portal
		
		@Login
	  Scenario: Access a Product via Search
    Given I launch the application
    Then I enter "MacBook" in the search bar
    And I change the search category to Computer or Tablets and Networking
    And I verfy the first result name matches with search string
    
    