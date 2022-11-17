package com.GmailRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/EbayFeature.feature" , glue= "com.step",
monochrome=true)

public class EBayTest {
	
	

}
