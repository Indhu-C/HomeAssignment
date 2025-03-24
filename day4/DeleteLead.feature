Feature: Lead Deletion using CRM app

@DeleteLead@functional
Scenario Outline: Successfully deleted Lead using Valid data

When the user enters the username as "democsr"
And the user enters the password as "crmsfa"
And the user clicks the login button
Then the user should be redirected to Welcome page
When the user clicks the CRMSFA link
And the user clicks the Leads tab
And the user clicks the Find Leads
#And the user enters the Phone Number as <phno>
And the user clicks the Find Leads button
And the user clicks the Lead Id 
And the user clicks the Delete button
And the user clicks the Find Leads
And the user enters the Lead Id as <Id>
And the user clicks the Find Leads button
And  No records to display will be displayed

Examples:
|phno|Id|
|98|1|
#|99|2|