Feature: Google search functionality


  Scenario: Verify user can search in English

    Given user is on google search page
    When user enters "apple"
    And user clicks on search button
    Then verify results contain "apple"


