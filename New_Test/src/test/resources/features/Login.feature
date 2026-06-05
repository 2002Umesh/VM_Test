Feature: Login Module



  Scenario Outline: Login validation
    Given user click on login
    When user enters <username> and <password>
    And user click login button
    Then validate login result

    Examples:
      | username | password    |
      | username     | password |
