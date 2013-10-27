Feature: Find Owners
  As a Receptionist
  I want to find an owner
  So that I can know who I am serving

  Scenario: See all owners
    Given I have chosen to find owners
    When I search without providing any details
    Then I should see all owners
