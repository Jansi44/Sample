package PageFactory_WithoutAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginWithoutFindBy {

	public WebElement txtUsername;
	public WebElement txtPassword;
	public WebElement btnLogin;
	//We can directly declaring the id or name of an element as webelement variable
	//then we need to give Initelements- there afer operations it will work without findby annotation
	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		txtUsername.sendKeys("standard_user");
		txtPassword.sendKeys("secret_sauce");
		btnLogin.click();
		
		
	}
	
}
