Feature: Guest View
  Scenario: User is able to view the page without loggin in
    Given User is on the products page
    When User clicks on a product
    Then User should view the product