package com.testNGAutomation.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.testNGAutomation.core.DriverInitializer;
import com.testNGAutomation.pages.LoginPage;

public class swagLabs extends DriverInitializer {
	private WebDriver driver;
	WebDriverWait wait;
	LoginPage login;

	@BeforeMethod
	public void getDriver() {
		driver = initializeDriver();
		wait = initializeWait();
	    login = new LoginPage(driver);
	}

	@Test (dataProvider ="getData")
	public void firstPage(String username, String password) throws InterruptedException {
		//LoginPage login = new LoginPage(driver);
		login.userename().sendKeys(username);
		login.password().sendKeys(password);
		login.submit().click();
		login.clickable().click();
		
	}
	
	@DataProvider
	public Object[][] getData()

	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][2];
		//0th row
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";

		//1st row
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		
		return data;
	}

	@AfterMethod
	public void endDriver() {
		driver.close();
	}

}
