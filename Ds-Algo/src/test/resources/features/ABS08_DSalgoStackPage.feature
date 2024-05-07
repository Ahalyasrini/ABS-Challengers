@stack
Feature: User launch DSAlgo application and test stack page


@stack
Scenario: The user is able to naviagte to Stack page
	Given The user is on homepage
	When The user clicks "Get Started" link
	Then The user should be redirected to "Stack" page 

@stack
Scenario: The user is able to navigate to Operations in Stack page
	Given The user is on the "Stack" page 
	When The user clicks "Operations in Stack" link
	Then The user should be redirected to "Operations in Stack" page

@stack
Scenario: The user is able to navigate to a page having an tryEditor from Opertaions in Stack page 
	Given The user is on the "Opertions in Stack" page
	When The user clicks "Try here>>>" button on "operations in stack" page
	Then The user should be redirected to a page having an tryEditor with a Run button to test

@stack
Scenario Outline: The user is able to see the output in console with proper python code
  Given The user is on the "tryEditor" page
  When The user writes Valid python "<code>"
  And clicks Run button
  Then user is able to see the output in console
   Examples:
 |code|
  |printhello|

@stack
Scenario Outline: The user is able to see the error message in pop up window with inproper python code
  Given The user is on the "tryEditor" page
  When The user writes invalid python "<code>"
  And clicks Run button
  Then user is able to see the error msg in pop up window 
 Examples:
 |code|
  |hello|
  
@stack
Scenario: The user is on the editor page with editor and run button
  Given The user is on the editor page with Alert error message
  When The user click ok button in the alert window
  Then  the user is on the same page having Editor and Run button
  
@stack
 Scenario: The user is able to navigate to Implementations in Stack page
  Given The user is on the "Stack" page 
  When The user clicks "Implementation" link
  Then The user should be redirected to "Implementation" page  
 
@stack   
Scenario: The user is able to navigate to a page having an tryEditor from Implementation page 
  Given The user is on the "Implementation" page 
  When The user clicks "Try Here>>>" button on "Implementation" page
  Then The user should be redirected to a page having an tryEditor with a Run button to test


@stack
Scenario Outline: The user is able to see the output in console with proper python code
  Given The user is on the "tryEditor" page
  When The user writes Valid python "<code>"
  And clicks Run button
  Then user is able to see the output in console
   Examples:
  |code|
  |printhello|
  

@stack
Scenario Outline: The user is able to see the error message in pop up window with inproper python code
  Given The user is on the "tryEditor" page
  When The user writes invalid python "<code>"
  And clicks Run button
  Then user is able to see the error msg in pop up window 
   Examples:
  |code|
  |hello|
  
 @stack
Scenario: The user is on the editor page with editor and run button
  Given The user is on the editor page with Alert error message
  When The user click ok button in the alert window
  Then  the user is on the same page having Editor and Run button
    
 @stack
Scenario: The user is able to navigate to Applications in Stack page
  Given The user is on the "Stack" page 
   When The user clicks "Applications" link
  Then The user should be redirected to "Applications" page 
  
@stack
Scenario: The user is able to navigate to a page having an tryEditor from Applications page 
  Given The user is on the "Applications" page 
  When The user clicks "Try Here>>>" button on "Applications" page
  Then The user should be redirected to a page having an tryEditor with a Run button to test

@stack
Scenario Outline: The user is able to see the output in console with proper python code
  Given The user is on the "tryEditor" page
  When The user writes Valid python "<code>"
  And clicks Run button
  Then user is able to see the output in console
   Examples:
  |code|
  |printhello|
  

@stack
Scenario Outline: The user is able to see the error message in pop up window with inproper python code
  Given The user is on the "tryEditor" page
  When The user writes invalid python "<code>"
  And clicks Run button
  Then user is able to see the error msg in pop up window 
   Examples:
  |code|
  |hello|
  
 @stack
Scenario: The user is on the editor page with editor and run button
  Given The user is on the editor page with Alert error message
  When The user click ok button in the alert window
  Then  the user is on the same page having Editor and Run button 
    
@stack 
Scenario: The user is able to navigate to Practice Questions in Stack page
  Given The user is on the "Stack" page 
  When The user clicks "Practice Questions" link
  Then The user should be redirected to "Practice Questions" page 


