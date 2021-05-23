package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    // Eğer bir class'tan NESNE ÜRETİLMESİNİ İSTEMİYORSANIZ
    // constructor'ı private yapabilirsiniz (Singleton Class)
    private Driver(){ }

    // WebDriver nesnemizi, static olarak oluşturduk, çünkü program başlar başlamaz
    // hafızada yer almasını istiyoruz.
    static WebDriver driver;

    // Programın herhangi bir yerinden getDriver() methodu çağırılarak
    // hafıza STATIC olarak oluşturulmuş DRIVER nesnesine erişebiliriz.
    // Yani yeniden WebDriver nesnesi oluşturmak zorunda değiliz.
    //Driver.getDriver()
    public static WebDriver getDriver(){
        // Eğer driver nesnesi hafızada boşsa, oluşturulmamışsa yeniden oluşturmana gerek yok.
        // Eğer null ise, yeniden oluşturabilirsin.
        // Sadece ilk çağırıldığında bir tane nesne üret, sonraki çağırmalarda var olan nesnesi kullan.
        if(driver == null){
            switch (ConfigurationReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    public static void closeDriver(){
        // Eğer driver nesnesi NULL değilse, yani hafızada varsa
        if (driver != null){
            driver.quit();  // driver'ı kapat
            driver = null;  // driver'ı hafızadan temizle.
        }
    }



}
