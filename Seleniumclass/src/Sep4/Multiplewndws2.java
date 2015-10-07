package Sep4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multiplewndws2 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		driver=new FirefoxDriver(fp);
		driver.get("https://bing.com");
	}
	@Test
	public void multipleWindowTest(){
		driver.findElement(By.linkText("Help")).click();
		// xpath of "privacy and cookies" in second window
		SwitchWindow("//*[@id='privacyLabel']");
		//xpath of 'microsoft service agreement' in the third window
		SwitchWindow("//*[@id='psp_microsoft_services_agreement']");
	}
		public void SwitchWindow(String x)
		{
			Set<String>windowids=driver.getWindowHandles();
			Iterator<String> it=windowids.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				try
				{
					driver.findElement(By.xpath(x)).click();
					break;
				}
			catch(Exception e)
			{
				
			}
		}
	}
}

