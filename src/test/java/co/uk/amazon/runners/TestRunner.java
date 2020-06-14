package co.uk.amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //now specify where the feature file is:
         features = {"src/test/java/co/uk/amazon/features"},

         //we also specify the location of the step definition
         glue = {"co/uk/amazon/hooks", "co/uk/amazon/stepDefinitions"},
        plugin = {"pretty", "json:target/report.json",
                "de.monochromate.cucumber.report.PrettyReports:target/pretty-cucumber"}

)
public class TestRunner
{

}
