package org.white;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WhiteBlack {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Greens\\diver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtfirstname.sendKeys("RISHIKESHAN");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys("SELVARAJU");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[contains(@rows,'3')]"));
		txtAddress.sendKeys("SALEM");
		WebElement txtemail = driver.findElement(By.xpath("//input[contains(@ng-model,'EmailAdress')]"));
			txtemail.sendKeys("rishikeshank@gmail.com");
		
			WebElement phone = driver.findElement(By.xpath("//input[contains(@type,'tel')]"));
			phone.sendKeys("8778223529");
		
			WebElement gender = driver.findElement(By.xpath("//input[contains(@name,'radiooptions')]"));
			gender.click();
			WebElement texthobby = driver.findElement(By.id("checkbox2"));
	        texthobby.click() ;
	        WebElement textlan = driver.findElement(By.xpath("//div[@id='msdd']"));
	        textlan.click();
	        Actions actions =new Actions(driver);
	        
	   WebElement textbox = driver.findElement(By.xpath("//body[contains(@style,'padding: 0px;')]"));
	   actions.moveToElement(textbox).perform();
	   textbox.click();
	  
	
			
			
			
			
	        
	        
	
	}
	
	
	

}
