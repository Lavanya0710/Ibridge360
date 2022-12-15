Feature: Ibridge360 Login Page functionality

  Scenario Outline: Check Login is successful with valid credentials.
    Given Launch the browser
    And user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password        |
      | Pranav S | hijackmY@cC0unt |
      | pranav   | jsdkskjd@       |
