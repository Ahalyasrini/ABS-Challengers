Feature: GetStarted page without logging on

Background: The login  steps
    Given The user should open the browser and enters the DS_Algo Portal  
    Then The user should be landed on the DS_Algo Get Started page with message "You are at the right place"
    When User clicks on get started button
    Then User should be landed on the data structure page with title "NumpyNinja"

@homePage14
Scenario Outline: Data Structures dropdown validation
Given User is on the Get Started Page
Then User clicks on Data Structures dropddown and validates all the <options> in  pane
|Arrays|
|Linked List|
|Stack|
|Queue|
|Tree|
|Graph|

@homePage14
Scenario: Get Started button validation of DataStructures
Given user is on the Get Started Page
When User clicks on Get Started button of any Data Structures section and verify the error message "You are not logged in"


#Scenario: Register and login links UI verification
 
#Then User should see register and login links 


