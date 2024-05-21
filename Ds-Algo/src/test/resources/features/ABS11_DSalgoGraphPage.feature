@graph
Feature: User launch DSAlgo application and Test Queue page

Background: The login  steps
    Given The user should open the browser and enters the DS_Algo Portal  
    Then The user should be landed on the DS_Algo Get Started page with message "You are at the right place"
    When User clicks on get started button
    Then User should be landed on the data structure page with title "NumpyNinja"
      Given The  user land on DS Algo Sign in page
      When The user clicks login button after entering valid credentials "abschallengers" and "numpyninja17"
      Then The user should land in Data Structure Home Page "You are logged in"

@graph
Scenario: The user is able to naviagte to Graph page
	Given User is on homepage
	When User clicks "Get Started" link 
	Then User should navigate to "https://dsportalapp.herokuapp.com/graph/" page 
	
@graph
Scenario: Navigating to Graph page and clicking the Try here button
    Given User is on "Graph" page
    When User clicks "Graph" link
    Then User should navigate to "https://dsportalapp.herokuapp.com/graph/graph/" page
    Then User clicks "Try here>>>" button 
    
@graph
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
  Given User is on "tryEditor" page
  When User enters inValid python <rowNumber> in text editor from the excel sheet <SheetName>
  And clicks on the Run button
  Then The user is able to see error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then User click ok button in alert window
  Then user clears text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@graph
Scenario Outline: The user is able to see the output in console with proper python code
  Given User is on "tryEditor" page
  When User enters Valid python <rowNumber> in text editor from the excel sheet <SheetName>
  And clicks on the Run button
  Then User is able to see output in console
  Then The User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@graph
Scenario: Navigating to Graph Representations page and clicking the Try here button
    Given User is on "Graph" page
    When User clicks "Graph Representations" link
    Then User should navigate to "https://dsportalapp.herokuapp.com/graph/graph-representations/" page
    Then User clicks "Try here>>>" button 
    
@graph
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
  Given User is on "tryEditor" page
  When User enters inValid python <rowNumber> in text editor from the excel sheet <SheetName>
  And clicks on the Run button
  Then The user is able to see error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then User click ok button in alert window
  Then user clears text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
@graph
Scenario Outline: The user is able to see the output in console with proper python code
  Given User is on "tryEditor" page
  When User enters Valid python <rowNumber> in text editor from the excel sheet <SheetName>
  And clicks on the Run button
  Then User is able to see output in console
  Then The User navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    

@graph
Scenario: The user is able to navigate to Practice Questions in Graph page
  Given User is on "Queue" page 
  When User clicks "Practice Questions" link
  Then User should navigate to "https://dsportalapp.herokuapp.com/graph/practice" page 
  And The user clicks on signout 
