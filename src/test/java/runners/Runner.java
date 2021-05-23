package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions", // test adımlarının bulunduğu klasör
        tags = "@amazonarama",
        dryRun = false // true ise sadece eksik olan methodları söyle
                      // false ise direk teste başla
)


public class Runner {

}
