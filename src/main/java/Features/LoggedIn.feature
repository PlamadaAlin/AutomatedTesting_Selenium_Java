Feature: LoggedIn User
  Scenario: User can view the page after login
    Given User is on the log in page
    When User enters the log in details
    Then User should view the products page