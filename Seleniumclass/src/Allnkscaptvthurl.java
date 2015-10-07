import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
// Prgm to capture all the links and click on them & get the current url.
public class Allnkscaptvthurl {
	
	public static void main(String[] args) {
	ProfilesIni pr= new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("MyMozillaff");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://google.com");
	List <WebElement> links=driver.findElements(By.tagName("a"));
	for (int i=0;i<=links.size();i++)
	{
		//Skips the hidden links
		if(!links.get(i).getText().isEmpty())
		{
		System.out.println(links.get(i).getText());
	    links.get(i).click();
	    System.out.println(driver.getCurrentUrl());
	    driver.navigate().back();
	    links=driver.findElements(By.tagName("a"));
	}
	}

	}

}
