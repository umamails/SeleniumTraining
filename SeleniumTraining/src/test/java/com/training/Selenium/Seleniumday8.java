package com.training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumday8 {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		login();
		Thread.sleep(3000);
	calculator();

	}

	

	private static void login() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email_field"));
		waitforVisibility(10,email);
		email.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.cssSelector("#password_field"));
		password.sendKeys("admin123");
		
	
		WebElement login = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();
	}
	

	//a[contains(text(),'Calculator')]
	private static void calculator() throws InterruptedException {
		WebElement calc=driver.findElement(By.xpath("//a[contains(text(),'Calculator')]"));
		calc.click();
		WebElement seven=driver.findElement(By.xpath("//input[@value='7']"));
		seven.click();
		WebElement plus=driver.findElement(By.xpath("//input[@value='+']"));
		plus.click();
		WebElement three=driver.findElement(By.xpath("//input[@value='3']"));
		three.click();	
		WebElement equals=driver.findElement(By.xpath("//input[@value='=']"));
		equals.click();
		Thread.sleep(3000);
		WebElement display=driver.findElement(By.id("display"));
		System.out.println("displayvalue" +display.getAttribute("value"));
		String expectedvalue="10";
		String Actualvalue=display.getAttribute("value");
		Assert.assertEquals(Actualvalue,expectedvalue);
		
		
	}
	private static void waitforVisibility(int time, WebElement element) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element)); 
	}

	}


