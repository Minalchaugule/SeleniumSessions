package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class ImplicitlyWait {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//sel 3
		
		//login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//imp wait -is a global wait
		//it is applicable for all web elements
		
		driver.findElement(By.name("username11")).sendKeys("admin");
		//e2-10
		//e3-10
		//e4-10
		//logout
		
		//HomePage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//e5-20
		//e6 - 20
		//e6-20
		//logout
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//login
		//e1-10
		//e2-10
		//e3-10
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//nullification
		//reg
		//e1-0

	}

}
