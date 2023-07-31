import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class svgflipkartSearch {

	public static void main(String[] args) throws InterruptedException 
	{
				// TODO Auto-generated method stub
				//need to follow hierarchy to go back and forward frame navigation
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://flipkart.com");
				 Thread.sleep(2000);
				 
				String searchbox="//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']";
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript(searchbox);
				
	}

}
