Feature: My firs feature

  Scenario Outline: Verify that GET request returned with status code 200
    Given I have server by URL "<url>"
    When  I send GET request on endpoint "<endpoint>" and parameters "<param>"
    Then  I get response status code "<code>"
    Examples:
      | url                   | endpoint      | param            | code |
      | http://www.google.com | /search       | q=Main%20Academy | 200  |
      | https://reqres.in/    | /api/users/23 |                  | 404  |

  Scenario: Verify that GET request body not NULL
    Given I have server by URL "https://reqres.in/"
    When  I send GET request on endpoint "/api/users" and parameters "page=2"
    Then  I get response status code "200"
    Then  I get body not null


  Scenario: Verify that POST request body not NULL
    Given I have server by URL "https://reqres.in/"
    When  I send GET request on endpoint "/api/users" and parameters "page=2"
    Then  I get response status code "200"
    Then  I get body not null

  Scenario: Verify that PATCH request modifies user
    Given I have server by URL "https://reqres.in/"
    When  I send PATCH request on endpoint "/api/users/2" and body "{  \"name\": \"morpheus\", \"job\": \"zion resident\"}"
    And   Send "name" name and "job" job
    Then  I get response status code "200"
    Then  I get body not null





