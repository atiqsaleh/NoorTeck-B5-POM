Feature: Paygrades Page Functionality

  Scenario Outline: verify  Add functioality in pay Grade
    Given User is on OrangeHRM login Page
    When User enters username "<UserName>" "<Password>"
    And User clicklogin button
    And User clickadmin button
    And User clickjob button
    And User clickPayGrades button
    And User entersgrades "<Grades>"
    And User clickselectall
    And User selectcurrency "Doller"
    Then User waits 

    Examples: 
      | UserName | Password | Grades   | Doller               |
      | admin    | admin123 | Grade G4 | United States Dollar |
