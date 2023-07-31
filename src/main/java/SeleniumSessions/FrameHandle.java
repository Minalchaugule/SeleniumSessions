package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		 Thread.sleep(2000);
		 //frame can be find by using index /name or id/webElement
		 //driver.switchTo().frame(2);
		 //driver.switchTo().frame("main");
		 WebElement ele=driver.findElement(By.xpath("//frame[@src='top.html']"));
		 driver.switchTo().frame(ele);
	
		String text= driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
