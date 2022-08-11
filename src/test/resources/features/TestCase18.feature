@Team3
Feature: Ensure checkout process is not possible with out of stock items

  Scenario:
    Given I am on shop page
    And Out of stock item is added to Shopping Cart
    Then I click on Shopping Cart in top menu
    Then I see error message: "Products marked with *** are not available in the desired quantity or not in stock!"

