 Feature: Create new job reading from file

  #Scenario: Verify User able to create new job
  #* def requestBody = read('classpath:com/noorteck/qa/karateapi/AddBody.json')
  #Given headers {Content-Type: 'application/json'}
  #And url 'http://jobportalkarate.herokuapp.com/normal/webapi/add'
  #When request requestBody
  #And method POST
  #And print response
  Scenario Outline: Verify User able to create new job
    * def requestBody = read('classpath:com/noorteck/qa/karateapi/AddBody2.json')
    * print requestBody
    * set requestBody.jobId = <id>
    * set requestBody.jobTitle = <title>
    * set requestBody.jobDescription = <description>
    * set requestBody.experience[0] = <experience>
    * set requestBody.project[0].projectName = <project_name>
    * print requestBody
    Given headers {Content-Type: 'application/json'}
    And url 'http://jobportalkarate.herokuapp.com/normal/webapi/add'
    When request requestBody
    And method POST

    Examples: 
      | id   | title  | description | experience   | project_name |
      | 3456 | "Bab7" | "mannnual"  | "7777 years" | "sssSQL"     |
  #Scenario Outline: Verify User able to create new job
    #* def requestBody = read('classpath:com/noorteck/qa/karateapi/AddBodyV3.json')
    #* print requestBody
    #* set requestBody.name = <name>
    #* set requestBody.salary = <salary>
    #* set requestBody.age = <age>
    #* set requestBody.contacts[0] = <contacts>
    #* set requestBody.id[0] = <id>
    #* set requestBody.address = <address>
    #* set requestBody.street = <street>
    #* set requestBody.city = <city>
    #* set requestBody.state = <state>
    #* set requestBody.postalCode = <postalCode>
    #* print requestBody
    #Given headers {Content-Type: 'application/json'}
    #And url 'http://dummy.restapiexample.com/api/v1/create'
    #When request requestBody
    #And method POST
#
    #Examples: 
      #| name   | salary | age | contacts | id      | address         | city | state | postalCode |
      #| "aaaa" |    123 |  30 |      111 | 2222222 | "Fredericksbur" | "VA" |  2906 |      22408 |
      #| "bbb"  |    345 |  31 |      222 |  333333 | "Staford"       | "VA" |  2906 |      22408 |
      #| "ccc"  |    567 |  32 |      333 |  444444 | "Ladysmith"     | "VA" |  2906 |      22408 |
