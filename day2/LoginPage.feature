Feature: User Authentication for LeafTaps Application

Scenario: Successful Login using Valid credentials

Given the user is on the login page
When the user enters the username as democsr
And the user enters the password as crmsfa
And the user clicks the login button
Then the user should be redirected to Welcome page
And Welcome user name will be displayed
And close the browser

Scenario: Failed Login using Invalid credentials

Given the user is on the login page
When the user enters the username as democsr1
And the user enters the password as crmsfa
And the user clicks the login button
But the user will be shown an error message
And close the browser




