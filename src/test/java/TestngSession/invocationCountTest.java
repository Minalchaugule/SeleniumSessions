package TestngSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class invocationCountTest {

	@Test(invocationCount=5,priority=1,expectedExceptions =Exception.class)
	public void SearchTest()
	{
		System.out.println("T--->Search user");
		Assert.assertEquals("Google","Google");
		int a=2/0;
	}
	
	@Test(priority=2)
	public void CartTest()
	{
		System.out.println("T---->Cart  test");
		Assert.assertEquals("Macbook","Macbook");
	}

}
