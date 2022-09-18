package runnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\alexandru.tanasa\\Heaven\\src\\Features\\TestHeaven.feature",
        glue = {"stepDefinitions"})

public class runnerTest
{ }
