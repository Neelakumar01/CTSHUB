package Testcase;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testScripts.LoginPageScript;

public class Login extends BaseClass {
	
  @Test
  public void LoginMethod() throws InterruptedException {
	  
	  PageFactory.initElements(driver,LoginPageScript.class);
	  LoginPageScript.UserNameField.sendKeys("admin3@gmail.com");
	  LoginPageScript.passwordField.sendKeys("test@123");
	  Thread.sleep(3000);   
	  LoginPageScript.ClickOnLogin.click();   
	  }
}
