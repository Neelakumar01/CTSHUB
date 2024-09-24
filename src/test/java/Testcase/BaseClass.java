package Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	protected static  String browser ="chrome";
	protected static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException 
	{
		BaseClass setup =new BaseClass();
		setup.set();
		
	}
	 @BeforeSuite
		public void  set() {
		 if(browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("firefox")) {
			 driver =new FirefoxDriver();
		 }
		 else {
			 System.out.println("only choose Chrome & fireFox");
		 }
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      String websiteUrl="https://new-hub-frontend.stagingurl.tk";
	      String Url="https://new-hub-frontend.stagingurl.tk";
	      
	      if(Url.equalsIgnoreCase(websiteUrl)) {
	          driver.get(websiteUrl);  
	      }
	      else {
	    	   String currenrUrl = driver.getCurrentUrl();
	    	  System.out.println("Please check URL "+currenrUrl);
	      }
	      
	      
	}
	 
}
