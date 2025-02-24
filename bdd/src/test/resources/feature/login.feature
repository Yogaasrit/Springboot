Feature: Feature to test login functionality
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks the login button
    Then user should be navigated to home page

#  Scenario Outline: Check login is successful with valid credentials
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks the login button
#    Then user should be navigated to home page
#    Examples:
#    |username|password|
#    |alexa   |alexa@  |
#    |siri    |siri$   |
