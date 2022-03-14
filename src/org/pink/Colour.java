package org.pink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Greens\\diver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().window().maximize();
		WebElement textname = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]"));
		textname.sendKeys("rishikeshan");
		WebElement textpass = driver.findElement(By.name("password"));
	textpass.sendKeys("rishi2793");
	
	

	}

}
