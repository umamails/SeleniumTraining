package com.training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumday3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://Selenium-prd.firebaseapp.com/home.html");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println("Title of the page: "+title);
	String expectedvalue="Selenium";
	String title1=driver.getTitle();
	if(expectedvalue.equals(title1)) {
		System.out.println("test case passed");
	}else {
		System.out.println("test case failed");
	}driver.getTitle();
	
	
	WebElement email=driver.findElement(By.id("email_field"));
	email.sendKeys("admin123@gmail.com");
	WebElement password=driver.findElement(By.id("password_field"));
	password.sendKeys("admin123");
	WebElement login=driver.findElement(By.xpath("//button[text()='Login to Account']"));
	login.click();
	Thread.sleep(5000);
	WebElement name=driver.findElement(By.id("name"));
	name.sendKeys("Uma");
	WebElement fathername=driver.findElement(By.id("lname"));
	fathername.sendKeys("Dharmalingam");
	WebElement postaladdress=driver.findElement(By.id("postaladdress"));
	postaladdress.sendKeys("90 lakeview apartment,ct");
	WebElement personaladdress=driver.findElement(By.id("personaladdress"));
	personaladdress.sendKeys("90 lakeview apartment,ct");
	WebElement femaleRadio=driver.findElement(By.xpath("//input[@value='female']"));
	femaleRadio.click();
//find element of the dropdown
	WebElement citydropdown=driver.findElement(By.id("city"));
	//create an object of Select class-dropdown webElement.
	Select city=new Select(citydropdown);
	city.selectByVisibleText("GOA");
	//using selectByValue
	WebElement coursedropdown=driver.findElement(By.id("course"));
	Select course=new Select(coursedropdown);
	//course.selectByValue("mca");
	//by SelectByIndex
	course.selectByIndex(4);
	WebElement districtdropdown=driver.findElement(By.id("district"));
	Select district=new Select(districtdropdown);
	district.selectByValue("newdelhi");
	WebElement statedropdown=driver.findElement(By.id("state"));
	Select state=new Select(statedropdown);
	state.selectByValue("mba");
	WebElement pincode=driver.findElement(By.id("pincode"));
	pincode.sendKeys("635851");
	WebElement enteremailid=driver.findElement(By.id("emailid"));
	enteremailid.sendKeys("Umamails@gmail.com");
	WebElement submit=driver.findElement(By.className("bootbutton"));
	submit.click();
	}

}
