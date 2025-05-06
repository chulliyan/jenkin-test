package com.sadevops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC_Login {
	
	@Test
	public void login_Test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
////		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//
//		
//		Assert.assertEquals(driver.getTitle(), "OrangeHRM");https://rahulshettyacademy.com/client/
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("chulliyanshinoj@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Pattiam@123");
		driver.findElement(By.id("login")).click();
		Assert.assertEquals(driver.getTitle(), "Let's Shop");
		driver.close();
	}
	

}
