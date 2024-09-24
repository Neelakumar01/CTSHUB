package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageScript {
	@FindBy(xpath="//span[text()='Sign in']")
	public static WebElement ClickOnLogin;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement UserNameField;
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement passwordField;
	

}
