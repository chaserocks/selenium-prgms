package Sep4;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multiplwndwbychrme {
	ChromeDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://bing.com");
	}
	@Test
	public void multipleWindowTest() throws InterruptedException{
		driver.findElement(By.linkText("Help")).click();
		// xpath of "privacy and cookies" in second window
		Thread.sleep(7000);// this is due to synchronization problem / net speed is slow.
		SwitchWindow("//*[@id='privacyLabel']");
		Thread.sleep(5000);
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


