package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 Thread.sleep(2000);
		 //manual steps-launch url ,click on form and inspect and click then img wil converted into frame then switch to frame and perform
		driver.findElement(By.xpath("//img[@alt='Vehicle Registration Form']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Mrs");
		Boolean flag=driver.findElement(By.id("RESULT_TextField-2")).isEnabled();
		System.out.println(flag);
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("London");
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("30-06-2023");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("This is description");
		
		driver.findElement(By.id("RESULT_FileUpload-6")).sendKeys("C:\\Users\\sandy\\OneDrive\\Desktop\\AutoIT File Upload\\TestUpload.txt");
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Minal");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Chaugule");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Love Lane");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("London");
		WebElement dd=driver.findElement(By.id("RESULT_RadioButton-13"));
		Select sel= new Select(dd);
		sel.selectByVisibleText("California");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("HA5 3LZ");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("07570728879");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("minal.chaugule88@gmail.com");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		String tooltipmsg=driver.findElement(By.xpath("//p[@id='tooltip']")).getText();
		System.out.println(tooltipmsg);
		

	}

}
