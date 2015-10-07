package Sep8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class slidebarhrztl {
	FirefoxDriver driver;
    @BeforeMethod
    public void setUp(){
  	  ProfilesIni pr=new ProfilesIni();
  	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
  	  driver=new FirefoxDriver(fp);
  	  driver.get("https://jqueryui.com/slider/");
}
    @Test 
    public void slidebarTest()  ////*[@id='slider-vertical']/span
    {
    	Actions action=new Actions(driver);
    	driver.switchTo().frame(0); // find it by xpath as //iframe to get the index value.
    	WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
    	int x=slider.getLocation().x;
        int y=slider.getLocation().y;
        //System.out.println(x+"------"+y);
		action.dragAndDropBy(slider,500,y).build().perform();   
		 //System.out.println(x+"------"+y);
    	    	
}
}
