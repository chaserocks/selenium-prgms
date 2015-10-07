package Sep3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpathdynmcallychnges {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		driver=new FirefoxDriver(fp);
		driver.get("https://yahoo.com");
	}
	@Test
	public void xpathTest()
	{                       //	@id"=" should replace vth @id"," when u use starts-with or contains .
		//driver.findElement(By.xpath("//*[contains(@id,'yui_3_12_0_1_1441')]/div/ol/li[8]/a")).click();
		//driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_1441')]/div/ol/li[10]/a")).click();
		driver.findElement(By.xpath("//*[contains(@id,'yui_3_12_0_1_1441')]/div/ol/li[10]/a")).click();
		// Here the link u selected, xpath is changing dynamically. so use the starts-with or contains 
	//	driver.findElement(By.xpath("//*//*[@id='yui_3_12_0_1_1441335770683_399']/div/ol/li[10]/a")).click();
	//	driver.findElement(By.xpath("//*[@id='yui_3_12_0_1_1441336397568_669']/div/ol/li[10]/a")).click();
	}
}
