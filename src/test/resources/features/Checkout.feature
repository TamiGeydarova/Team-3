@Team3
Feature: Checkout

  Background:
    Given I log in
    And I add to cart in stock item
    And I go to the cart
    And I go to checkout

  @test11
  Scenario: User can add a new billing address
    When I choose to add new address
    And I fill the add new address fields
    Then I proceed to delivery details step

  @test13
  Scenario: User can choose an existing billing address
    When I choose an existing billing address
    Then I proceed to delivery details step

  @test12
  Scenario: User can add a new delivery address
    When I proceed to delivery details step
    And I choose to add new delivery address
    And I fill the add new delivery address fields
    Then I proceed to delivery method step

  @test14
  Scenario: User can choose an existing delivery address
    When I choose an existing billing address
    And I proceed to delivery details step
    Then I choose an existing delivery address

  @test15
  Scenario: User can choose a payment Method
    When I proceed to delivery details step
    And I proceed to delivery method step
    And I proceed to payment method
    And I choose a payment method
    And I agree to terms and conditions
    Then I proceed to confirm order

  @test16
  Scenario: User can choose a Delivery Method
    When I proceed to delivery details step
    And I proceed to delivery method step
    And I proceed to payment method
    And I enter card details
    And I proceed to confirm order
    Then I see error message

  @test17
  Scenario: User can choose a Delivery Method
    When I proceed to delivery details step
    And I proceed to delivery method step
    And I proceed to payment method
    And I enter card details
    And I agree to terms and conditions
    And I proceed to confirm order
    Then I confirm order