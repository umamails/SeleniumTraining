package com.training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumday4 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login();
		Thread.sleep(5000);
		switchToTab();
		clickonAlert();
		clickwindowAlert();
		clickonPromptAlert();
	}

	private static void login() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://Selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();

	}

	private static void switchToTab() {
		WebElement switchToTab = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action = new Actions(driver);
		action.moveToElement(switchToTab).build().perform();

	}

	private static void clickonAlert() {
		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert']"));
		alert.click();

	}

	private static void clickwindowAlert() throws InterruptedException {
		WebElement windowAlert = driver.findElement(By.xpath("//button[text()='Window Alert']"));
		windowAlert.click();
		Thread.sleep(5000);
		String alerttext = driver.switchTo().alert().getText();
		System.out.println("Alert Text: " + alerttext);
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

	}

	private static void clickonPromptAlert() throws InterruptedException {
		WebElement promtAlert = driver.findElement(By.xpath("//button[text()='Promt Alert']"));
		promtAlert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Uma");
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		String alertinfo = driver.findElement(By.id("Selenium")).getText();
		System.out.println(alertinfo);

	}

}
