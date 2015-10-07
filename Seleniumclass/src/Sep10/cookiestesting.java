package Sep10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cookiestesting {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://mirror.co.uk");
	}
	@Test
	public void cookiSetTest()
	{
		//capture all cookies information
		Set<Cookie> mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		Iterator<Cookie> it=mycookies.iterator();
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"------------"+c.getDomain());
		}
     //   deletes all cookies
		driver.manage().deleteAllCookies();
		mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
	}
	
}
