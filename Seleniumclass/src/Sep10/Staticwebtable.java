package Sep10;

//Prgm to extract first element in the Static Table.

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Staticwebtable {

	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
		public void staticwebtableTest()
	{
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[1]";
		for(int i=1;i<38;i++)
		{
			String x=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(x);
		}
	}
	
}
