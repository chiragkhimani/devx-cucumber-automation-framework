Feature: This feature file to test functionality related to login

  Scenario: Verify User Can Login
    Given user open website
    When user do login
    Then verify user is on homepage