Feature: Login to NuraSpace

  Scenario: Login to NuraSpace application
    Given launch url "https://nuraspace.com/"
    When click on Log in button
    And  Enter UserName " tester.nura@nuraspace.com"
    And Enter Password "tester@Nura1"
    And click on continue
    Then login and redirect to homepage
    Then login page close driver