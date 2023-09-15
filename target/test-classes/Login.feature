Feature: Login OrangeHRM App

  Background: User login into OrangeHRM
    Given I am in OrangeHRM web page

    @LoginWithCorrectCredentials
    Scenario: Login into OrangeHRM page with valid credentials
      Given I set the user name field with "admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The home page should be displayed

    @loginWithIncorrectCredentials
    Scenario: Login into Sauce Demo page with invalid credentials
      Given I set the user name field with "Invalid_user"
      And I set the password field with "Invalid_password"
      When I click on the login button
      Then An error message that says "Invalid credentials" should be displayed
