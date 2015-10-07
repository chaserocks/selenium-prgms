package Sep8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Slidebar {
	FirefoxDriver driver;
    @BeforeMethod
    public void setUp(){
  	  ProfilesIni pr=new ProfilesIni();
  	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
  	  driver=new FirefoxDriver(fp);
  	  driver.get("https://jqueryui.com/slider/#slider-vertical");
}
    @Test 
    public void slidebarTest()  ////*[@id='slider-vertical']/span
    {
    	Actions action=new Actions(driver);
    	driver.switchTo().frame(0);
    	WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
    	int y=slider.getLocation().y;
		action.dragAndDropBy(slider,75,y).build().perform();   
    	    	
    }
}
