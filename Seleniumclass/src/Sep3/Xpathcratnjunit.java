package Sep3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Xpathcratnjunit {

	FirefoxDriver driver;
    @Before 
    public void setUp(){
    	driver=new FirefoxDriver();
    	driver.get("http://gmail.com");
    	driver.findElement(By.linkText("sign in")).click();
    }

    @Test
	public void xpathTest()
	//xpath of 'one google account for everything google'
   {
	driver.get("http://www.gmail.com");
	String Xpa=driver.findElement(By.xpath("//p[@class='tagline']")).getText();
	System.out.println(Xpa);
    }

}

