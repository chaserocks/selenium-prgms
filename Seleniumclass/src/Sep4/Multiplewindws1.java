package Sep4;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multiplewindws1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
	}
	@Test 
	public void MultipleWindowTest()
	{
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		try
		{
			//xpath of the privacy and cookies in the second window
			driver.findElement(By.xpath("//*[@id='privacy Label']")).click();
			break;
		}
      catch (Exception e)
      {
    	  
      }
     }
	}
   }

