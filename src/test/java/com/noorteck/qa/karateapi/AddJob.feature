Feature: Create new job

  Scenario: Verify User able to create new job
    Given headers {Content-Type: 'application/json'}
    And url 'http://jobportalkarate.herokuapp.com/normal/webapi/add'
    When request '{ "jobId": 2222,"jobTitle": "B6","jobDescription": "automation","experience": ["6 years"],"project": [{"projectName": "AWS","technology": ["Selenium", "Java"] }]}'
    And method POST
    And print response

  Scenario Outline: Verify User able to create new job
    Given headers {Content-Type: 'application/json'}
    And url 'http://jobportalkarate.herokuapp.com/normal/webapi/add'
    When request '{ "jobId":'+ <id>+',"jobTitle":'+ <title>+',"jobDescription":'+ <description>+',"experience": ['+ <experience>+'],"project": [{"projectName":'+ <project_name> +',"technology": ["Selenium", "Java"] }]}'
    And method POST
    And print response

    Examples: 
      | id | title | description  | experience | project_name |
      | 33 | "B7"  | "manual"     | "7 years"  | "SQL"        |
      | 34 | "B8"  | "functional" | "9 years"  | "mySQL"      |
      | 35 | "B9"  | "BA"         | "00 years" | "BA DEV"     |
