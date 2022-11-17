Feature: Printing all the films to the user
  I would like to be able to see the catalogue of Films

  Scenario: Successfully allowing a user to see all the films available
    Given a user wants to see all the films
    When a user visits the webpage
    Then they see the catalogue of films