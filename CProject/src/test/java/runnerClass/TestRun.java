package runnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		features = "src/test/resource/featurefiles/loginAutomation.feature",
		glue = "stepDefinitions"
				
		
		)
		
		
public class TestRun
{
	
		    		    		
}
