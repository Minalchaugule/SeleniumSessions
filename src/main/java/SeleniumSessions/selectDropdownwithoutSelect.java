package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdownwithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
   Thread.sleep(4000);
  By countryoptions=By.xpath("//select[@id='Form_getForm_Country']/option");
  doSelectDropdownValueUsingLocator(countryoptions,"China");

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doSelectDropdownValueUsingLocator(By locator,String valueText)
	{
		
		  List<WebElement>optionsList=driver.findElements(locator);
		  
		  for(WebElement e:optionsList)
		  {
			  String text=e.getText();
			  System.out.println(text);
			  if(text.contains(valueText))
			  {
				  e.click();
				  break;
	}

}}}

