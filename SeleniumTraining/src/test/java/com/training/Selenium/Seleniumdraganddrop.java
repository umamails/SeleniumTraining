package com.training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumdraganddrop {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement imageframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(imageframe);
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		WebElement dragfrom=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement dragto=driver.findElement(By.id("trash"));
		action.dragAndDrop(dragfrom, dragto).build().perform();
	}

}
