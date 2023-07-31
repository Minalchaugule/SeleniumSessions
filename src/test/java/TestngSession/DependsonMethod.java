package TestngSession;

import org.testng.annotations.Test;

public class DependsonMethod {
	
	//public void login()
//	{
//		//login();
//	}
	@Test
	public void LoginTest()
	{
		System.out.println("Login Test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void SearchTest()
	{
		//login()
		System.out.println("Search Test");
	}

	
	@Test(dependsOnMethods="SearchTest")
	public void SelectProductTest()
	{
		
		//login();
		//search();
		System.out.println("Product Test");
	}


}
