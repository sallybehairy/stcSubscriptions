@stcSubscriptionsPrices
Feature: Checking subscription types plans prices
  As a user, I want to check subscription plans prices in different countries.
  
  Scenario Outline: Check subscription price for different plans
    Given the user is on the STC subscriptions page for <country>
    When the user checks the monthly price for the <plantype>
    Then the user should find  <price> for <country> for <plantype>
     Examples:
      Examples:
  | country| plantype | price |
  | "KSA" | "Lite" | "15" |
  | "KSA" | "Classic" | "25" | 
  | "KSA" | "Premium" | "60" |
  | "Bahrain" | "Lite" | "2" |
  | "Bahrain" | "Classic" | "3" |
  | "Bahrain" | "Premium" | "6" | 
  | "Kuwait" |  "Lite" | "1.2" |
  | "Kuwait" | "Classic" | "2.5" |
  | "Kuwait" | "Premium" | "4.8" |
  
  @stcSubscriptionsPrices
Feature: Checking subscription types plans prices currency
  As a user, I want to check subscription plans' prices currency in different countries.
  
  Scenario Outline: Check subscription price for different plans
    Given the user is on the STC subscriptions page for <country>
    When the user checks the monthly price currency for the <plantype>
    Then the user should find  currency for <country> for <plantype>
     Examples:
      Examples:
  | country| plantype | price |
  | "KSA" | "Lite" | "SAR" |
  | "KSA" | "Classic" | "SAR" | 
  | "KSA" | "Premium" | "SAR" |
  | "Bahrain" | "Lite" | "BHD" |
  | "Bahrain" | "Classic" | "BHD" |
  | "Bahrain" | "Premium" | "BHD" | 
  | "Kuwait" |  "Lite" | "BHD" |
  | "Kuwait" | "Classic" | "BHD" |
  | "Kuwait" | "Premium" | "BHD" |
  
