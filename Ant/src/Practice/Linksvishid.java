package Practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

// Prgm to find how many links are visible and hidden in a website.
public class Linksvishid {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","D:\\MBC-23\\QEDGE TECH\\Selenium\\browser.webdriver\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total link count is "+ links.size());
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				count++;
			}
			System.out.println("Visible link count is"+ count);
			System.out.println("Hidden links count is"+(links.size()-count));
		}
	}

}
