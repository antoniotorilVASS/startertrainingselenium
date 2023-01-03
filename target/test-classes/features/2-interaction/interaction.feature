@gui
Feature: Complete test in Store Delivery
  Como usuario de la web voy se va a realizar un test completo de la web

  @sd @download
  Scenario: download excel
    When introduce <date> as "2022-08-01 ~ 2022-08-31"
    Then select date
    And click button DownloadExcel

  @sd @main
  Scenario: check pagination
    When visit almacen <page> as "http://localhost:8080/home/warehouse-op"
    Then pulse number pagination
    And check button back pagination
    And check button next pagination