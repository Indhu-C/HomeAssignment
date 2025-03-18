package runnerTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src/test/resources/features/LoginPage.feature"},glue = {"stepDefinitions"},dryRun = false ,monochrome = false, publish = true)
public class LeafTapsTC1 extends AbstractTestNGCucumberTests {

}
