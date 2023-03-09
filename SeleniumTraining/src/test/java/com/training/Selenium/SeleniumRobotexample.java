package com.training.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRobotexample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.Selenium.dev/");
		Robot robot=new Robot();
		Thread.sleep(5000);
		robot.mouseMove(500, 150);
		//robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		//robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.mouseWheel(20);
		
		

	}

}
