@Team3
Feature: Checkout Button Appearance And Redirect To Checkout Page

  Background:
    Given I am on shop page
    When I add one item in Shopping Cart

  Scenario: Direct link to Checkout on top menu
    And I click on Checkout in top menu
    Then I am on the Checkout Page

  Scenario: Shopping cart page there is a link to Checkout
    Then I click on Shopping Cart in top menu
    Then I click on Checkout Button
    And I am on the Checkout Page


  Scenario: In shopping cart popup on right side there is a link to Checkout
    Then I click on Shopping Cart popup
    And I see the the Shopping Cart popup displayed
    Then I click on Checkout
    And I am on the Checkout Page











