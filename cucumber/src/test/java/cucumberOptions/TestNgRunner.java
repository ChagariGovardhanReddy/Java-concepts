package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Undefined step Exception
//tags="@SmokeTest and @RegressionTest"
//tags="@SmokeTest or @RegressionTest"
//tags="not @RegressionTest"
@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",monochrome=true,tags="@SmokeTest or @RegressionTest")
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
