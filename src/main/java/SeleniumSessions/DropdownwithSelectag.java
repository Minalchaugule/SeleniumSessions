package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithSelectag {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://demoqa.com/select-menu");
   driver.findElement(By.xpath("//div[text()='Select Option']")).click();
   Thread.sleep(2000);
   List <WebElement> ddlist=driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
   System.out.println(ddlist.size());
   for(WebElement e:ddlist )
   {
	   String text=e.getText();
	   System.out.println(text);
	   if(text.contains("Group 1, option 2"))
	   {
		   e.click();
		   break;
	   }
   }

	}

}
