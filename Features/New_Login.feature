Feature: E - Gifts Automation feature for Login

Scenario Outline: Registration Functionality for E - Gifts
Given user navigates to Registration URL "<url>"
When user enter valid data as firstname as "<FirstName>", Lastname as "<LastName>", Mobilenumber as "<Mobile>",Email as "<Email>", Password "<password>" and ConfirmPassword "<ConfirmP>"
Then Registration should be successful
    
Examples:
   | url                           | FirstName                | LastName     |Mobile|Email|password|ConfirmP|
    |http://egifts.atlantickw.com/new-account| Test3   | Test3 |9870656767|Test3.vtest@gmail.com|manisha123|manisha123|


Scenario Outline: Login Functionality for E - Gifts
Given user navigates to "<url>"
When user enter in using Username as "<username>" and Password "<password>"
Then login should be successful
    
Examples:
   | url                           | username                | password     |
    |http://egifts.atlantickw.com/login | Test3.vtest@gmail.com     | manisha123   |
    
    
 Scenario Outline: Go to Contact us page
Given user navigates to main "<url>"
When Click on logout
Then contact_us should be successful
   
   Examples:
  | url                           |
   |http://egifts.atlantickw.com/| 
    