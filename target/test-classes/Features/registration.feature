Feature: Student Registration Form
Background:
Given the user opens the Registration Form
@Sanity
Scenario: Submit form with valid data
    When the user enters name "Batman"
    And user enters email "batman@dark.com"
    And user selects Gender "Male"
    And user enters Mobile Number "9876543210"
    And user selects Date of Birth "22-08-2025"
    And user enters Subjects "Maths, Physics"
    And user selects Hobbies "Sports, Music"
    And user uploads Picture "C:\Users\Siva Sai\Downloads\1080x1920-420521-TV-Show-Batman-The-Animated-Series-Phone-Wallpaper.jpg"
    And user enters Current Address "123 Main Street"
    And user selects State "NCR" and City "Lucknow"
    And user clicks on Submit button
    Then registration form should be submitted successfully
    
    # @Negative
  #Scenario: Submit form with missing required fields
   # When the user leaves Name empty
    #And user enters Email "invalid-email"
   # And user clicks on Submit button
   # Then an error message should be displayed for mandatory fields
