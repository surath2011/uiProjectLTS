Feature: demo qa

  @automated @smoke
  Scenario: To validate demo qa ui pages
    Given open demo qa
    When click window button
    Then child window opens

  @automated
  Scenario: To validate ui pages
    Given open reqRes
    When method get
    Then status 200