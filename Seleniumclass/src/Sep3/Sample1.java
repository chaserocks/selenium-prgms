package Sep3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {

	// prioritizing of the test cases
	
	@Test (priority=0) // if u don't give any priority then the o/p may display in alphabetical order.
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	
	@Test (priority=1)
	public void regTest()
	{
		System.out.println("This is for reg app");
	}
	//ignoring of the test cases
	
	@Test (priority=2)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}
	@BeforeMethod
	public void fun()
	{
	System.out.println("MBC");
	}

}
