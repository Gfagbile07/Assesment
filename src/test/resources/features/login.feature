Feature: Login feature

 Scenario: Verify the home of the application
  Given User navigates to the login page
  When the user enters valid credentials
  When the user clicks the sign in button
  Then the user should be redirected to the dashboard
  When the user logs out
  Then he user should be redirected to the login page

