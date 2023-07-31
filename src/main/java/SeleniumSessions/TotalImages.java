package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.get("http://amazon.co.uk");
		
		By images=By.tagName("img");
//		List <WebElement>image =driver.findElements(images);
//		int imagesCount=image.size();
//		System.out.println("Count of images : "+imagesCount);
//	
//		for(WebElement e:image)
//		{
//			String srcValue=e.getAttribute("src");
//			String altValue=e.getAttribute("alt");
//		  System.out.println(srcValue +" "+altValue);
//	    }
		//getElementsAttributes(images,"src");
		getElementsAttributes(images,"alt");
		int imageCount=getTotalCountofimages(images);
		System.out.println(imageCount);
		
		

}
	
	public static int getTotalCountofimages(By locator)
	{
		return getElements(locator).size();
		
	}
	
	
	public static void getElementsAttributes(By locator,String attriValue)
	{
		List<WebElement> imageList=getElements(locator);
	  
		for(WebElement e:imageList)
		{
		String srcValue=e.getAttribute(attriValue);
		if(!srcValue.isEmpty())
		{
		if(srcValue.contains("Wireless"));{
			System.out.println(srcValue);
		}
		
		}
	}
		
		}
	

	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
}