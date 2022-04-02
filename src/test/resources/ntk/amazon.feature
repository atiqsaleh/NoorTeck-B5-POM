Feature: Amazon Register Functionality

  Scenario: Create new Account
    Given User is on homepage
    When User clicks on Sign in link
    And User clicks Create Amazon account button
    And User enters name
    And User enters email
    And User enters password
    And User re-enters password
    And User clicks Create Acount
    Then User verifies success message
