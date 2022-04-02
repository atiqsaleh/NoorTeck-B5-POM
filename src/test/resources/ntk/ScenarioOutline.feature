Feature: ScenarioOutline demo

  Scenario Outline: verify register functionality
    Given User is on Register Page
    When User enters firstname "<FirstName>"
    And User enters lastname "<LastName>"
    And User enters email "<Email>"
    And User selects "<Gender>"
    Then User waits

    Examples: 
      | FirstName | LastName | Email             | Gender |
      | Saranya   | C        | saranya@gmail.com | f      |
      | Cheryl    | T        | Cheryl@gmail.com  | f      |
      | Yahya     | K        | Yahya@gmail.com   | m      |



