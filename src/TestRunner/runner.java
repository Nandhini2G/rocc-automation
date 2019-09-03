package TestRunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)



@CucumberOptions(features="features",tags= {"@SanityTC_1,@SanityTC_2,@SanityTC_9,@SanityTC_3"},glue= {"stepdefinition"},plugin={"pretty",
"html:target/cucumber-reports/cucumber-pretty",
"json:target/cucumber-reports/CucumberTestReport.json",
"rerun:target/cucumber-reports/re-run.txt","junit:target/cucumber-reports/Cucumber.xml"},monochrome=true)
public class runner
{
	
}