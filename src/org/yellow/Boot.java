package org.yellow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Greens\\diver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		WebElement textuser = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		textuser.sendKeys("8778223529");
		
		
	}

}
