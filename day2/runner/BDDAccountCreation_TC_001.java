package runner;

import org.testng.annotations.DataProvider;

import base.ProjSpecMethod;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src/test/java/features"}, 
glue = {"pages" })

public class BDDAccountCreation_TC_001 extends ProjSpecMethod{
	@DataProvider(parallel = true)
    public Object[][] scenarios() {
		
		 return super.scenarios();
        
    }

}
