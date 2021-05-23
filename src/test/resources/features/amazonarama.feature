Feature: Amazon Arama
  @amazonarama
  Scenario: TC01_kullanici amazonda urun arar
    Given kullanici amazon sayfasina gider
    And kullanici aramakutusuna iphone yazar
    Then kullanici sonucsayisini ekrana yazar