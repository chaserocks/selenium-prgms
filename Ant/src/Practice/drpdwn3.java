package Practice;
// Prgm to select a city "from-city" and the selected city should nt b in the "To-city".
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class drpdwn3 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://goair.in");
        //id of the dropdown box
		driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id='departureCitysearchBoxUserControlCriteriaBox']")).click();
		WebElement drop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
		List <WebElement> dropdown=driver.findElements(By.tagName("option"));
		//driver.findElement(By.xpath("//*[@id='toCitysearchBoxUserControlCriteriaBox']")).sendKeys("Chennai");click();
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
			
		{
			System.out.println("chennai is not present in tocity");
		}
	}

}
//departureCitysearchBoxUserControlCriteriaBox

//toCitysearchBoxUserControlCriteriaBox