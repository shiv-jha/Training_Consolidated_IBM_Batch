package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features/module1"
		,glue={"stepDefinitions"},
        plugin = {
                "html:reporting/CucumberHTMLReports/Sanity"     
        },
        tags = {"@smoke or @regression"}
		)

public class module1Runner {

}

