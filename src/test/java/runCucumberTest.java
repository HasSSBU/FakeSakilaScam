import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import sakila.scam.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
features ="src/test/resources/Cucumber",
glue = "")

public class runCucumberTest {

}
