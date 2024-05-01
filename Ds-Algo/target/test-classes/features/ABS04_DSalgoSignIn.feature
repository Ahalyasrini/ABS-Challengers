@homePage
Feature: DS Algo Sign in Page
  I want to use this template for my feature file

  @homePage
  Scenario: Signin page validation with no username and password
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after leaving the <username> textbox and <password> textbox blank
    Then The error message "Please fill out this field." appears below Username textbox

  @homePage
  Scenario Outline: Signin page validation with username and  no password
    Given user is on the DS Algo Sign in Page
    And The user clicks login button after entering the <userName> and leaves <password> textbox blank
    Then The error message "Please fill out this field." appears below Pwd textbox

    Examples: 
      | userName       | password |
      | abschallengers |          |

  @homePage
  Scenario Outline: Signin page validation with no username
    Given user is on  DS Algo Sign in Page
    When The user clicks login button after entering the <passWord> only
    Then The error message "Please fill out this field." appears below username textbox

    Examples: 
      | username | passWord     |
      |          | numpyninja17 |

  @homePage
  Scenario Outline: Signin page validation with invalid username and invalid  password
    Given user lands on DS Algo Sign in page
    When The user clicks login button after entering invalid <UserName> and invalid <PassWord>
    Then The error message "Invalid Username and Password". appears below Username textbox

    Examples: 
      | UserName | PassWord |
      | abs      | numpy17  |

  @homePage
  Scenario Outline: Signin page validation with valid username and valid password
    Given The  user land on DS Algo Sign in page
    When The user clicks login button after entering valid <UserName> and valid <PassWord>
    Then The user should land in Data Structure Home Page

    Examples: 
      | UserName| PassWord |
      | abschallengers | numpyninja17 |
