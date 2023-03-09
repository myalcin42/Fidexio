@FIDEX10-338
Feature: US-001 Login Functionality

  Background: Login page
    Given User is on the login page

  Scenario Outline: User can login with valid credentials
    When User enters valid email "<email>"
    And User enters valid password "<password>"
    And User clicks log in button
    Then User should be on the homepage

    Examples: Email and password
      | email                   | password     |
      | salesmanager6@info.com  | salesmanager |
      | salesmanager45@info.com | salesmanager |
      | posmanager53@info.com   | posmanager   |
      | posmanager100@info.com  | posmanager   |

