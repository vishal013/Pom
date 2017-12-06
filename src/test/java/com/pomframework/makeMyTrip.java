/**
 * 
 */
package com.pomframework;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author vishal.tiwari This class will store all the locators and Web elements
 * 
 */
public class makeMyTrip {

	WebDriver driver;

	By LogIn = By.xpath("//span[text()='log-in']");
	By Hit = By.xpath("//div[text()='Continue with Facebook']");
	By username = By.xpath("//input[@id='ch_login_email']");

	public makeMyTrip(WebDriver driver) {

		this.driver = driver;

	}

//	public void clickOnLogin() throws InterruptedException {
//
//		driver.findElement(LogIn).click();
//		Thread.sleep(8000);
//	}
//
//	public void continueAs() throws InterruptedException {
//
//		WebElement iframe = driver.findElement(By.cssSelector(".ch__loginSocialMedia>a:nth-child(1)>span:nth-child(1)>iframe"));
//		driver.switchTo().frame(iframe);
//		driver.findElement(Hit).click();
//	
//		String parentWindow = driver.getWindowHandle();
//		Set<String> handles =  driver.getWindowHandles();
//		   for(String windowHandle  : handles)
//		       {
//		       if(!windowHandle.equals(parentWindow))
//		          {
//		          driver.switchTo().window(windowHandle);
//	
//		          System.out.println("Title of Child window is :"+driver.getTitle());
//		         //driver.close(); //closing child window
//		         //driver.switchTo().window(parentWindow); //cntrl to parent window
//		          }
//		       }
//		   
//		driver.findElement(By.id("email")).sendKeys("9074156559");
//		Thread.sleep(4000);
//		driver.findElement(By.id("pass")).sendKeys("vishu@123");
//    	Thread.sleep(3000);
//    	driver.findElement(By.id("u_0_0")).click();
//    	Thread.sleep(3000);
//    	driver.switchTo().window(parentWindow);
//    	Thread.sleep(8000);
//    	
////    	Alert alert=driver.switchTo().alert(); 
////    	alert.getText();
////    	alert.accept();
////driver.findElement(By.xpath("//p[@class='append_bottom20']/a")).click();
//    	
//    	
//    	
//	}
//
//	public void username() {
//		driver.findElement(username).sendKeys("vishal");
//	
//	}

	
	public void fn1() throws InterruptedException{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollBy(0,450)", "");	
	
	System.out.println("This time is + Vishal");
	}
}
