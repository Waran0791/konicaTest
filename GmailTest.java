package com.GmailRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/Gmail.feature" , glue= "com.step")

public class GmailTest {
	
	

}
