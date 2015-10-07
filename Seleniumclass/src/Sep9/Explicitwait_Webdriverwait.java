package Sep9;
//W.A.pgrm to open 24hrsfitness wait for 'check prices' to become invisible and wait for 'learn more' to visible and then click on it by the Explicitwait.
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait_Webdriverwait {
	FirefoxDriver driver;
    @BeforeMethod
    public void setUp(){
  	  ProfilesIni pr=new ProfilesIni();
  	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
  	  driver=new FirefoxDriver(fp);
  	  driver.get("http://www.24hourfitness.com/not-yet-member.html");
}
    @Test 
    public void expliwaitTest()  
    {
    // Explicit Wait object using 'WebDriverWait
  	    WebDriverWait mywait=new WebDriverWait(driver,20);
  	// xpath for 'Check Price'.......Wait for it to disappear.
  	    mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[1]/a")));
  	// xpath for 'Learn More'.......Wait for it to appear.
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[2]/a"))).click();
    }
}
