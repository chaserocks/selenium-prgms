package Sep8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mouserghtclk {
	FirefoxDriver driver;
    @BeforeMethod
    public void setUp(){
  	  ProfilesIni pr=new ProfilesIni();
  	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
  	  driver=new FirefoxDriver(fp);
  	  driver.get("http://www.google.com");
}
    @Test 
    public void rightclickTest()
    {
    	Actions action=new Actions(driver);
    	WebElement event=driver.findElement(By.linkText("Gmail"));
    	action.contextClick(event).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    	//action.contextClick(event).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    	//action.contextClick(event).sendKeys("L").build().perform(); //By the use of Hot Keys 
    	}
    
}
