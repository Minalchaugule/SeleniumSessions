package TestngSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {
	String UserID;
	
	
	public int adduser()
	{
		System.out.println("add user");
		int userID=123;
		return userID;
	}
	
	@Test(priority=1)
	public void addUserTest()
	{
		int UserID=adduser();
		Assert.assertEquals(UserID,"123");
	}
	
	@Test(priority=2)
	public void getUserTest()
	{
		int UserID=adduser();
		System.out.println("Get user details with userID : "+UserID);
		
		
	}

	@Test(priority=3)
	public void UpdatetUserTest()
	{
		int UserID=adduser();
		System.out.println("Update the user with userID : "+UserID);
	}
	
	@Test(priority=4)
	public void deleteUserTest()
	{
		int UserID=adduser();
		System.out.println("delete userwith userID : "+UserID);
	}
}
