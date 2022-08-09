Feature: Checkout Button Appearance And Redirect To Checkout Page

  @checkoutLink
  Scenario:
    Given I am on the Home page
    And I click on Checkout in top menu
    Then I am on the Checkout Page

  @checkoutInShoppingCartPage
  Scenario:
    Given I am on the Home page
    Then I click on a category <Category>
    And I click on chosen item <Item>
    Then I add the item <Item> to my shopping cart
    And I have an item in the shopping cart
    Then I click on Shopping Cart in top menu
    Then I click on Checkout Button
    And I am on the Checkout Page







