Feature: 

  Background: 
    * def URL = 'http://jobportalkarate.herokuapp.com/secure/webapi/find'

  Scenario Outline: Verify user able to retrieve with basic auth
    Given headers {Content-Type: 'application/json', Authorization: <auth>}
    And params {id:<id>, jobTitle: <title> }
    And url URL
    When method GET
    Then status <status_code>
    And print response
    And match response.jobId == <id>
    And match response.jobTitle == <title>
    And match response.project[0].projectName == <project_name>

    Examples: 
      | auth                         | id | title           | status_code | project_name |
      | 'Basic YWRtaW46d2VsY29tZQ==' |  1 | 'Software Engg' |         200 | 'Movie App'  |

  Scenario Outline: Verify user not able to retrieve without basic auth
    Given headers {Content-Type: 'application/json'}
    And params {id:<id>, jobTitle: <title> }
    And url URL
    When method GET
    Then status <status_code>

    Examples: 
      | id | title           | status_code |
      |  1 | 'Software Engg' |         401 |


  Scenario Outline: Verify server response for non existings data
    Given headers {Content-Type: 'application/json', Authorization: <auth>}
    And params {id:<id>, jobTitle: <title> }
    And url URL
    When method GET
    Then status <status_code>
    And print response
    * def exp_message = 'Failed to find job with id='+<id>+', jobTitle='+<title>
    And match response.message == exp_message

    Examples: 
      | auth                         | id  | title       | status_code |
      | 'Basic YWRtaW46d2VsY29tZQ==' | 123 | 'John Cena' |         404 |


  Scenario Outline: Verify server response without query parameter
    Given headers {Content-Type: 'application/json', Authorization: <auth>}
    And url URL
    When method GET
    Then status <status_code>
    And print response
    And match response.status == <status_code>
    And match response.error == <error>
    And match response.message == <message>

    Examples: 
      | auth                         | status_code | error         | message                                        |
      | 'Basic YWRtaW46d2VsY29tZQ==' |         400 | 'Bad Request' | 'Required int parameter ''id'' is not present' |

      
      
      
      
      
      
      
