@gui
Feature: Complete test in Store Delivery
  Como usuario de la web voy se va a realizar un test completo de la web

  @connect
  Scenario: datos de acceso
    Given login to page
    When login to page <user> as "30094971"
    Then login to page <pass> as "ler123"
    And click to login button
    And introduce <date> as "2022-08-01 ~ 2022-08-31"
    And select date
    And click button DownloadExcel
