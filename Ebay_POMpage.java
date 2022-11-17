package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ebay_POMpage {
	

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement search;
	
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement submit;
	
	@FindBy(xpath ="(//span[@role='heading'])[2]")
	public static WebElement product;
	
	@FindBy(xpath = "//span[@itemprop='price']")
	public static WebElement price;

}
