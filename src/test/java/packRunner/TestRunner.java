package packRunner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },features = { "Features" },
        glue = { "stepDefinition" },
        strict = false
        )
public class TestRunner 
{   

	@SuppressWarnings("deprecation")
	public static void afterScenario() throws Exception 
	{
		CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory("target");
		results.setOutputName("cucumber-results");
		results.setSourceFile("./target/cucumber.json");
		results.executeFeaturesOverviewReport();
	}

}