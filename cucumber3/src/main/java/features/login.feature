Feature: Free CRM Login Feature


#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Cogmento CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button


Scenario Outline: Cogmento CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<email>" and "<password>"
Then user clicks on login button
Then Close the browser

Examples:
| email | password |
| naveenk | test@123 |
| tom | test@456 |