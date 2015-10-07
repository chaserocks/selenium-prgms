package Sep8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {
	FirefoxDriver driver;
    @BeforeMethod
    public void setUp(){
  	  ProfilesIni pr=new ProfilesIni();
  	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
  	  driver=new FirefoxDriver(fp);
  	  driver.get("http://www.yssofindia.org");
}
    @Test 
    public void mouseHoverTest()
    {
    	Actions action=new Actions(driver);
    	// xpath of the 'About yss'
    	WebElement event1=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img"));
    	//xpath of the 'Contact Us'
    	WebElement event2=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
    	//xpath of the 'Email US'
    	WebElement event3=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
    	action.moveToElement(event1).moveToElement(event2).moveToElement(event3).click().build().perform();
    }
}