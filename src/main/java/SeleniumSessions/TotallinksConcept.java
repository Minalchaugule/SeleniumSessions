package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotallinksConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("http://amazon.co.uk");
		
		By links=By.tagName("a11");
		List <WebElement>linksList=driver.findElements(links);
		System.out.println(linksList);
		int linkCount=linksList.size();
		System.out.println("Count of links : "+linkCount);
	
//		for(int i=0;i<=linkCount-1;i++)
//		{
//			String text=linksList.get(i).getText();
//			if(!text.isEmpty())
//			{
//			System.out.println(i+ ":" +text);	
//			}
//		}
		
		//2.for each
		int count=0;
		for(WebElement e:linksList)
		{
		String text=e.getText();
		if(!text.isEmpty())
			{
			System.out.println(count+ ":" +text);
			}
		count++;
		}
	}

}
