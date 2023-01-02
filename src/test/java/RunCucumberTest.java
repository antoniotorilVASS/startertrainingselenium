import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"steps"},
        plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
        monochrome = true,
        tags = "@main"
)

public class RunCucumberTest {
}
