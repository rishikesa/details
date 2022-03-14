package org.red;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Greens\\diver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();	
	
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	WebElement textbox = driver.findElement(By.id("location"));
	textbox.sendKeys("salem");
	
	
	
	
}
}
