@arraypage
Feature: DSalgo arraypage
  I want to use this template for my feature file
  
  Background: The login  steps
    Given The user should open the browser and enters the DS_Algo Portal  
    Then The user should be landed on the DS_Algo Get Started page with message "You are at the right place"
    When User clicks on get started button
    Then User should be landed on the data structure page with title "NumpyNinja"
      Given The  user land on DS Algo Sign in page
      When The user clicks login button after entering valid credentials "abschallengers" and "numpyninja17"
      Then The user should land in Data Structure Home Page "You are logged in"


  @arrayPage
  Scenario: validating array page
    Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the array
    Then The user should be redirected to the Array Page verify the pagetitle
    Then The links should be displayed under topics covered
      | Arrays in python         |
      | Arrays using list        |
      | Basic operations in list |
      | Applications of array    |

  @arrayPage14
  Scenario Outline: validating Arrays in python page
     Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the array
    Given User is on Arrays in python page and verify the pagetitle
    When The user clicks Try Here button of Array in Python Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The user write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |

  @arrayPage14
  Scenario Outline: validating Arrays using list page
       Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the array
    Given User is on Arrays in python page and verify the pagetitle
   
    
    Given User is on Arrays using list  page  and verify the pagetitle
    When The user clicks Try Here button of Array using list  Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The user write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
       @arrayPage14
  Scenario Outline: validating Basic operations in list page
         Given User is on Dalgo homepage  and verify the page title
    When The user clicks  Get Started button below the array
    Given User is on Arrays in python page and verify the pagetitle
    Given User is on  Basic operations in list  page  and verify the pagetitle
    When The user clicks Try Here button of Array using list  Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    And user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
    Then The user write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

    Examples: 
      | rowNumber | sheetName       | message                                          |
      |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
     #  @arrayPage
 # Scenario Outline: validating Applications of array page
     #    Given User is on Dalgo homepage  and verify the page title
 #   When The user clicks  Get Started button below the array
  #  Given User is on Arrays in python page and verify the pagetitle
  #  Given User is on  Applications of array page  page  and verify the pagetitle
   # When The user clicks Try Here button of Array using list  Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
#    And user is on python editor and User write the invalid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see an <message> in alert window
   # Then The user write the valid code in Editor <rowNumber> and <sheetName> and click run button and the user should able to see output in the console

 #   Examples: 
   #   | rowNumber | sheetName       | message                                          |
   #   |         1 | Text_Try_Editor | NameError: name 'hello' is not defined on line 1 |
      
      
 # @arrayPage
 # Scenario Outline: validating Practice questions page
     #    Given User is on Dalgo homepage  and verify the page title
  #  When The user clicks  Get Started button below the array
  #  Given User is on Arrays in python page and verify the pagetitle
 #   Given User clicks Practice questions biutton  and user should be navigated to "https://dsportalapp.herokuapp.com/array/practice"
  #  Then The user verify the links <sheetName>

   # Examples: 
   #   |  sheetName       |
   #   |  practiceQuestions |

