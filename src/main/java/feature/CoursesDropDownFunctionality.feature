#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Services menu link dropdown functionality 

  @tag1
  Scenario: User should be able to click Full Stack QA Engineer link from Services menu link dropdown
    Given user moves cursor to Courses menu link
    When user clicks on Full Stack QA Engineer link
    Then user should land on Full Stack QA Engineer page
    
   @tag2
  Scenario: User should be able to click Cyber Security Professional link from Services menu link dropdown
    Given user moves cursor to Courses menu link
    When user clicks on Cyber Security Professional link
    Then user should land on Cyber Security Professional page
    
    @tag3
  Scenario: User should be able to click Cloud Engineering link from Services menu link dropdown
    Given user moves cursor to Courses menu link
    When user clicks on Cloud Engineering link
    Then user should land on Cloud Engineering page
    
    @tag4
  Scenario: User should be able to click Business Analyst link from Services menu link dropdown
    Given user moves cursor to Courses menu link
    When user clicks on Business Analyst link
    Then user should land on Business Analyst page
    
    @tag5
  Scenario: User should be able to click Data Analytics & Visualization link from Services menu link dropdown
    Given user moves cursor to Courses menu link
    When user clicks on Data Analytics & Visualization link
    Then user should land on Data Analytics & Visualization page


