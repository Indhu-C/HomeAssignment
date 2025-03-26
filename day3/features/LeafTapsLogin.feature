Feature: User Authentication for Leaftaps Application

Scenario: Successful Login using Valid Credentials

When the user enters the username as 'demosalesmanager'
And the user enters the password as 'crmsfa'
And the user clicks the login button
And the user clicks the crsmfa link
And the user clicks the lead menu
And the user clicks the create lead menu

Scenario: Successful Login using InValid Credentials

When the user enters the username as 'SALES'
And the user enters the password as 'DEMO'
And the user clicks the login button

