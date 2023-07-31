package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advtisingPopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.rightmove.co.uk/property-to-rent/search.html?searchLocation=HA5&useLocationIdentifier=false&locationIdentifier=&rent=To+rent");
		//page content
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		WebElement adpopup=driver.findElement(By.xpath("//iframe[@id='local-homepages-iframe']"));
		driver.switchTo().frame(adpopup);
		Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Robert Cooper']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Buy")).click();

	}

}
