Feature: Login Functionality
#Background: Given User is on the login page
 
#@regression
Scenario: Verify the login functionality for valid credentials
     # Given User is on the login page
    #   When user enters the username
     #   And user enters teh password
     #  And user clicks on the login button
       # Then user is naqvigated to home page 
       
       
 # @regression
 # Scenario: Verify the login functionality for invalid credentials
     #Given User is on the login page
  #  When user enters an invalid username
  #  And user enters an invalid password
  #  And user clicks on the login button
  #   Then user should see an error message
  
 # @Sanity
 # Scenario Outline: Verify the login functionality for valid credentials using parameters
    # Given User is on the login page
   #  When user enters the "<username>" and "<password>"
 #    And user clicks on the login button
 #    Then user is naqvigated to home page
     
 #Examples:
 # | username | password | 
  #| Admin    | admin123 | 
#  | Admin  | admin123 | 
 # | Admin   | admin123 | 
 
 Scenario: Login with Multiple users
 Given User is on the login page
	 When user enters credentials
      | username | password  |
      | Admin    | admin123  |  
   And user clicks on the login button	
	Then user is naqvigated to home page


