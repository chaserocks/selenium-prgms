package BatchTest;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Launch {       // deselect the selenium standlone 2.440 .jar file use only 1 jar file to run batchtest.
	FirefoxDriver driver;
	@BeforeClass
	public void launchApp(){
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
	}
	@AfterClass
	public void closeApp(){
		driver.quit();
	}
		
}
