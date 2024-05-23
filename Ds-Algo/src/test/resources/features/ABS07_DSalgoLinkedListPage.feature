
@LinkedlistPage
Feature: DSalgo LinkedlistPage
  I want to use this template for my feature file
  
    Background: The login  steps
    Given The user should open the browser and enters the DS_Algo Portal  
    Then The user should be landed on the DS_Algo Get Started page with message "You are at the right place"
    When User clicks on get started button
    Then User should be landed on the data structure page with title "NumpyNinja"
      Given The  user land on DS Algo Sign in page
      When The user clicks login button after entering valid credentials "abschallengers" and "numpyninja17"
      Then The user should land in Data Structure Home Page "You are logged in"
  

  @LinkedlistPage
  Scenario: validating LinkedlistPage
     Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
   Then  validate LinkedListPage links
   |Introduction|
   |Creating Linked List|
   |Types Of Linked List|
   |Implement Linked List In Python|
   |Traversal|
   |Insertion|
   |Deletion|

 @LinkedlistPage
    Scenario Outline: validating Introduction Page
         Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
    When The user clicks Try Here button of Introduction  Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And The  user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The User write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |

      @LinKedListPage
  Scenario Outline: validating Creating Linked List  Page
           Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
     Given User is on Creating Linked List page and verify the pagetitle
    When The user clicks Try Here button of  Creating Linked List page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
      And The  user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The User write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console
    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
       @LinkedlistPage
    Scenario Outline: validating Types Of Linked List Page
             Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
     
     Given User is on Types Of Linked List page and verify the pagetitle
    When The user clicks Try Here button of Types Of Linked List  Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And The  user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The User write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
       @LinkedlistPage
    Scenario Outline: validating Implement Linked List In Python Page
             Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
     
     Given User is on Types Of Implement Linked List In Python page and verify the pagetitle
    When The user clicks Try Here button of Implement Linked List In Python and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And The  user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The User write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
         @LinkedlistPage
    Scenario Outline: validating Traversal Page
             Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
     
     Given User is on Types Of Traversal page and verify the pagetitle
    When The user clicks Try Here button of Traversal page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And The  user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The User write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
           @LinkedlistPage14
    Scenario Outline: validating Insertion Page
             Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
     
     Given User is on Types Of Insertion page and verify the pagetitle
    When The user clicks Try Here button of Insertion page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And The  user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The User write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
      
         @LinkedlistPage14
    Scenario Outline: validating Deletion Page
             Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
     
     Given User is on Types Of Deletion page and verify the pagetitle
    When The user clicks Try Here button of Deletion page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And The  user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The User write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console
    

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
      
      
       @LinkedlistPage14
  Scenario: validating PracticeQuestionPage
           Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the LinkedList and verify pagetitle
     Given User is on Introduction page and verify the pagetitle
     
     Given User is on Types Of PractionQuestion page and verify the url"https://dsportalapp.herokuapp.com/linked-list/practice"
     Then User navigate back to DsalgohomePage