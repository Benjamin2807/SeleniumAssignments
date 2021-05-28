package serviceNowRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(dryRun = false, 
                 features= {"src/test/java/serviceNowFeature"}, 
                 glue= {"stepDefsServiceNow","serviceNowHooks"}, 
                 monochrome=true)

public class ServiceNowrunner extends AbstractTestNGCucumberTests{

	
	
	
	
	
	
	
	
	
}
