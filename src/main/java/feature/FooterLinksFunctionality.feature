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
Feature: FooterLinks functionality

  @tag1
  Scenario: User should be able to About Us footerlink
    Given user is in homepage of application
    When user clicks on About Us footerlink
    Then user should land on About Us page

@tag2
  Scenario: User should be able to Our Team footerlink
    Given user is in homepage of application
    When user clicks on Our Team footerlink
    Then user should land on Our Team page
 
 @tag3
  Scenario: User should be able to Our Instructor footerlink
    Given user is in homepage of application
    When user clicks on Our Instructors footerlink
    Then user should land on Our Instructor page
    
    @tag4
  Scenario: User should be able to Tuition & Financing footerlink
    Given user is in homepage of application
    When user clicks onTuition & Financing footerlink
    Then user should land on Tuition & Financing page
    
    @tag5
  Scenario: User should be able to Our Events footerlink
    Given user is in homepage of application
    When user clicks on Our Events footerlink
    Then user should land on Our Events page
   
