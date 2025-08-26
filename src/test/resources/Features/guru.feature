Feature: Basic Information
Background:
Given the user opens the information page
@Sanity
Scenario: submit form with valid data
    When the user enters First Name "IronMan" and Last Name "Mutiverse"
    And user enters Phone "9876543210"
    And user enters Email "spiderman@gmail.com"
    And user enters Address "123 Main St"
    And user enters City "New York"
    And user enters State "NY"
    And user enters Postal Code "10001"
    And user selects Country "UNITED STATES"
    And user enters Username "batman"
    And user enters Password "batman@123"
    And user confirms Password "batman@123"
    And user clicks on Register button
    Then registration should be successful
