Feature: Checkout

  Background:
    Given I log in
    And I add to cart in stock item
    And I go to checkout

  @test
  Scenario: Validate
    When I choose to add new address
    And I fill the add new address fields
    Then I proceed to delivery details step
