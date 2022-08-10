@Test29
Feature: Team3 Test Case 29 execution
  As a Bootcamp participant
  I want to be able to write and execute 1 scenario for adding item to Wish List

  Scenario Outline:  a new scenario for adding item to Wish List
    Given I am on shop page
    When I go to authorization page
    Then I input e-mail and password in authorization page:
      | email    | <email>    |
      | password | <password> |
    And I click on Login button in authorization page
    Then I am on the MP3 Players list page
    And I press heart icon on iPod Classic
    And I see message "Success: You have added iPod Classic to your wish list!"
    And Wishlist icon is updated accordingly

    Examples:
      | email                        | password |
      | ostnoayzckfnslmlkg@nthrl.com | 11111111 |

