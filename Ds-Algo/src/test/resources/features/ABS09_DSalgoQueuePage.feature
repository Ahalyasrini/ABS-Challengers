@queue
Feature: User launch DSAlgo application and Test Queue page

@queue
Scenario: The user is able to naviagte to Queue page
	Given The user is on the homepage
	When User clicks on "Get Started" link 
	Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/" page 
	
@queue
Scenario: Implementation of Queue page
    Given User is on the "Queue" page
    When User clicks on "Implementation of Queue in Python" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/implementation-lists/" page
    Then User clicks on "Try here>>>" button 
    
@queue
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
  Given User is on the "tryEditor" page
  When User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then User click ok button in the alert window
  Then user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
  Given User is on the "tryEditor" page
  When User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then User is able to see the output in console
  Then User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
  @queue
Scenario: Implementation using collections.deque page
    Given User is on the "Queue" page
    When User clicks on "Implementation using collections.deque" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/implementation-collections/" page
    Then User clicks on "Try here>>>" button 
    
@queue
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
  Given User is on the "tryEditor" page
  When User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then User click ok button in the alert window
  Then user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
  Given User is on the "tryEditor" page
  When User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then User is able to see the output in console
  Then User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
   @queue
Scenario: Implementation using array page
    Given User is on the "Queue" page
    When User clicks on "Implementation using array" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/Implementation-array/" page
    Then User clicks on "Try here>>>" button 
    
@queue
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
  Given User is on the "tryEditor" page
  When User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then User click ok button in the alert window
  Then user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
  Given User is on the "tryEditor" page
  When User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then User is able to see the output in console
  Then User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario: Queue Operations page
    Given User is on the "Queue" page
    When User clicks on "Queue Operations" link
    Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/QueueOp/" page
    Then User clicks on "Try here>>>" button 
    
@queue
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
  Given User is on the "tryEditor" page
  When User enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then The user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then User click ok button in the alert window
  Then user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue
Scenario Outline: The user is able to see the output in console with proper python code
  Given User is on the "tryEditor" page
  When User enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks on Run button
  Then User is able to see the output in console
  Then User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@queue 
Scenario: The user is able to navigate to Practice Questions in Queue page
  Given User is on the "Queue" page 
  When User clicks on "Practice Questions" link
  Then User should be navigate to "https://dsportalapp.herokuapp.com/queue/practice" page 
 
    
    
    
  
	