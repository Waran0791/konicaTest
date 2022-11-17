package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class BaseMethods_eg {
	

	public static WebDriver getBrowser(String type) {
		
		if(type.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91637\\eclipse-workspace\\MyStore\\ChromeDriver\\chromedriver.exe" );
			
				driver = new ChromeDriver();
		}
		return driver; //null
		
		
	}
	
	public static WebDriver driver;
	public  static void inputValueElements(WebElement element, String name) {
		
		element.sendKeys(name);
	}
	
	public static void clickOnElemenet(WebElement element) {
		
		element.click();
	}
		
	public static  void getUrl(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public static void atrributevalue(WebElement element,String type) {
		
		element.getAttribute(type);
		
		
	}
	}


	
	

	
