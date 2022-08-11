Feature: SortingFeature

#  @INSERT_TAG_HERE
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
#
#  @INSERT_TAG_HERE
#  Scenario: Login into Google with incorrect user data
#    Given open Google webpage
#    And click login button
#    And type user credentials
#      | username | test1234  |
#      | password | qwerty123 |
#    When click login
#    Then error message: Parole nav pareiza

  @Team3
  Scenario: Sorting in browse page by Alphabet from A to Z
    Given I am on Browse page
    Then I click sort button
    And I Sort by Alphabet AZ
    #Then I check merchendise AZ
  @Team3
  Scenario: Sorting in browse page by Alphabet from Z to A
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Alphabet ZA
    #Then I check merchendise ZA
  @Team3
  Scenario: Sorting in browse page by Price Low to High
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Price Low to High
    #And I check merchendise Price Low to High
  @Team3
  Scenario: Sorting in browse page by Price High to Low
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Price High to Low
    #And I check merchendise Price High to Low
  @Team3
  Scenario: Sorting in browse page by rating High to low
    Given I am on Browse page
    Then I click sort button
    Then I Sort by rating High to low
    #And I check merchendise rating High to low
  @Team3
  Scenario: Sorting in browse page by rating Low to High
    Given I am on Browse page
    Then I click sort button
    Then I Sort by rating Low to High
    #And I check merchendise rating Low to High
  @Team3
  Scenario: Sorting in browse page by Model name alphabetically from A to Z
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Model name alphabetically AZ
    #And I check merchendise models AZ
  @Team3
  Scenario: Sorting in browse page by Model name alphabetically from Z to A
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Model name alphabetically ZA
   # And I check merchendise models ZA
#  @HoverOver
#  Scenario: hover button
#    Given I am on Browse page
#    Then I hover over mp3player