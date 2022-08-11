Feature: Kristina


#  Scenario Outline: Search in google
#    Given open Google webpage
#    When search "<SearchingText>"
#    Then result page was opened
#    And first result is: "<SearchingResult>"
#
#    Examples:
#      | SearchingText      | SearchingResult                            |
#      | Selenium WebDriver | Selenium WebDriver                         |
#      | Cucumber Trainings | Online training - Cucumber School·Cucumber |

  @Team3
  Scenario: Categories are present as drop down from Home-page
    Given open shop page
    Then click categories button Desktops
    And i see dropdown
  @Team3
    Scenario: Categories are present as drop down from Registration page
      Given open shop page
      Then click My Account button
      Then click Register button
      Then click categories button Desktops
      And i see dropdown
  @Team3
  Scenario: Categories are present as drop down from Shopping Cart
    Given open shop page
    Then click on shopping cart
    Then click categories button Desktops
    And i see dropdown

  @Team3
Scenario: Ensure each subcategory button contains count of available products
  Given open shop page
  Then click categories button Desktops
  And I see number of Desktops
  Then click categories button Laptops and Notebooks
  And I see number of Laptops and Notebooks
  Then click categories button Tablets
  And i see number of Tablets
  Then i click Software
  And i see number of Software
  Then i click categories button Phones and PDAs
  And i see number of Phones and PDAs
  Then i click categories button Cameras
  And i see number of Cameras
  Then i click categories button MP3 players
  And i see number of MP3 players

#   @lienetest
#    Scenario: check Lienes test
#     Given open shop page
#     Then add out of stock item to basket
#     And I see error














