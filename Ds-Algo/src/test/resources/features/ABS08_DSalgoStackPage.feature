@stack
Feature: User launch DSAlgo application and test stack page


@stack
Scenario: The user is able to naviagte to Stack page
	Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/" page 

@stack
Scenario: The user is able to navigate to Operations in Stack page
	Given The user is on the "Stack" page 
	When The user clicks "Operations in Stack" link
	Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/operations-in-stack/" page

@stack
Scenario: The user is able to navigate to a page having an tryEditor from Opertaions in Stack page 
	Given The user is on the "Opertions in Stack" page
	When The user clicks "Try here>>>" button on "operations in stack" page
	Then The user is on the "TryEditor" page 
	Then The user should have a button with text "Run" on the page

@stack
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
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
  Given The user is on the "Stack" page 
  When The user clicks "Implementation" link
  Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/implementation/" page  
 
@stack  
Scenario: The user is able to navigate to a page having an tryEditor from Implementation page 
  Given The user is on the "Implementation" page 
  When The user clicks "Try Here>>>" button on "Implementation" page
 Then The user is on the "TryEditor" page 
	Then The user should have a button with text "Run" on the page


@stack
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
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
  Given The user is on the "Stack" page 
  When The user clicks "Applications" link
  Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/stack-applications/" page 
  
@stack
Scenario: The user is able to navigate to a page having an tryEditor from Applications page 
  Given The user is on the "Applications" page 
  When The user clicks "Try Here>>>" button on "Applications" page
  Then The user is on the "TryEditor" page 
	Then The user should have a button with text "Run" on the page


@stack
Scenario Outline: The user is able to see the error message in pop up window with incorrect python code
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
  Given The user is on the "Stack" page 
  When The user clicks "Practice Questions" link
  Then The user should be redirected to "https://dsportalapp.herokuapp.com/stack/practice" page 



 
  
 
  
   
