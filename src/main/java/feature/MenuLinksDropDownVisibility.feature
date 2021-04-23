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
Feature: Menu links with drop down options visibility

  @tag1
  Scenario: User should be able to view different options when cursor is moved to About Us menu link
    Given user is in homepage
    When user moves cursor to About Us menu link
    Then user should be able to view different About Us options
   
  @tag2
  Scenario: User should be able to view different options when cursor is moved to Services menu link
    Given user is in homepage
    When user moves cursor to Services menu link
    Then user should be able to view different Services options
    
	@tag3
  Scenario: User should be able to view different options when cursor is moved to Courses menu link
    Given user is in homepage
    When user moves cursor to Courses menu link
    Then user should be able to view different Courses options

  
