@DataStructure
Feature: DataStructure page

Background: The login  steps
    Given The user should open the browser and enters the DS_Algo Portal  
    Then The user should be landed on the DS_Algo Get Started page with message "You are at the right place"
    When User clicks on get started button
    Then User should be landed on the data structure page with title "NumpyNinja"
      Given The  user land on DS Algo Sign in page
      When The user clicks login button after entering valid credentials "abschallengers" and "numpyninja17"
      Then The user should land in Data Structure Home Page "You are logged in"
  
  @DataStructure 
Scenario Outline: Get started page of Data Structure
    Given User is on the "NumpyNinja" homepage
    When  User clicks on Data Structures dropdown
   # Then  Data Structures dropdown should be displayed with the list of <options>
   # |Arrays|
    #|LinkedList|
    #|Stack|
    #|Queue|
    #|Tree|
    #|Graph|
    Then User clicks on get started button on the data structures pane  
    
@DataStructure
Scenario: Data structures introduction page
    Then User clicks on get started button on the data structures pane  
    Given User is on the "Data Structures-Introduction"
    When User clicks on Time Complexity link
    Then User should be navigated to "https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/" page
    Then User clicks on Try here button
   
@DataStructure
Scenario Outline: Text editor screen
 Then User clicks on get started button on the data structures pane  
    Given User is on the "Data Structures-Introduction"
    When User clicks on Time Complexity link
    Then User should be navigated to "https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/" page
    Then User clicks on Try here button
    Given User is on the text editor screen "https://dsportalapp.herokuapp.com/tryEditor"
    When User enters some text in the incorrect format <rowNumber> in the text editor from the excel sheet <SheetName>
    When User clicks on Run button
    Then A pop up window should be displayed with entered text being displayed in the popup message
               |NameError: name 'hello' is not defined on line 1|
    Then User clicks on OK button in the popup
    Then User clears the text editor screen
    Then User enters text in the correct format <rowNumber> in the text editor from the excel sheet <SheetName>
Examples:
    |rowNumber|SheetName|
    |1|Text_Try_Editor|
@DataStructure
Scenario: Console message and Practice Questions page
 Then User clicks on get started button on the data structures pane  
    Given User is on the "Data Structures-Introduction"
    When User clicks on Time Complexity link
    Then User should be navigated to "https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/" page
    Then User clicks on Try here button
    Given User is on the text editor screen "https://dsportalapp.herokuapp.com/tryEditor"
    When User clicks on Run button
    Then The valid text entered in the python text editor should be printed in the console    
    Then User navigates back to the "Data Structures-Introduction page"
    Then User clicks on Practice Questions link
    Then Practice Questions page should be displayed with the url "https://dsportalapp.herokuapp.com/data-structures-introduction/practice"

    

  