Feature: hiding the additional costs from the user
  I would like to not see hidden costs of renting a film.

  Scenario: Successfully hiding extra costs from from the user
    Given a user is at checkout
    When The user rents a film
    Then They are charged more
