 //Background Scope lies with in the feature file
 Background:
    Given setup the entries in database
    And launch the browser from config variables
    And hit the home page url of banking site
    

    
    #Resuable
    @MobileTest @NetBanking
    Scenario: User Page default login
   
    Given User is on NetBanking landing page
    When User login into application with "user" and password "1204"
    Then Home Page is displayed
    And Cards are displayed
    
    //when we want to run particular Scenarios. lets run SmokeTest.
    //Smoke Test : It means we run only high level testcases
    
    @SmokeTest @RegressionTest @Mortgage
    Scenario Outline: Mortgage User Page default login
    Given User is on NetBanking landing page
    When User login into application with "<username>" and password "<Password>" combination
    Then Home Page is displayed
    And Cards are displayed
    Examples:
    |Username|Password|
    |debituser|hello12|
    |credituser|lpo213|
    
  
    
  