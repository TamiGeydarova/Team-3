@checkoutLink
Feature: Checkout Button Appearance And Redirect To Checkout Page


  Background:
    Given I am on shop page

  Scenario:
    And I click on Checkout in top menu
    Then I am on the Checkout Page

  Scenario:
    When I add one item in Shopping Cart
    Then I click on Shopping Cart in top menu
    Then I click on Checkout Button
    And I am on the Checkout Page


  Scenario:
    When I add one item in Shopping Cart
    Then I click on Shopping Cart popup
    And I see the the Shopping Cart popup displayed
    Then I click on Checkout
    And I am on the Checkout Page









