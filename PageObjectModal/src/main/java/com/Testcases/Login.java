package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObjects.LoginPageObjects;

public class Login {


	@Test
	public void Login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, LoginPageObjects.class);
		//Login
		LoginPageObjects.UserName.sendKeys("standard_user");
		LoginPageObjects.Password.sendKeys("secret_sauce");
		LoginPageObjects.Sumbit.click();
		
		
		
		/*
		 * LoginPageObjects.UserName(driver).sendKeys("standard_user");
		 * LoginPageObjects.Password(driver).sendKeys("secret_sauce");
		 * LoginPageObjects.Sumbit(driver).click();
		 */

	}

}
