package TestngSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {

	
	@Test(priority=-1)
	public void SearchTest()
	{
		System.out.println("T--->Search user");
		Assert.assertEquals("Google","Google");
	}
	

	@Test(priority=2)
	public void CartTest()
	{
		System.out.println("T---->Cart  test");
		Assert.assertEquals("Macbook","Macbook");
	}

		@Test(priority=3)
		public void OrderTest()
		{
			System.out.println("T--->Order test");
			Assert.assertEquals(1000,1000);
		}
		
		@Test(priority=0)
		public void PaymentTest()
		{
			System.out.println("T--->Payment test");
			Assert.assertEquals(1000,1000);
		}
		
		@Test(priority=4)
		public void EmailTest()
		{
			System.out.println("T--->Email test");
			Assert.assertEquals(1000,1000);
		}
}
