import SakilaScam.SakilaScamApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SakilaScamApplication.class)
public class CucumberRun {
}