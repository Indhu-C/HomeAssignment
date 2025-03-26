package runner;

import org.testng.annotations.DataProvider;

import base.ProjSpecMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src/test/java/features"}, 
glue = {"pages" })
//glue = {"stepDefinitions"},
//dryRun = false ,
//monochrome = true,
//tags =  "@functional",
//
//publish = true)
public class BDDLoginTC_001 extends ProjSpecMethod{
	@DataProvider(parallel = true)
    public Object[][] scenarios() {
		
		 return super.scenarios();
        
    }

}
