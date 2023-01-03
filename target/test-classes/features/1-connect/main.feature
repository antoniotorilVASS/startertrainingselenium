@gui
Feature: Complete test in Store Delivery
  Como usuario de la web voy se va a realizar un test completo de la web

  @sd @main
  Scenario: access data
    Given login to page
    When login to page <user> as "30094971"
    Then login to page <pass> as "ler123"
    And click to login button
