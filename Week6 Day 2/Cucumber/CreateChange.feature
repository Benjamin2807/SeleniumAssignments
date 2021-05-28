Feature: Creating Change

Background:

Given Load URL 'http://dev103117.service-now.com'
When Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
And Verify Login is Successful

Scenario Outline: creating Change with multiple data

And Type Change in the Filter
And Click create new change
And click normal
And get change Number
And enter Change_state <state>
And enter priority <priority>
And enter risk <risk>
And enter impact <impact>
And click submit for change
Then  verify change

Examples:

|state|priority|risk|impact|
|New|2 - High|High|High|
