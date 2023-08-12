Feature: This is a Login feature Sprint1


@Jahan4
Scenario: Verify user can signup
Given Open "<URL>" Application
Then Click SignUp Link
Then Enter username Password
Then Click SignUP button

@Jahan2
Scenario: Verify user can login with valid card
Given Open "<URL>" Application
Then Click Login Link
Then Enter user Password
Then Verify user can login with valid card





 








