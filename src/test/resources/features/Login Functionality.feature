

  Feature: Login Functionality

    As a user, I should be able to login so that I can land on the dashboard page.

    Background: User is on login page
      Given user is on login page

    @wip
    Scenario: User can login with valid credentials (either clicking on the "Login button" or hitting the "Enter" key from the keyboard as the last step)
      When user enters username "Employee45"
      And user enters password "Employee123"
      And user clicks login button
      Then Verify user should see page title is dashboard trycloud qa "Dashboard - Trycloud QA"
      When User clicks log out button
      And user enters username "Employee45"
      And user enters password "Employee123"
      And User hits the enter key from keyboard
      Then Verify user should see page title is dashboard trycloud qa "Dashboard - Trycloud QA"
      And User clicks log out button




    Scenario: User can not login with any invalid credentials
              -"Wrong username or password." should be displayed for invalid credentials
              -"Please fill out this field" message should be displayed if the password or username is empty

    Scenario: User can see the password in a form of dots by default

    Scenario: User can see the password explicitly if needed

    Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset Password" button on the next page after clicking on forget password link

    Scenario: User can see valid placeholders on Username and Password fields

# env: https://qa.trycloud.net/index.php/login