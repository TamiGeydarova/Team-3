@Test29
Feature: Team3 Test Case 29 execution
  As a Bootcamp participant
  I want to be able to write and execute 3 scenario for adding item to Wish List, Compare and Cart from  product page

  Background:
    Given I am on shop page

  Scenario Outline: a new scenario for adding item to Wish List
    When I go to authorization page
    Then I input e-mail and password in authorization page:
      | email    | <email>    |
      | password | <password> |
    And I click on Login button in authorization page
    Then I am on the MP3 Players list page
    And I press heart icon on iPod Classic
    And I see message for wish list "Success: You have added iPod Classic to your wish list!"
    And Wishlist icon is updated accordingly

    Examples:
      | email                        | password |
      | ostnoayzckfnslmlkg@nthrl.com | 11111111 |

  Scenario: a new scenario for adding item to Compare
    When I am on the MP3 Players list page
    Then I click on two arrow icon on iPod Classic
    Then I see message for comparison "Success: You have added iPod Classic to your product comparison!"
    And product comparison text is clickable


  Scenario: a new scenario for adding item to Shopping cart
    When I am on the MP3 Players list page
    Then I click on cart icon on iPod Classic
    Then I see message for cart "Success: You have added iPod Classic to your shopping cart!"
    And  shopping cart popup item count changes
