Feature: Zipcode

  Scenario Outline: verifythe zipcode look up functionality
    Given params {auth-id: '2f828c29-285b-6168-c4c3-e8ad9e35c0f2', auth-token: 'ED96x3xSRNYQKHpBxxUa', city:<city>, state: <state>, zipcode: <zipcode> }
    And url 'https://us-zipcode.api.smartystreets.com/lookup'
    When method Get
    Then status 200
    And print response
    And match response.[0].zipcodes[0].state_abbreviation == <state_abbreviation>
    And match response.[0].zipcodes[0].state == <state>
    And match response.[0].zipcodes[0].county_name == <county_name>

    Examples: 
      | city      | state_abbreviation | state      | county_name | zipcode |
      | 'reston'  | 'VA'               | 'Virginia' | 'Fairfax'   |   20191 |
      | 'Herndon' | 'VA'               | 'Virginia' | 'Fairfax'   |   20190 |
      | 'Aldie'   | 'VA'               | 'Virginia' | 'Loudoun'   |   20105 |
      | 'Chicago' | 'IL'               | 'Illinois' | 'Cook'      |   60601 |
