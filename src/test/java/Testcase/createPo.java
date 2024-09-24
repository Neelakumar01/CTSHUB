
package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testScripts.PoScriptsCts;


public class createPo extends BaseClass {
  @Test
  public void createPoMethod() throws InterruptedException {
	  PageFactory.initElements(driver,PoScriptsCts.class);
	  PoScriptsCts.ClickOnPoOption.click();
      PoScriptsCts.CustomerSerchField.click();
      Thread.sleep(3000);
      PoScriptsCts.searchCustomer();
      PoScriptsCts.searchProduct();
      PoScriptsCts.clickPO();
      System.out.println("hi");
  }
}
