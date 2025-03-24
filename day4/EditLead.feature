Feature: Lead editted using CRM app

@EditLead@functional
Scenario Outline: Successfully editted Lead using Valid data

When the user enters the username as "democsr"
And the user enters the password as "crmsfa"
And the user clicks the login button
Then the user should be redirected to Welcome page
When the user clicks the CRMSFA link
And the user clicks the Leads tab
And the user clicks the Find Leads
And the user enters the Phone Number as <phno>
And the user clicks the Find Leads button
And the user clicks the Lead Id 
And the user clicks the Edit button
And the user enters the Company Name as <cname>
And the user clicks the Submit Button 

Examples:
|phno|cname|
|98|TestLeaf|
#|99|TCS|

