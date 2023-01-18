package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how=How.NAME,using="user-name")
	public static WebElement UserName;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(id="login-button")
	public static WebElement Sumbit;

	//user name , password, login button

	/*
	 * public static WebElement UserName(WebDriver driver) { return
	 * driver.findElement(By.id("user-name"));
	 * 
	 * }
	 * 
	 * public static WebElement Password(WebDriver driver) { return
	 * driver.findElement(By.id("password"));
	 * 
	 * }
	 * 
	 * public static WebElement Sumbit(WebDriver driver) { return
	 * driver.findElement(By.id("login-button"));
	 * 
	 * }
	 */
}
