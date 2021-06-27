package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ( id = "twotabsearchtextbox" )
    public WebElement aramaKutusu;

    @FindBy ( xpath = "//h1//div/span")
    public WebElement sonucSayisi;

    @FindBy ( id = "searchDropdownBox")
    public WebElement catList;

    @FindBy ( css = "[data-component-type='s-search-result']")
    public List<WebElement> tumUrunler;

}
