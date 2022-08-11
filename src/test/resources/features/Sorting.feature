Feature: SortingFeature



  @Team3
  Scenario: Sorting in browse page by Alphabet from A to Z
    Given I am on Browse page
    Then I click sort button
    And I Sort by Alphabet AZ

  @Team3
  Scenario: Sorting in browse page by Alphabet from Z to A
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Alphabet ZA
  @Team3
  Scenario: Sorting in browse page by Price Low to High
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Price Low to High
  @Team3
  Scenario: Sorting in browse page by Price High to Low
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Price High to Low
  @Team3
  Scenario: Sorting in browse page by rating High to low
    Given I am on Browse page
    Then I click sort button
    Then I Sort by rating High to low
  @Team3
  Scenario: Sorting in browse page by rating Low to High
    Given I am on Browse page
    Then I click sort button
    Then I Sort by rating Low to High
  @Team3
  Scenario: Sorting in browse page by Model name alphabetically from A to Z
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Model name alphabetically AZ
  @Team3
  Scenario: Sorting in browse page by Model name alphabetically from Z to A
    Given I am on Browse page
    Then I click sort button
    Then I Sort by Model name alphabetically ZA
