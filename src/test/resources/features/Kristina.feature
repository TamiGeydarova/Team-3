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

  @INSERT_TAG_HERE
  Scenario: Categories are present as drop down from Home-page
    Given open shop page
    Then click categories button Desktops
    And i see dropdown
  @INSERT_TAG_HERE
    Scenario: Categories are present as drop down from Registration page
      Given open shop page
      Then click My Account button
      Then click Register button
      Then click categories button Desktops
      And i see dropdown
  @INSERT_TAG_HERE
  Scenario: Categories are present as drop down from Shopping Cart
    Given open shop page
    Then click on shopping cart
    Then click categories button Desktops
    And i see dropdown

#  @INSERT_TAG_HERE
#  Scenario: Ensure browse page contains list of products from this category
#    Given open shop page
#    Then click button Show all Desktops
#    And subcategory desktop has desktops
#    Then click button laptops and notebooks from left side menu
#    And subcategory laptops and notebooks has laptops and notebooks
#    Then click button components from left side menu
#    And subcategory components has components
#    Then click button Software from left side menu
#    And subcategory software has software
#    Then click phones and pdas from left side menu
#    And subcategory phones and pdas has phones and pdas
#    Then click button cameras from left side menu
#    And subcategory cameras has cameras
#    Then click button mp3 players from left side menu
#    And subbcategory mp3 players has players







