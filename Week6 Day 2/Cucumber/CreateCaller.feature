Feature: Creating Callers

Background:

Given Load URL 'http://dev103117.service-now.com'
When Type username as 'admin'
And Type password as 'India@123'
And Click Login Button
And Verify Login is Successful

Scenario Outline: creating Callers with multiple data

And Type Callers to Create_caller
And Click Callers to create_caller
And Click new to create_caller
And Type First_name to Create_caller <fname>
And Type Last_name to Create_caller <lname>
And Type Title to create_caller
And Type Number in Business_phone to Create_caller <b_PhoneNumber>
And Get First_name of Caller
And Click subit to Create_caller
Then Verify_caller

Examples:

|fname|lname|b_PhoneNumber|
|soona|paana|213 198 1239|
