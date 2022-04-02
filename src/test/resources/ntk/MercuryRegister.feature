Feature: ScenarioOutline demo

  Scenario Outline: verify register functionality
    Given User is on Register Page
    When User enters firstname "<FirstName>"
    And User enters lastname "<LastName>"
    And User enters city "<CityName>"
    And User selects "<Country>"
    And User enters username "<UserName>"
    And User click  submitbutton "<Submit>"
    Then User waits

    Examples: 
      | FirstName | LastName | CityName | Country | UserName |
      | Najeeb    | N        | NY       | US      | najeebn  |
      | Ahmad     | A        | VA       | US      | ahmadS   |
      | Samer     | S        | VA       | US      | samerS   |
      | Siliman   | S        | VA       | US      | silimanS |
      | Maryam    | M        | VA       | US      | maryamM  |
