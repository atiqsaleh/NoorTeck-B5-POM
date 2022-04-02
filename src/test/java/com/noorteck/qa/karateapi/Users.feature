 Feature: verify user information

  Scenario Outline: verify user data
    Given url 'https://reqres.in/api/users/'+ <id>
    When method Get
    Then status 200
    And print response
    And match response.data.first_name == <first_name>
    And match response.data.last_name ==<last_name>

    Examples: 
      | id | first_name | last_name |
      |  2 | 'Janet'    | 'Weaver'  |
      |  5 | 'Charles'  | 'Morris'  |
      |  3 | 'Emma'     | 'Wong'    |
      |  7 | 'Michael'  | 'Lawson'  |

 
 
