Feature: SauceDemo Login Functionality

@Sanity
Scenario Outline: Login with Multiple Users
Given user is on login page
When  user enters "<username>" and "<password>"
And user clicks on the login button
Then user is navigated to home page

 Examples:
      | username        | password     | 
      | standard_user   | secret_sauce | 
      | locked_out_user | secret_sauce | 
      | problem_user    | secret_sauce | 
      | performance_glitch_user | secret_sauce |
      | error_user      | secret_sauce  |
      |visual_user      | secret_sauce  |