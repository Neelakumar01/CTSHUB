package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Testcase.BaseClass;

public class PoScriptsCts extends BaseClass{

	@FindBy(xpath="//div[text()='Create Sale Order']")
	public static WebElement ClickOnPoOption;
	
	@FindBy(xpath="(//div[contains(text(),'Select Customer ID/Phone Number/Name')]//parent::* )[1]")
	public static WebElement CustomerSerchField;

	  public static void searchCustomer () throws InterruptedException {
		  
		     long phonenumber = 4169065013l;
		     String phoneString = Long.toString(phonenumber);
		     
		  // Formatting the number as XXX-XXX-XXXX
		        String formattedNumber = phoneString.substring(0, 3) + "-" +
		        		                 phoneString.substring(3, 6) + "-" +
		        		                 phoneString.substring(6);
		     WebElement CustomerSearch= driver.findElement(By.xpath("//input[@name='search']"));
		     CustomerSearch.sendKeys(phoneString);
		     Thread.sleep(3000);
		     WebElement getName = driver.findElement(By.xpath("(//div[@class='mantine-Text-root mantine-occhct'])[10]"));
		            String phone = getName.getText();
		     
		     if(formattedNumber.equalsIgnoreCase(phone)) {
		     WebElement  SelectCustomer=driver.findElement(By.xpath("//span[text()='Assign']"));
		     SelectCustomer.click();
		     }
		     else {
		    	 System.out.println("Check your number");
		     }
	  }
	  
	  
	  public static void searchProduct() throws InterruptedException {
		  
		      String Product ="SBG1000";
		      WebElement productSearch = driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]"));
		      Thread.sleep(3000);
		      productSearch.sendKeys(Product);
	  }
	  
	 public static void clickPO(){	
		 Actions action = new Actions(driver);
	     WebElement we = driver.findElement(By.xpath("//span[text()='Create Order']"));
	    action.moveToElement(we).click().build().perform();
	  
	  }
	  
}


