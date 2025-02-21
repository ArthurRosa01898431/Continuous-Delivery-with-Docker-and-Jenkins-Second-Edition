 package acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/** Acceptance Test making changes */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:acceptance")
public class AcceptanceTest { }