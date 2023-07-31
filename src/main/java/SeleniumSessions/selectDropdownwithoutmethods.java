package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdownwithoutmethods {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
  By country=By.name("Country");
  
  doSelectDropdownValue(country,"China");
	}

	
	
	public static void doSelectDropdownValue(By locator,String valueText)
	{
		Select sel=new Select(driver.findElement(locator));
		  List<WebElement>optionsList=sel.getOptions();
		  
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