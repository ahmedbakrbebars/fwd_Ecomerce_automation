package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"stepDefinations"},


        plugin = {
                "pretty",
                "html:target/cucumberReports/cucumber-pretty.html",
                "json:target/cucumberReports/cucumber-TestReport.json",
                "rerun:target/cucumberReports/rerun.txt",
                "junit:target/cucumberReports/cukes.xml",
        },
       dryRun = false,
        tags = "@Runner")
public class testRunner {

}
