package com.training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnmore {
WebElement driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement imazeframe=driver.findElement(By.id("//iframe[@id='marketing']"));
		Thread.sleep(5000);
		WebElement learnmore=driver.findElement(By.xpath("//span[contains(text(),'Start my free trial')]"));
	    learnmore.click();  	
	}

}
