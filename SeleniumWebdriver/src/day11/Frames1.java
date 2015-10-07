package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	
	@Test
	public void framesTest()
	{
		List<WebElement> myframes=driver.findElements(By.tagName("frame"));
		System.out.println(myframes.size());
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
	}

}
