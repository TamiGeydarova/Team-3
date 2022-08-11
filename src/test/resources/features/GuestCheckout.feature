@GuestCheckout
Feature: Ensure there is a page with guest checkout


  Scenario Outline: guest checkout
    Given I am on shop page
    When I add one item in Shopping Cart
    And I click on Checkout in top menu
    Then I choose Guest checkout option
    And I input my name and surname
      | name    | <name>    |
      | surname | <surname> |
    And I input e-mail and telephone
      | email     | <email>     |
      | telephone | <telephone> |
    Then I input address and city
      | address | <address> |
      | city    | <city>    |
   # Then I am on Checkout page
    #And I input e-mail and password:
    ##  | city    | <city>    |
   # Then I enter country and region/state //dropdown
   # Then I check "My delivery and billing addresses are the same" is selected
    #And I click on Continue button
   # Then I click  on Flat rate button
   # And I click on Continue button

   # And I check Step 2: Billing Details block is available and opened

    Examples:
      | name | surname | email              | telephone | address  | city |
      | John | Meadia  | abcd1234@gmail.com | 123456789 | street 1 | Riga |