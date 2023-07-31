package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By links=By.tagName("a");
		By images=By.tagName("img");
		
//		List <WebElement>linksList=driver.findElements(links);
//		List <WebElement>imagesList=driver.findElements(images);
//		System.out.println(getElements(links));
//		System.out.println(getTotalCountofElements(links));
		List<String> actEleTextList=getElementsTextList(links);
		System.out.println(actEleTextList);
		if(actEleTextList.contains("Privacy Policy"))
		{
			System.out.println("Privacy Ploicy--->PASS");
		}
		
		if(actEleTextList.contains("Terms & Conditions"))
		{
			System.out.println("Terms & Conditions--->PASS");
		}
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static int getTotalCountofElements(By locator)
	{
		return getElements(locator).size();
		
	}
	
	
	
	public static List<String> getElementsTextList(By locator)
	{
		List<WebElement> eleList=getElements(locator);
		List<String> eleTextList=new ArrayList<String>();
		for(WebElement e:eleList)
		{
		String text=e.getText();
		if(!text.isEmpty())
			{
			eleTextList.add(text);
			}
		}
		return eleTextList;
			
	}

}
