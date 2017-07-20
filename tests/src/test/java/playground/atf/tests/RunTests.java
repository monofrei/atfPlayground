package playground.atf.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import playground.atf.tests.uiTests.CustomCucumberRunner;

/**
 * Created by cpascal on 3/27/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"playground"},
        features ={"src/test/resources/"},
       format = {"json:target/cucumber.json"}

)//

public class RunTests {
}
