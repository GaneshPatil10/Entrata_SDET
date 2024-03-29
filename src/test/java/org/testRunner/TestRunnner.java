package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resource/features",
		glue= {"org/stepDefinations","org/applicationHooks"},
		monochrome= true,
		dryRun= false,
		tags= "not @pause",
		plugin= {"pretty",
				"html:target/html_report/cucumber_report.html",
				"json:target/json_report/json_report.json",
				"junit:target/junit_report/junit_report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		}
		)

//To convert the framework into testNG then extend this abstract class and remove @RunWith annotation
public class TestRunnner { //extends AbstractTestNGCucumberTests {
 
}
