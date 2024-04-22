Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User click on Login link
    And User enters valid data
    And User click on Yalla button
    Then User verifiesSuccess Message is displayed
    And User quites Browser