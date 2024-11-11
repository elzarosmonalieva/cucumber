Feature: Generate Calories feature

  @generateCalories
  Scenario: Verify user can generate 4 meals for given amount of calories
    Given user goes to "https://www.eatthismuch.com/"
    And user enters 2500 calories
    Then user selects 4 meals
    And user clicks on generate
    Then verify 4 meals are generated


  @generateCalories1
  Scenario: Verify user chooses 7 meals
    Given user goes to "https://www.eatthismuch.com/"
    And user enters 3500 calories
    Then user selects 6 meals
    And user clicks on generate

  @generateCalories2
  Scenario:  Verify user can generate 5 meals for Vegan
    Given user goes to "https://www.eatthismuch.com/"
    Then clicks on vegan
    And user enters 1900 calories
    Then user selects 5 meals
    And user clicks on generate
    Then verify 5 meals are generated