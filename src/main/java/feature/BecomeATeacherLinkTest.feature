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
Feature: Become A Teacher link test from homepage of application

  @tag1
  Scenario: User should be able to click Become a Teacher link
    Given user is in the homepage of application
    When user clicks on Become a Teacher link
    Then user should land on Become a Teacher page
  
  #@tag2
  #Scenario: User should be able to enter required information and send message
  #	Given user lands on homepage of application
#		And user clicks Become A Teacher link
#		When user enters the required information
#		And clicks Send Your Message button
#		Then user should be able to Send their Message
