package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // there our features stores
        glue = "io/loop/step_definitions" , // where out step definiftions code stored
        dryRun = false , // used if we want to generate code snippets or not , we do true if we do not want to run the code but take a snippet
                        // allow to figure out which step definitions still need implemetations. 3 features file and each has 10 tests. Is there step definitions for out test? (if that is true)
                        // it will check out feature class where we have out all scenrios, it will

        // it will take screenh - default
        // the reason why you need it where as a reminder. false is a default
        tags = "@smoke" ,
        monochrome = true

        // when dry run is true - its not running code just generating snippets
        // when dry run is false - runs the code

)

public class CukesRunner {
}
