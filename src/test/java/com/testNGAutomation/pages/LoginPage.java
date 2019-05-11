package com.testNGAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.id("user-name");
	public WebElement userename()
	{
		return driver.findElement(username);
	}
	By password = By.id("password");
	public WebElement password()
	{
		return driver.findElement(password);
	}
	By submit = By.xpath("//*[@type='submit']");
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	By clickable = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	public WebElement clickable()
	{
		return driver.findElement(clickable);
	}
}
