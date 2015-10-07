package Sep10;
//Prgm to extract all the elements from the static webtable
//xpath of the first element in the first row
//html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[1]/td[1]
//xpath of the first element in the last row
//html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[37]/td[1]
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Staticwebtable1all {

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
		String part2="]/td[";
		String part3="]";
		for(int i=1;i<38;i++)
			for(int j=1;j<8;j++)
		{
			String x=driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();
			System.out.println(x+" ");
		}
			System.out.println();
}
}
