Feature: Login Feature

  Scenario: Login with valid credentials
    Given User is on login page
    When User enters email and password
    And User clicks login button
    Then User should be logged in successfully
    Then User should be log out Successfully
