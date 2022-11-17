package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseMethods_eg;
import com.pom.GmailPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailStep  extends BaseMethods_eg{

	WebDriver driver;
	
	@Given("user navigate to the Gmail login page")
	public void user_navigate_to_the_gmail_login_page() {
		
	    getBrowser("Chrome") ;
		
		
	    getUrl("https://accounts.google.com/v3/signin/challenge/pwd?TL=ADFpJfMAZiijoBvcqrahBpCXqSNKLogwXNTbdrGKPefHAUeq09T5lgsxDKQ7-dVx&checkConnection=youtube%3A144%3A0&checkedDomains=youtube&cid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S84819496%3A1668585497708594&flowEntry=ServiceLogin&flowName=GlifWebSignIn&ifkv=ARgdvAsjE8PiTZ320Mwd2J9mQPaJ0xVjaWIBFIqrUG6kl1ny2vcEsOvX6X6InLe9xmPuH92Eq2-7Ow&pstMsg=1&rip=1&service=mail");
	    		
		
		
	}
	@When("user enter valid login credentials the {string} and {string}")
	public void user_enter_valid_login_credentials_the_and(String username, String password) {
		
		
		PageFactory.initElements(driver, GmailPage.class);
		
		inputValueElements(GmailPage.username,username);
		
		clickOnElemenet(GmailPage.next);
		
		inputValueElements(GmailPage.pass,password);
		
		clickOnElemenet(GmailPage.next);
	}
	@Then("User should Verify the profile in top right corner")
	public void user_should_verify_the_profile_in_top_right_corner() {
		
		WebElement ac = GmailPage.account;
		
		String attribute = ac.getAttribute("aria-label");
		
		if(attribute.contains("maheshwaran0791@gmail.com")) {
			
			System.out.println("verified user");
		
		}else{
			
			System.out.println("unverified user");
			
		}
			
		
	}
}
