package TC1;
// This TC1 is there in the POM but here this is used to call from another package TC1 and import to POM.WelcomeMercuryTours.
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import POM.WelcomeMercuryTours;

public class TestCase1 {
		@Test
		public void pomTest()
		{
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("MyMozillaff");
			FirefoxDriver driver=new FirefoxDriver(fp);
			driver.get("http://newtours.demoaut.com");
			WelcomeMercuryTours wmt=PageFactory.initElements(driver,WelcomeMercuryTours.class);
			wmt.findAFlight("mbc2365","chandrasnice");
			driver.navigate().back();
			wmt.register();
			driver.navigate().back();
		    wmt.menu.contact();
		    wmt.menu.contact();
			driver.navigate().back();
			wmt.menu.signon();
			driver.navigate().back();
			wmt.menu.support();
			driver.navigate().back();
			wmt.destinations();
			driver.navigate().back();
			wmt.vacations();
		}
}