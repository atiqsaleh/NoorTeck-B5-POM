Feature: Datatable demo

  Scenario: verify register functionality
    Given User is on Register Page
    When User enters data
      | FirstName | LastName | Email             |
      | Saranya   | C        | saranya@gmail.com |
      | Cheryl    | T        | Cheryl@gmail.com  |
      | Yahya     | K        | Yahya@gmail.com   |
    Then User waits
