package Runner;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/CreateUser.feature",

        }
)
public class Runner {
}
//src/test/resources/CreateUser.feature
//mvn serenity:aggregate
