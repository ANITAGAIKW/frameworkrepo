Feature: OrangeHRM Login

Scenario: OrangeHRM default login

Given User is on the Login Page

When User clicks on Login by entering username and password

Then Login should be successful

And Username is displayed