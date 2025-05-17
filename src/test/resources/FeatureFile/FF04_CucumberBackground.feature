@abc
Feature: CucumberBackGroundLearning
  #background method will run first before executing any Scenario in that particular Feature file
   # its not a global method
  Background:
    Given user is on homepage

  Scenario: account link
    Given user clicks on account link from homepage
    Then user is navigated to Create an Account page
  @Sanity @Smoke
  Scenario:StoreLocator link
    Given user clicks on StoreLocator link from homepage
    Then User is navigates to StoreLocator page