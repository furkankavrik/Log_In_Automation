@completed
Feature: As a user, I should be able to log out.

  Background: User is on login page
    Given user is on login page

  @completed
  Scenario: User can log out and ends up in login page
    And user enters username "Employee45"
    And user enters password "Employee123"
    And user clicks login button
    When User clicks log out button
    Then Verify user should return login page.

  @completed
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    And user enters username "Employee45"
    And user enters password "Employee123"
    And user clicks login button
    And User clicks log out button
    When User clicks step back button
    Then Verify user should not go to home page by clicking step back button.
    #Dashboard - Trycloud QA
    #Trycloud QA

