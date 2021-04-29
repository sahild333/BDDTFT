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
Feature: About Us drop down functionality

  @tag1
  Scenario: User should be able to click Our Story from About Us menu link
    Given user is in homepage
    When user moves cursor to About Us menu link
    And user clicks on Our Story link
    Then user should land on Our Story page
   
  @tag2
  Scenario: User should be click Our Team from About Us menu link
    Given user is in homepage
    When user clicks on Our Team link
    Then user should land on the Our Team page
    
	@tag3
  Scenario: User should be able to click Our Instructors from About Us menu link
    Given user is in homepage
    When user clicks on Our Instructors link
    Then user should land on Our Instructors page

  
