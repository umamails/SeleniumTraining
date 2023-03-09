package com.training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Seleniumday1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://selenium-prd.firebaseapp.com/home.html");
driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
driver.findElement(By.id("password_field")).sendKeys("admin123");
driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
	}

}
