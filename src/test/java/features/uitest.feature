Feature: ui tests

  @automated
  Scenario: To validate ui pages
    Given open reqRes
    When method get
    Then status 200