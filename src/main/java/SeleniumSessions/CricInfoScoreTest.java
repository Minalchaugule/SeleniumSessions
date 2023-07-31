package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		 driver.get("https://www.espncricinfo.com/series/icc-world-test-championship-2021-2023-1268315/australia-vs-india-final-1358412/full-scorecard");
		 Thread.sleep(5000);
		 System.out.println(wicketTakerName("Travis Head"));
		 System.out.println(wicketTakerName("David Warner"));
		
		 getScoreCardDetails("Steven Smith");
		
	}
	
	public static String wicketTakerName(String BatsmanName)
	
	{
		System.out.println(BatsmanName);
		return driver.findElement(By.xpath("//span[text()='"+BatsmanName+"']//ancestor::td/following-sibling::td//span/span")).getText();
	}
	
	public static void getScoreCardDetails(String BatsmanName)
	{
		List <WebElement> scorecardList=driver.findElements(By.xpath("//span[text()='"+BatsmanName+"']//ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		ArrayList <String> scoreoptions=new ArrayList<String>();
		for(WebElement e :scorecardList)
		{
			String text=e.getText();
			scoreoptions.add(text);
		}
		System.out.println(scoreoptions);
	}
	}


