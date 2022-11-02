Feature: Adding the rental cost and replacement cost to final cost
  I would like to be able to pay the replacement cost on top of the Rental Cost

  Scenario: Successfully allowing a user to pay extra fees
    Given a user wants to find rent a film
    When a user types purchases a film
    Then they see the extra costs of the film