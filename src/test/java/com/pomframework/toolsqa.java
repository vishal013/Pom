package com.pomframework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class toolsqa{
WebDriver driver;

public toolsqa(WebDriver driver) {

	this.driver = driver;

}
public void fn(){

	// driver.findElement(By.xpath("//ul[@id='primary-menu']/li[2]/a/span/span/span")).isDisplayed();
	 driver.findElement(By.xpath(".//header/nav/ul/li[2]/a/span[1]/span/span")).click();
}
	
	
}