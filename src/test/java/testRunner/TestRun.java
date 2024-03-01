package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//FeatureFiles/" }, 
        glue = "stepDefinitions", 
        plugin = { "pretty",
		"html:reports/Cucumber_report.html", "rerun:target/rerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
        dryRun=false,
        publish=true,
//		tags="@sanity and not @regression" ,
		monochrome=true)
public class TestRun

{

}
