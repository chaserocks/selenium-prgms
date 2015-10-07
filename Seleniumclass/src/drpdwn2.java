//Prgm to capture all the elements present in dropdownlist and display on the console.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class drpdwn2 {
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
        //id of the dropdown box
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List <WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getText());
		}
	}

}




	