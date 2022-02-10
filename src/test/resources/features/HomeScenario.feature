Feature: This feature file to test end to end flow of the website
  @Smoke
  Scenario: Verify User Can Place Order
    Given user open website
    When user do login
    Then verify user is on homepage
    When user click on add to cart button for item "Sauce Labs Fleece Jacket"
