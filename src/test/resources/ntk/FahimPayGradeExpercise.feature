Feature: PayGrades Page Functionality

  Background: 
    Given User is on OrangeHRM login page
    And User enters credentials "Admin" "H0q@c9MhVL"
    And User clicks login button
    When User navigates to PayGrades Page

  Scenario Outline: Verify Add functionality in Pay Grade
    And User clicks add icon
    And User enters pay grade "<name>"
    And User clicks save
    Then User verifies "<message>"

    Examples: 
      | name | message            |
      | SDET | Saved Successfully |
      | DEV  | Saved Successfully |

  Scenario Outline: Verify Edit functionality in Pay Grade
    And User clicks edit icon
    And User clicks assign currency button
    And User selects currency "<currency>"
    And User enters min salary "<minSalary>"
    And User enters max salary "<maxSalary>"
    And User clicks save
    Then User verifies "<message>"

    Examples: 
      | currency | minSalary | maxSalary | message              |
      | USA      |      1111 |      4444 | Successfully Updated |
      | USA      |      2222 |      5555 | Successfully Updated |

  Scenario Outline: Verify Delete functionality in Pay Grade
    And User selects data from pay grades table
    And User clicks table menu option
    And User User clicks delete selected
    And User clicks Yes Delete button
    Then User verifies "<message>"

    Examples: 
      | message              |
      | Successfully Deleted |
      | Successfully Deleted |
