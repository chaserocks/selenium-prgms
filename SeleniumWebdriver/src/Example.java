import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://expedia.in");
		Thread.sleep(3000);
		driver.findElement(By.id("hotel-1-children")).sendKeys("6");
		driver.findElement(By.id("hotel-destination")).click();
		Thread.sleep(4000);
		List<WebElement> d=driver.findElement(By.id("hotel-1-children-ages")).findElements(By.tagName("select"));
		for(int i=0;i<d.size();i++)
		{
			d.get(i).findElement(By.xpath("./option[contains(@value,'16')]")).click();
			Thread.sleep(3000);
			d=driver.findElement(By.id("hotel-1-children-ages")).findElements(By.tagName("select"));
		}
	}

}
