Feature: En Iyı Urun
  @amazoneniyiurun
  Scenario Outline: kullanici arama sonuclarindaki en iyi urunu bulur
    Given kullanici amazon sayfasina gider
    And kullanici kategori olarak "<kategori>" secer
    And kullanici arama kutusuna "<urun>" yazar
    And kullanici en iyi urunu bulmak icin hesaplama yapar
    Then kullanici en iyi urunu konsola yazar
    Examples:
      | kategori | urun |
      |Automotive|car phone holder|
      |Baby      |stroller        |
      |Books     |Java            |

