package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgElement {

	public static void main(String[] args) throws InterruptedException 
	{
				// TODO Auto-generated method stub
				//need to follow hierarchy to go back and forward frame navigation
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://petdiseasealerts.org/forecast-map");
				 Thread.sleep(5000);
				 
				 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
				 
				 
				 List<WebElement>statelist=driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
				 System.out.println(statelist.size());
				 Actions act=new Actions(driver);
				 for(WebElement e:statelist)
				 {
					 act.moveToElement(e).build().perform();
					 Thread.sleep(500);
					String text=e.getAttribute("name");
					System.out.println(text);
					if(text.equals("Maryland"))
					{
						e.click();
						break;
					}
				 }
				 

	}

}
