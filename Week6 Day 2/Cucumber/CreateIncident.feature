Feature: Creating incident

Background:

Given Load URL 'http://dev103117.service-now.com'
When Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
And Verify Login is Successful

Scenario Outline: creating incident with multiple data

And Type Incident in the filter
And Click the Incidents tab
And Click new
And Get the Incident number
And enter Urgency <urgency>
And enter state <state>
And enter short description <shortdesc>
And Click submit
Then verify incident is created


Examples:

|urgency|state|shortdesc|
|2 - Medium|New|Incident created|
|3 - Low|New|Incident created|
