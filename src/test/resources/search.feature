Feature: User searches for jobs on CV Library webpage

  Background:
    Given user is on CV Library page
    When  user accepts cookies

    @smoke
    Scenario: user searches for softwater tester jobs on CV library webpage
      And user searches for "Software tester" in jobtitle
      And user searches for "London" in location
      And User enters "10" on distance
      And user clicks on findjobs
      Then user verifies Software Tester jobs in London



