Feature: Post a message on Buzz
  Background: Use Buzz option into OrangeHRM
    Given I am in OrangeHRM web page

    @PostMessageOnbUZZ
    Scenario: Post a message on buzz page
      Given I set the user name field with "admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The home page should be displayed
      And I click on the buzzon button
      And I Write the message "This is a test post" in the Post Space
      And I click on Post Button
      Then The Verification Window will be displayed