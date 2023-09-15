Feature: Add a new Candidate
  Background: Use Add Recruitment option into OrangeHRM
    Given I am in OrangeHRM web page

  @AddCandidates
  Scenario: Add a new candidate
    Given I set the user name field with "admin"
    And I set the password field with "admin123"
    When I click on the login button
    Then The home page should be displayed
    And I click on the recruitment button
    And I click on the add Button
    And I set the first name field with "Javier"
    And I set the Middle name field with "Fernando"
    And I set the Last name field with "Ximenes"
    And I set the Email field with "JavierX@example.com"
    And I set the Contact field with "76545899"
    And I set the Keywords field with "always free, good person"
    And I set the Notes field with "He lives close to the office"
    And I set the Vacancy field with "a"
    Then I click on the Save button
