Feature: To test the reqres

  @smokes
  Scenario: Validate the reqres response
    Given url "https://reqres.in/api/users?page=2"
    When method get
    Then status 200
    * def id = response.data[0].id
    And match id == 7