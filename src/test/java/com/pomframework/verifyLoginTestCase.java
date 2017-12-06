/**
 * 
 */
package com.pomframework;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author vishal.tiwari
 *
 */

@Test
public class verifyLoginTestCase {

	WebDriver driver;

	
	
	
	public void mmtURL() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver","C:\\pom\\Workspace\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
//		driver.get("http://toolsqa.com/");
//		toolsqa ttqa=new toolsqa(driver);
//		ttqa.fn();
		
		makeMyTrip mmT=new makeMyTrip(driver);
		mmT.fn1();
//		mmT.clickOnLogin();
//		mmT.continueAs();
		
		//mmT.username();
        
		driver.close();	
		
	}

	
	
}
