@subscriptions
Feature: Checking subscription types
  As a user, I want to check available subscription types in different countries.

  Scenario Outline: Check available subscription plans for different countries
    Given the user is on the STC subscriptions page for <country>
    When the user checks the available subscription plan types
    Then the user should find the agreed plan types
    
     Examples:
      | country |
      | KSA     |
      | Bahrain |
      | Kuwait  |
    

  Scenario Outline: Check subscription price for different plans
    Given the user is on the STC subscriptions page for <country> 
    When the user checks the monthly price for <planType>
    Then the user should find the agreed price for the <planType>

    Examples:
      | country | planType |
      | KSA     | LITE     |
      | Bahrain | CLASSIC  |
      | Kuwait  | PREMIUM   |

  Scenario Outline: Check subscription price currency for different plans
    Given the user is on the STC subscriptions page for <country> 
    When the user checks the monthly price currency for <planType>
    Then the user should find the agreed price currency for the <planType>

    Examples:
      | country | planType |
      | KSA     | LITE     |
      | Bahrain | CLASSIC  |
      | Kuwait  | PREMIUM   |