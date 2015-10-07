package Sep9;
//W.A.pgrm to open 24hrsfitness and click on 'learn more' which appears after few seconds by the Implicitwait.
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Implicitwait {
	FirefoxDriver driver;
    @BeforeMethod
    public void setUp(){
  	  ProfilesIni pr=new ProfilesIni();
  	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
  	  driver=new FirefoxDriver(fp);
  	  driver.get("http://www.24hourfitness.com/not-yet-member.html");
}
    @Test 
    public void impliwaitTest()  
    {
    // Implicit Wait Statement
  	    driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
  	// xpath for 'Learn More'
  	    driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[2]/a")).click();
    }
    	
}
