Feature: Lead created using CRM app

#Background:
#Given the user is on the login page "http://leaftaps.com/opentaps/"
@CreateLead@functional
Scenario Outline: Successful creation of Lead using Valid data

When the user enters the username as "democsr"
And the user enters the password as "crmsfa"
And the user clicks the login button
Then the user should be redirected to Welcome page
When the user clicks the CRMSFA link
And the user clicks the Leads tab
And the user clicks the Create Lead
And the user enters the company name as <cname>
And the user enters the first name as <fname>
And the user enters the last name as <lname>
And the user enters the phone number as <phno>
And the user clicks the Create Lead button
#And close the browser

Examples:
|cname|fname|lname|phno|
#|"TestLeaf"|'B'|'M'|'98'|
#|"TCS"|'H'|'R'|'99'|
|TestLeaf|B|M|98|
#|TCS|H|R|99|
