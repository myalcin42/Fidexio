package com.fidexio.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json"
        },
        features= "src/test/resources/features",
        glue="com/fidexio/step_definitions",
        dryRun = false,
        tags=""

)
public class CukesRunner {


}
