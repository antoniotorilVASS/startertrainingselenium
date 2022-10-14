@gui
Feature: Complete test in Store Delivery
  Como usuario de la web voy se va a realizar un test completo de la web

  @sd @main
  Scenario: access data
    Given login to page
    When login to page <user> as "30094971"
    Then login to page <pass> as "EyJ2024.."
    And click to login button

  @sd @download
  Scenario: download excel
    When introduce <date> as "2022-08-01 ~ 2022-08-31"
    Then select date
    And click button DownloadExcel

  @sd
  Scenario: check pagination with
    When visit almacen <page> as "http://localhost:8080/home/warehouse-op"
    Then pulse number pagination
    And check button back pagination
    And check button next pagination

  @sd @main
  Scenario: check pagination
    When visit almacen
    Then pulse number pagination
    And check button back pagination
    And check button next pagination