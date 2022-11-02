Feature: Allowing a user to search for a film
  I would like to be able to search for a film

  Scenario: Successfully allowing a user to search for a film
    Given a user wants to find a specific film
    When a user types in the id of a film
    Then they see the details of the film