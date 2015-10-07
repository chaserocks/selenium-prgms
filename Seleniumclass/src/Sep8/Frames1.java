package Sep8;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames1 {
      FirefoxDriver driver;
      @BeforeMethod
      public void setUp(){
    	  ProfilesIni pr=new ProfilesIni();
    	  FirefoxProfile fp=pr.getProfile("MyMozillaff");
    	  driver=new FirefoxDriver(fp);
    	  driver.get("http://www.angelfire.com/super/badwebs/");
      }
      @Test
      public void framesTest()
      {
    	  String wh=driver.getWindowHandle();  // U can use this for the particular window only,No need to use this if u use "driver.switchTo().defaultContent()" under catch block.
    	  List <WebElement> myframes=driver.findElements(By.tagName("frame"));
    	  System.out.println(myframes.size());
    	  for(int i=0;i<myframes.size();i++)
    	  {
    		  driver.switchTo().frame(i);
    		  try{
    			  //xpath of the element in the frame
    			  driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
    			  break;
    		  }
    		  catch(Exception e)
    		  {
    			  //switch back to the page from the frame.
    			  driver.switchTo().window(wh); //or use this driver.switchTo().defaultContent(); remove wh String above.
    			  //driver.switchTo().defaultContent();
    		  }
    	  }
    	  
      }
}
