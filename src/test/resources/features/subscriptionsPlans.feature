@stcSubscriptions
Feature: Checking subscription types
  As a user, I want to check available subscription types in different countries.

 Scenario Outline: Verify available plan types for different countries
    Given the user is on the STC subscriptions page for <country>
    When the user checks the available subscription plan types
    Then the user should find the followung plan types:
    |"Lite"    |
    |"Classic" |
    |"Premium" |
    
     Examples:
      |country  |
      |"KSA"      |
      |"Bahrain"  |
      |"Kuwait"   |
    
