package com.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/Login.feature",
				 tags ={"@tag2"},
						 glue={"com.test.glue.login"}
		
		)

public class TestRunner {

}
