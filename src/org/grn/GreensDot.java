package org.grn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensDot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Greens\\diver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();	
	driver.get("https://netbanking.hdfcbank.com/ ");
	WebElement textbox = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
	
	textbox.sendKeys("rishikeshan");
	
	}

}
