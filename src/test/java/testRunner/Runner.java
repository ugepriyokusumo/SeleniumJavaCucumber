package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"step_definitions", "hooks"},
//        dryRun = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

//        plugin = {"pretty", "html:reports/result.html",
//                "json:reports/result.json",
//                "junit:reports/result.xml"
//        }
)
public class Runner extends AbstractTestNGCucumberTests {

}
