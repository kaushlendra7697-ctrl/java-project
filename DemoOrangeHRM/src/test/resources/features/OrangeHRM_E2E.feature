Feature: OrangeHRM End to End Employee Management

  Scenario: Login, Add Employee, Verify and Logout
    Given user is on OrangeHRM login page
    When user logs in with valid credentials
    And user navigates to PIM module
    And user adds a new employee
    Then employee should be added successfully
    And user logs out from application
