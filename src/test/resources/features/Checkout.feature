Feature: Checkout Button Appearance And Redirect To Checkout Page


  Background:
    Given I am on the Home page


  @checkoutLink
  Scenario:
    And I click on Checkout in top menu
    Then I am on the Checkout Page

  @checkoutInShoppingCartPage
  Scenario:
    And I have an item in the shopping cart
    Then I click on Shopping Cart in top menu
    Then I click on Checkout Button
    And I am on the Checkout Page

  @ShoppingCartPopup
    Scenario:
    And I have an item in the shopping cart
    Then I click on Shopping Cart popup
    And I see the the Shopping Cart popup displayed
    Then I click on Checkout
    And I am on the Checkout Page









