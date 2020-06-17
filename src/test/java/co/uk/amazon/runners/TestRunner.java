package co.uk.amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //now specify where the feature file is: (i.e.inside feature package)
         features = {"src/test/java/co/uk/amazon/features"},

         //we also specify the location of the step definition
        //we need Hook, to open and close browser, and we need step definitions
         glue = {"co/uk/amazon/hooks", "co/uk/amazon/stepDefinitions"},

        //at the beginning we took a particular report, we put the report in as plug in:
        plugin = {"pretty", "json:target/report.json", // pretty means human readable, saved
                                                        // in json format as: target/report.json


                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"} //we want the report to be
                                                                    // beautiful hence we ask monochromata to format it for us
                                                        // and save it on target as pretty-cucumber

)
public class TestRunner
{

}

/*
with test runner, we are able to specify the location of our feature file, hooks and step definitions files as
well as our report (plugin)
 */