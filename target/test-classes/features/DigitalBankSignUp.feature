Feature: Verify Sign up functionality of digitial bank

  @db
  Scenario: Verify User Can Sign Up
    Given user open digital bank website
    When user click on sign up button
    Then verify sign up page is displayed
    When user fill all details on sign up page
    And click on next button
    Then verify register page is displayed
    When user fill all details on register page
    And click on register button
    Then verify registration success message
    And verify all details updated in database