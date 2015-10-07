package Sep10;
//Prgm to open google enter selenium in the search engine and capture all the auto suggestions
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AjaxAutoSuggestions {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{  
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	@Test 
	public void ajaxTest() throws InterruptedException
	{
		//class of google search box
		driver.findElement(By.className("gsfi")).sendKeys("selenium");
		Thread.sleep(3000);
		//class of the complete block of ajax auto suggestion
		WebElement block=driver.findElement(By.className("sbdd_b"));  //xpath .//*[@id='sbse2']/div[2]
 		List <WebElement> ajax=block.findElements(By.xpath("//*[contains(@id='sbse')]/div[2]"));
		System.out.println(ajax.size());
			for(int i=0;i<ajax.size();i++)
			{
			System.out.println(ajax.get(i).getText());
			}
	}
}
