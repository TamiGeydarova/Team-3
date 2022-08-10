Feature: Product option functionality

  Background:
    Given I am on the Home page


  @compare
  Scenario:
    And I click on product category <Category>
    Then I am on products list page
    And I click on Compare Button for a chosen item
    Then I I see message: Success: You have added " " to your product comparison!


  @wishList
  Scenario:
    And I click on product category <Category>
    Then I am on products list page
    And I click on Heart Button for a chosen item
    Then I see message: Success: You have added " " to your wish list!

  @addingToCart
  Scenario:
    And I click on product category <Category>
    Then I am on products list page
    And I click on Add to Cart Button
    Then I see message:  Success: You have added " " to your shopping cart!





