Feature: user should be able to search for restaurants near given address

  Scenario: Verify user can search for fast food nearby
    Given the user on doorsash main page
    When the user enters address
    And user clicks the search button
    And clicks the fastfood
    And delivery under $3
    Then verify delivery is less than $3

    Scenario Outline: Verify user can search by state
      When user clicks on search box "by location"
      And user enters <state>
      And user clicks on search button
      Then verify the warning message "We can't deliver to this address"
      Examples:
        | state      |
        | Illinois   |
        | California |
        | Indiana    |
        | Washington |

