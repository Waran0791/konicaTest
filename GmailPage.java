package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage {

	@FindBy(id = "identifierId")
	public static WebElement username;
	
	@FindBy(xpath = "//span[text()='Next']")
	public static WebElement next;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement pass;
	
	@FindBy(xpath = "//a[contains(@aria-label,'Google Account')]")
	public static WebElement account;
	
}
