package com.step;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseMethods_eg;
import com.pom.Ebay_POMpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebaystepdefination extends BaseMethods_eg {
	

@Given("user navitages to Ebay.com Webpage")
public void user_navitages_to_ebay_com_webpage() {
	getBrowser("Chrome");
	
	getUrl("https://www.ebay.com/");
   
}
@When("user search for an Electric guitar")
public void user_search_for_an_electric_guitar() {
	PageFactory.initElements(driver, Ebay_POMpage.class);

	inputValueElements(Ebay_POMpage.search, "electric guitar");
	
	clickOnElemenet(Ebay_POMpage.submit);
			
  
}
@Then("user need to validate the price of the elctric guitar and validate it")
public void user_need_to_validate_the_price_of_the_elctric_guitar_and_validate_it() {
    
	PageFactory.initElements(driver, Ebay_POMpage.class);
	clickOnElemenet(Ebay_POMpage.product);
	
	String mainwindow = getWindowId();
			
	Set<String> allwindows = getAllWindowID();
		
	for (String subwindow : allwindows) {
		
		if(!subwindow.equals(mainwindow)) {
			
			windowSwitch(subwindow);
			
}

	}
	

	String elementText = elementText(Ebay_POMpage.price);
	
	System.out.println(elementText);}

}
