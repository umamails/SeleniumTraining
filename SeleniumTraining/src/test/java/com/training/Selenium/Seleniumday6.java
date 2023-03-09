package com.training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumday6 {
	static WebDriver driver;

	public static void main(String[] args) {
		login();
		Interactions();
	//	doubleclick();
		tooltip();
		
	}

		public static void login(){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://Selenium-prd.firebaseapp.com/");
			driver.manage().window().maximize();
			WebElement email=driver.findElement(By.id("email_field"));
			waitforvisibility(10,email);
			email.sendKeys("admin123@gmail.com");
			WebElement password=driver.findElement(By.cssSelector("#password_field"));
			password.sendKeys("admin123");
			WebElement login=driver.findElement(By.xpath("//button[text()='Login to Account']"));
			login.click();
		}
		public static void Interactions() {
			WebElement interactions=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
			waitforvisibility(10, interactions);
			interactions.click();
		}
		public static void doubleclick() {
			WebElement doubleclick=driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"));
			doubleclick.click();
			WebElement buttondoubleclick=driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
			Actions actions=new Actions(driver);
			actions.doubleClick(buttondoubleclick).build().perform();
		}

		private static void waitforvisibility(int time, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
			
		}
		private static void tooltip() {
			// ToolTip
		WebElement tooltip=driver.findElement(By.xpath("//a[text()='Tool Tip']"));
		tooltip.click();
		WebElement right=driver.findElement(By.className("tooltipr"));
		Actions actions=new Actions(driver);
		actions.moveToElement(right).build().perform();
		WebElement txtright=driver.findElement(By.className("tooltiptextr"));
		String ExpToolTipRight="Right";
		String ActualValue=txtright.getText();
		//Assert.assertEquals(ActualValue, ExpToolTipRight);
		}
	// if want to make private
		
	//	private static void compareText(String ActualValue,String ExpectedValue) {
		//	Assert.assertEquals(ActualValue, ExpectedValue);
		}

	


