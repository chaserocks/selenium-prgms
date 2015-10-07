package Sep9;
//W.A.pgrm to open 24hrsfitness wait for 'check prices' to disappear and wait for 'learn more' to appear and then click on it by the fluentwait.
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait_Fluentwait {
	FirefoxDriver driver;
    @BeforeMethod
    public void setUp(){
  	  ProfilesIni pr=new ProfilesIni();
  	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
  	  driver=new FirefoxDriver(fp);
  	  driver.get("http://www.24hourfitness.com/not-yet-member.html");
}
    @Test 
    public void fluentwaitTest()  
    {
    // Fluent Wait using Statement
    	FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(40,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
  	// xpath for 'Check Price'.......Wait for it to disappear.
  	    fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[1]/a")));
  	// xpath for 'Learn More'.......Wait for it to appear.
        fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[2]/a"))).click();
 }
}
