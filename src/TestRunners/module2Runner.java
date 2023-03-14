package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features/module2"
		,glue={"stepDefinitions"},
        plugin = {
                "html:reporting/CucumberHTMLReports/Sanity"     
        },
        tags = {"@smoke or @regression"}
		)

public class module2Runner {

}

//two tag- smoke , regression
//smoke
//run both the tag
//run only smoke not regression
//run smoke or regression

