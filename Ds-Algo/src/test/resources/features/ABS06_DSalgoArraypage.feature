
@arraypage
Feature: DSalgo arraypage
  I want to use this template for my feature file

  @arrayPage
  Scenario: validating array page
  Given User is on Dalgo homepage  and verify the page title <rowNumber>
  When The user clicks  Get Started button below the array 
  Then  The user should be redirected to the Array Page verify the pagetitle <rowNumber>
  Then The links should be displayed under topics covered 
  |Arrays in python|
  |Arrays using list|
  |Basic operations in list|
  |Applications of array|
  
  
   @arrayPage
  Scenario: validating Arrays in python page
  Given User is on Arrays in python page and verify the pagetitle <rowNumber>
  When The user clicks Try Here button of Array in Python Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
  And  The user is on python editor and User write the invalid code in Editor and click run button and the user should able to see an error message"NameError: name 'hello' is not defined on line 1" in alert window
   Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
     
   
    @arrayPage
  Scenario: validating Arrays using list page
  Given User is on Arrays using list  page  and verify the pagetitle <rowNumber>
  When The user clicks Try Here button of Array using list  Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
  And  The user is on python editor and User write the invalid code in Editor and click run button and the user should able to see an error message"NameError: name 'hello' is not defined on line 1" in alert window
     Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
     
   @arrayPage
  Scenario: validating Basic operations in list
  Given User is on  Basic operations in list  page  and verify the pagetitle <rowNumber>
  When The user clicks Try Here button of Basic operations in list Page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
  And  The user is on python editor and User write the invalid code in Editor and click run button and the user should able to see an error message"NameError: name 'hello' is not defined on line 1" in alert window
     Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
   
    @arrayPage
  Scenario: validating Applications of array page
  Given User is on  Applications of array page  and verify the pagetitle <rowNumber>
  When The user clicks Try Here button of  Applications of array page and the user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
  And  The user is on python editor and User write the invalid code in Editor and click run button and the user should able to see an error message"NameError: name 'hello' is not defined on line 1" in alert window
   Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
    
   
  
    @arrayPage
  Scenario: validating Practice questions page
  Given User clicks Practice questions biutton  and user should be navigated to "https://dsportalapp.herokuapp.com/array/practice"
  Then The user verify the links 
  |Search the array|
  |Max consecutive numbers|
  |Find Numbers With Even Numbers Of Digits|
  |Squares of a  Sorted Array|
  
 
    @arrayPage
  Scenario: validating Practice questions page
  Given User clicks Practice questions biutton  and user should be navigated to "https://dsportalapp.herokuapp.com/array/practice"
  When The user verify the link Search the array and user should be navigated to "https://dsportalapp.herokuapp.com/question/1"
  Then The user write the invalid code in Editor and click run button and the user should able to see an error message"SyntaxError: bad input on line 2" in alert window
  Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
  
   @arrayPage
  Scenario: validating Practice questions page
   Given  The user is verifying  the link Max consecutive Ones and user should be navigated to "https://dsportalapp.herokuapp.com/question/2"
  Then The user write the invalid code in Editor and click run button and the user should able to see an error message"SyntaxError: bad input on line 2" in alert window
  Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
  
    @arrayPage
  Scenario: validating Practice questions page
   Given  The user is verifying the link Find Numbers With Even Numbers Of Digits and user should be navigated to "https://dsportalapp.herokuapp.com/question/3"
  Then The user write the invalid code in Editor and click run button and the user should able to see an error message"SyntaxError: bad input on line 2" in alert window
  Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
  
    @arrayPage
  Scenario: validating Practice questions page
   Given  The user is verifying the link Squares Of a Sorted Array and user should be navigated to "https://dsportalapp.herokuapp.com/question/4"
  Then The user write the invalid code in Editor and click run button and the user should able to see an error message"SyntaxError: bad input on line 2" in alert window
  Then  The user write the valid code in Editor and click run button and the user should able to see output in the console
  
 
 
  
  


 