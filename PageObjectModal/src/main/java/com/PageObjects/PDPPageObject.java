package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PDPPageObject {
	
	@FindBy(id="item_4_title_link")
	public static WebElement product;
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public static WebElement addToCart;
		
	}
	
	/*
	 * public static WebElement product(WebDriver driver) { return
	 * driver.findElement(By.id("item_4_title_link")); }
	 * 
	 * public static WebElement addToCart(WebDriver driver) { return
	 * driver.findElement(By.id("add-to-cart-sauce-labs-backpack")); }
	 */


