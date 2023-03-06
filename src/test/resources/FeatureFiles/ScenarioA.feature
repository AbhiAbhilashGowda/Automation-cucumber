Feature: Login into the portal
		
		@Login
	  Scenario: Verify whether the User Login is sucessful
    Given I launch the application
    And I click on My Account 
    And I click on Login 
    And I enter the Email Address "preeti.sajjan@diatoz.com"
    And I enter the Password "sajjan"
    And I click on Login button
    Then Login should be successful
    Then I view the products from the Wishlist
    And I view the products from the Shopping Cart
    
    

     