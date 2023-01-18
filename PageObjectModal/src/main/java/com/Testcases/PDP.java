package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObjects.LoginPageObjects;
import com.PageObjects.PDPPageObject;

public class PDP {
	
	
	@Test
	public void Login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//Login
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.UserName.sendKeys("standard_user");
		LoginPageObjects.Password.sendKeys("secret_sauce");
		LoginPageObjects.Sumbit.click();
		//PDP
		PageFactory.initElements(driver, PDPPageObject.class);
		
		PDPPageObject.product.click();
		PDPPageObject.addToCart.click();
		driver.quit();
	
		
		
	}

}
