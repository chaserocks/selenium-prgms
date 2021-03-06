package BatchTestByJunit4;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Launch {
	static FirefoxDriver driver;  
	
	@Before
	public static void launchApp(){      //Junit4 Requires static in P.V Methods.
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
	}
	@After
	public static void closeApp(){
		driver.quit();
	}
		
}
