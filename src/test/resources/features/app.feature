Feature: the app can be retrieved
  Scenario: client makes call to GET /app
    When the client calls app
    Then the client receives response status code of 200
    And config data is correct