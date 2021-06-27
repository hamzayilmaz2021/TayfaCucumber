Feature: En Iyı Urun
  @amazoneniyiurun
  Scenario: kullanici arama sonuclarindaki en iyi urunu bulur
    Given kullanici amazon sayfasina gider
    And kullanici kategori olarak "Automotive" secer
    And kullanici arama kutusuna "car phone holder" yazar
    And kullanici sonuc sayfasindaki tum urunleri listeler
    And kullanici en iyi urunu bulmak icin hesaplama yapar
    Then kullanici en iyi urunu konsola yazar
