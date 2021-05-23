package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonAramaSD {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://amazon.com");
    }


    @Given("kullanici aramakutusuna iphone yazar")
    public void kullanici_aramakutusuna_iphone_yazar() {
        amazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("kullanici sonucsayisini ekrana yazar")
    public void kullanici_sonucsayisini_ekrana_yazar() {
        String sonucSayisi = amazonPage.sonucSayisi.getText();

        System.out.println(sonucSayisi);
    }



}
