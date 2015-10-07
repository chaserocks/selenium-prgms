package Sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChckboxesTNG {

	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		driver=new FirefoxDriver(fp);
		driver.get("http://echoecho.com/htmlforms09.htm");
	}
	@Test
	public void chechkboxTest()
	{
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
        List<WebElement> check=block.findElements(By.tagName("input"));
        for(int i=0;i<check.size();i++)
        {
        	System.out.println(check.get(i).getAttribute("value")+"------"+check.get(i).getAttribute("checked"));
        }
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
        
	}
}
