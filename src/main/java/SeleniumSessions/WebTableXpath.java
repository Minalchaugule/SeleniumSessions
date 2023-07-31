package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableXpath {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']-using grandparent relation
		
		clickoncheckboxWebTable("Jasmine.Morgan");
		clickoncheckboxWebTable("John.Smith");
		
		//capturing other data in the webtable
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		System.out.println(getTextWebTable("John.Smith"));
		System.out.println(getTextWebTable("Jasmine.Morgan"));

	}
	
	
	public static void clickoncheckboxWebTable(String empName)
	{
		driver.findElement(By.xpath("//a[text()='"+empName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();	
	}
	
	public static ArrayList<String> getTextWebTable(String empName)
			{
		List<WebElement>empInfoList=driver.findElements(By.xpath("//a[text()='"+empName+"']/parent::td/following-sibling::td"));
	
//		for(int i=0;i<=empInfoList.size()-1;i++)
//		{
//			System.out.println(empInfoList.get(i).getText());
//		}
		ArrayList <String> eList=new ArrayList<String>();
		for(WebElement e:empInfoList)
		{
			String text=e.getText();
			eList.add(text);
		}
		return eList;
			}

}
