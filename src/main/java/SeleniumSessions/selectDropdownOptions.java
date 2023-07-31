package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdownOptions {
	

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
  By country=By.name("Country");
  if(selectDropdownOptions(country).contains("India"))
  {
	  System.out.println("Pass");
  }
  
  List <String> expCountryOptionList=Arrays.asList("India","China","Brazil");
  if(selectDropdownOptions(country).contains(expCountryOptionList))
  {
	  System.out.println("Expected List is available"+expCountryOptionList);
  }
 
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static int getDropdownOptionsCount(By locator)
	{
		Select sel=new Select(getElement(locator));
		return sel.getOptions().size();
	}
	
	public static ArrayList<String> selectDropdownOptions(By locator)
	{
		Select sel=new Select(getElement(locator));
		  List <WebElement>OptionsList=sel.getOptions();
		  ArrayList<String> optList=new ArrayList<String>();
		  System.out.println(OptionsList.size());
		  
		  for(WebElement e:OptionsList)
			  
		  {
			 
			  String text=e.getText();
			  System.out.println(text);
			  optList.add(text);
			  
		  }
		  return optList;
	}

}
