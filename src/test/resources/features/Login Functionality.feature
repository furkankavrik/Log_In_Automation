@completed
Feature: Login Functionality

  As a user, I should be able to login so that I can land on the dashboard page.

  Background: User is on login page
    Given user is on login page

  @completed
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


  @completed
  Scenario Template: User can not login with any invalid credentials
  -"Wrong username or password." should be displayed for invalid credentials

    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks login button
    Then Verify user should see that wrong username or password message "Kullanıcı adı ya da parola hatalı."
    
    #Kullanıcı adı ya da parola hatalı.
    #Wrong username or password.

    Examples: -"Wrong username or password." should be displayed for invalid credentials
      | username      | password      |
      | Employee45    | wrongpassword |
      | wrongusername | Employee123   |
      | wrongall      | wrongall2     |

  @completed
  Scenario: User can not login with any invalid credentials2
  -"Please fill out this field" message should be displayed if the password or username is empty
    Given User should see username text box is clear
    When user enters username "Employee666"
    And user clicks login button
    When Verify user should see that please fill out this field message "Lütfen bu alanı doldurun."
    #Lütfen bu alanı doldurun.
    #Please fill out this field

  @completed
  Scenario: User can see the password in a form of dots by default
    When user enters password "Employee123"
    And Verify user should see dots in password box
    #this scenario is not done in proper way.

  @comleted
  Scenario: User can see the password explicitly if needed
    When user enters password "Employee123"
    And user clicks eye button.
    Then Verify user's  password "Employee123" should be visible

  @completed
  Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset Password" button on the next page after clicking on forget password link
    Then Verify user should see the forgot password link
    And User clicks forgot password link
    Then Verify user should see reset password link

  @completed
  Scenario: User can see valid placeholders on Username and Password fields
    Then User should see "Kullanıcı adı ya da e-posta" placeholder on Username field.
    Then User should see "Parola" placeholder on Password fields.
  #Kullanıcı adı ya da e-posta
  #Parola

# env: https://qa.trycloud.net/index.php/login