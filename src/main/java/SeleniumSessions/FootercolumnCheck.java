package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FootercolumnCheck {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		Thread.sleep(5000);
		getFooterHeaderText("About Us");
		getFooterHeaderText("Careers");
		getFooterHeaderText("Gift Cards");
		getFooterHeaderText("Recycling");
		
		
	}
	
	public static void getFooterHeaderText(String footerText)
	{
		String footerlink=driver.findElement(By.xpath("//a[text()='"+footerText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
		System.out.println(footerlink);
		
		//a[text()='Amazon Science']/ancestor::ul/parent::div/div
		//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
		////a[text()='Amazon Science']/parent::li/parent::ul/parent::div/div
		//(//a[text()='Amazon Science']/ancestor::div)[5]/div -using capture grouping
		
		//using sibling
		//preceding sibling-//a[text()='Amazon Science']/ancestor::ul/preceding-sibling::div-getto know us
		//following sibling-
	}

}
