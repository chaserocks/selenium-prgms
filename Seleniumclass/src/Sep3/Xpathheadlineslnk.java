package Sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpathheadlineslnk {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		driver=new FirefoxDriver(fp);
		driver.get("http://news.google.co.in/");
	}
		@Test
		public void xpathTest()
		{
			//xpath of all headline links
			List <WebElement> links=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
			}
		}
}
