@queue
Feature: User launch DSAlgo application and Test Queue page
Background:
    Given The user is on Home page after logged in using 1 and validCredentials
    And User clicks on "Get Started" link
    And The user should be redirected to "https://dsportalapp.herokuapp.com/queue/" page
	
@queue
Scenario Outline: Implementation of Queue page
    Given User is on the "Queue" page
    When User clicks on "Implementation of Queue in Python" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/implementation-lists/" page
    Then User clicks on "Try here>>>" button 
  And User is on the "tryEditor" page
  And User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  And The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  And User click ok button in the alert window
  And user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
    Given User is on the "Queue" page
    When User clicks on "Implementation of Queue in Python" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/implementation-lists/" page
    Then User clicks on "Try here>>>" button 
  And User is on the "tryEditor" page
  And User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  And User is able to see the output in console
  And User navigates back
  And User clicks on "Practice Questions" link
  And User should be navigate to "https://dsportalapp.herokuapp.com/queue/practice" page 
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
  @queue
Scenario Outline: Implementation using collections.deque page
    Given User is on the "Queue" page
    When User clicks on "Implementation using collections.deque" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/implementation-collections/" page
    Then User clicks on "Try here>>>" button 
 And User is on the "tryEditor" page
  And User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  And The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  And User click ok button in the alert window
  And user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
    Given User is on the "Queue" page
    When User clicks on "Implementation using collections.deque" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/implementation-collections/" page
    Then User clicks on "Try here>>>" button
 And User is on the "tryEditor" page
  And User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  And User is able to see the output in console
  And User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
   @queue
Scenario Outline: Implementation using array page
    Given User is on the "Queue" page
    When User clicks on "Implementation using array" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/Implementation-array/" page
    Then User clicks on "Try here>>>" button 
 And User is on the "tryEditor" page
  And User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  And The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  And User click ok button in the alert window
  And user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
   Given User is on the "Queue" page
    When User clicks on "Implementation using array" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/Implementation-array/" page
    Then User clicks on "Try here>>>" button 
  And User is on the "tryEditor" page
  And User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
 And User is able to see the output in console
  And User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: Queue Operations page
    Given User is on the "Queue" page
    When User clicks on "Queue Operations" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/QueueOp/" page
    Then User clicks on "Try here>>>" button 
  And User is on the "tryEditor" page
  And User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  And The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  And User click ok button in the alert window
  And user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
   Given User is on the "Queue" page
    When User clicks on "Queue Operations" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/QueueOp/" page
    Then User clicks on "Try here>>>" button
  And User is on the "tryEditor" page
  And User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
 And User is able to see the output in console
  And User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    

 
    
    
    
  
	