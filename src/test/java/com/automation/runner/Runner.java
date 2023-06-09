package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/ScenarioA.feature",
							"classpath:FeatureFiles/ScenarioB.feature"
						  },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber_html_report"})

public class Runner {
	
}