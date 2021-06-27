
Feature: Perform login operation

  @regression
  Scenario: Login with valid credentials
    Given I lauched Chrome Browser
    And I Enter the valid Url
    And Enter user Name and password
    When I sumbit login button
    Then I verify login success
    And I click on Compose function
    And I Enter on  body and subject
    When i click on send button
    Then I verify the sent mail is sucess
    And I close the browser
    And I verify the logout success
