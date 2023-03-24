package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Uatlogin.feature",
		                    //"classpath:FeatureFiles/Hrmlogin.feature",
		                  // "classpath:FeatureFiles/Mentorshipform.feature"
						  },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber_html_report"})
//tags= {"@login","@one"})

public class Runner1 {
	
}