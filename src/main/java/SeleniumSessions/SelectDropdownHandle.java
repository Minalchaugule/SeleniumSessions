package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
  By country=By.name("Country");
//   WebElement country_ele=driver.findElement(country);
//   Select sel=new Select(country_ele);
////   sel.selectByIndex(4); //fixed dropdowns -like country ,month 
////   sel.selectByVisibleText("India");
//   sel.selectByValue("Guinea");
   doSelectDropdownbyIndex(country,4);
   doSelectDropdownbyVisibleText(country,"India");
   doSelectDropdownbyValue(country,"Guinea");
   
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownbyIndex(By locator,int index) {
		
		if(index<0)
		{
			System.out.println("Pls pass right index");
			return;
		}
		Select sel=new Select(getElement(locator));
		sel.selectByIndex(index);
	}
	
public static void doSelectDropdownbyVisibleText(By locator,String visibleText) {
		
		if(visibleText==null)
		{
			System.out.println("Pls pass correct text");
			return;
		}
		Select sel=new Select(getElement(locator));
		sel.selectByVisibleText(visibleText);
	}

public static void doSelectDropdownbyValue(By locator,String value) {
	
	if(value==null)
	{
		System.out.println("Pls pass correct value");
		return;
	}
	Select sel=new Select(getElement(locator));
	sel.selectByVisibleText(value);
}

}
