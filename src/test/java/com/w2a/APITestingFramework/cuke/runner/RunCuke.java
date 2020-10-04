package com.w2a.APITestingFramework.cuke.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features= {"src/test/resources/features"},plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ,
                glue="com.w2a.APITestingFramework.cuke.steps")
public class RunCuke extends AbstractTestNGCucumberTests{

	
	
	
	
}
