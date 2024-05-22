@stack
Feature: User launch DSAlgo application and test stack page

Background: The login  steps
    Given The user should open the browser and enters the DS_Algo Portal  
    Then The user should be landed on the DS_Algo Get Started page with message "You are at the right place"
    When User clicks on get started button
    Then User should be landed on the data structure page with title "NumpyNinja"
      Given The  user land on DS Algo Sign in page
      When The user clicks login button after entering valid credentials "abschallengers" and "numpyninja17"
      Then The user should land in Data Structure Home Page "You are logged in"
  


@stack
Scenario: The user is able to naviagte to Stack page
	Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 

@stack
Scenario: The user is able to navigate to Operations in Stack page
Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
	Given The user is on the "Stack" page 
	When The user clicks "Operations in Stack" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/operations-in-stack/" page

@stack
Scenario: The user is able to navigate to a page having an tryEditor from Opertaions in Stack page 
Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
	Given The user is on the "Stack" page 
	When The user clicks "Operations in Stack" link
	When The user clicks "Try here>>>" button on "operations in stack" page
	Then The user is on the "TryEditor" page 
	Then The user should have a button with text "Run" on the page

@stack
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
	Given The user is on the "Stack" page 
	When The user clicks "Operations in Stack" link
	When The user clicks "Try here>>>" button on "operations in stack" page
  Given The user is on the "tryEditor" page
  When The user enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks Run button
  Then user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then The user click ok button in the alert window
  Then The user clears the text editor screen
 Examples:
 		|rowNumber|SheetName|
    |1|Text_Try_Editor|
    
 @stack
Scenario Outline: The user is able to see the output in console with proper python code
Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
	Given The user is on the "Stack" page 
	When The user clicks "Operations in Stack" link
	When The user clicks "Try here>>>" button on "operations in stack" page
  Given The user is on the "tryEditor" page
  When The user enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks Run button
  Then user is able to see the output in console
  Then The user navigates back
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
    
 @stack
 Scenario: The user is able to navigate to Implementations in Stack page
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
  Given The user is on the "Stack" page 
  When The user clicks "Implementation" link
  Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/implementation/" page  
 
@stack
Scenario: The user is able to navigate to a page having an tryEditor from Implementation page 
   Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
  Given The user is on the "Stack" page 
  When The user clicks "Implementation" link
  When The user clicks "Try Here>>>" button on "Implementation" page
 Then The user is on the "TryEditor" page 
	Then The user should have a button with text "Run" on the page


@stack
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
  Given The user is on the "Stack" page 
  When The user clicks "Implementation" link
  When The user clicks "Try Here>>>" button on "Implementation" page
  Given The user is on the "tryEditor" page
  When The user enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks Run button
  Then user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then The user click ok button in the alert window
  Then The user clears the text editor screen
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
  
@stack
Scenario Outline: The user is able to see the output in console with proper python code
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
  Given The user is on the "Stack" page 
  When The user clicks "Implementation" link
  When The user clicks "Try Here>>>" button on "Implementation" page
  Given The user is on the "tryEditor" page
  When The user enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks Run button
  Then user is able to see the output in console
  Then The user navigates back
  Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
 
 
    
@stack
Scenario: The user is able to navigate to Applications in Stack page
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
  Given The user is on the "Stack" page 
   When The user clicks "Implementation" link
    When The user clicks "Applications" link
  Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/stack-applications/" page 
  
@stack
Scenario: The user is able to navigate to a page having an tryEditor from Applications page 
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
	  Given The user is on the "Stack" page 
	   When The user clicks "Implementation" link
  When The user clicks "Applications" link
  When The user clicks "Try Here>>>" button on "Applications" page
  Then The user is on the "TryEditor" page 
	Then The user should have a button with text "Run" on the page


@stack
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
	  Given The user is on the "Stack" page 
	   When The user clicks "Implementation" link
  When The user clicks "Applications" link
  When The user clicks "Try Here>>>" button on "Applications" page
  Given The user is on the "tryEditor" page
  When The user enters inValid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks Run button
  Then user is able to see the error msg in pop up window 
  |NameError: name 'hello' is not defined on line 1|
  Then The user click ok button in the alert window
  Then The user clears the text editor screen
   Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
  
@stack
Scenario Outline: The user is able to see the output in console with proper python code
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
	  Given The user is on the "Stack" page 
	   When The user clicks "Implementation" link
  When The user clicks "Applications" link
  When The user clicks "Try Here>>>" button on "Applications" page
  Given The user is on the "tryEditor" page
  When The user enters Valid python <rowNumber> in the text editor from the excel sheet <SheetName>
  And clicks Run button
  Then user is able to see the output in console
  Then The user navigates back
    Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
  
    
@stack
Scenario: The user is able to navigate to Practice Questions in Stack page
 Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 
  Given The user is on the "Stack" page 
   When The user clicks "Implementation" link
  When The user clicks "Practice Questions" link
  Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/practice" page 



 
  
 
  
   
