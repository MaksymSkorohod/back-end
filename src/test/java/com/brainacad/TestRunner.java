package com.brainacad;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
 @CucumberOptions(
        features = "src/test/resources",
        glue = "com.brainacad.step_definitions"
        //tags = "@myTag"
)

public class TestRunner {
}
