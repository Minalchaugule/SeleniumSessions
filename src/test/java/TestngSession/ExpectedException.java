package TestngSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedException {
     String name;

	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void SearchTest()
	{
		System.out.println("T--->Search user");
		int a=9/0;
		ExpectedException obj=new ExpectedException();
		obj=null;
		obj.name="minal";
	}
}
