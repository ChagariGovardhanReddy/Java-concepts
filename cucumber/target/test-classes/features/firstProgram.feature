 //Background Scope lies with in the feature file
 Background:
    Given setup the entries in database
    And launch the browser from config variables
    And hit the home page url of banking site
    
Feature: Application Login
 @RegressionTest @NetBanking
  Scenario: Admin Page default login
   
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed
    
    #Resuable
    @RegressionTest
    Scenario: User Page default login
   
    Given User is on NetBanking landing page
    When User login into application with "user" and password "1204"
    Then Home Page is displayed
    And Cards are displayed
    
    //when we want to run particular Scenarios. lets run SmokeTest.
    //Smoke Test : It means we run only high level testcases
    
    @SmokeTest @RegressionTest
    Scenario Outline: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "<username>" and password "<Password>" combination
    Then Home Page is displayed
    And Cards are displayed
    Examples:
    |Username|Password|
    |debituser|hello12|
    |credituser|lpo213|
    
    @SmokeTest @RegressionTest
     Scenario: User Page default Sign up
     Given User is on Practice landing page
     when User Signup into application
     |Govardhan|
     |Reddy|
     |gova@email.com|
     |87567879|
     Then Home Page is displayed
    And Cards are displayed
    
  