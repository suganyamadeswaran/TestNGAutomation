package com.testNGAutomation.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInitializer {
	public static WebDriver driver;
	public WebDriverWait wait;
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/index.html");
		return driver;
		
	}
	public WebDriverWait initializeWait() {
		wait=new WebDriverWait(driver,20);
		return wait;
	}
	public void getScreenshot(String result) throws IOException {
		// TODO Auto-generated method stub
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("test-output/Screenshots/"+result+"screenshot.png"));
	}

}
