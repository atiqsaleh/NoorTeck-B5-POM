Feature: Ebay Register Functionality
 
  Scenario: Create new account
    Given User is on homepage
    When User clicks register link
    And User enters firstname
    And User enters lastname
    And User enters email
    And User enters password
    And User clicks Create Acount
    Then User verifies success message

 
