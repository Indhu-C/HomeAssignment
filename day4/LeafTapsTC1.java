package week5.day4;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinitions.Common;

@CucumberOptions(features ={"src/test/resources/features"}, 
glue = {"stepDefinitions" ,"HooksImplementation"},
//glue = {"stepDefinitions"},
dryRun = false ,
monochrome = true,
tags =  "@functional",

publish = true)

public class LeafTapsTC1 extends AbstractTestNGCucumberTests {

}
