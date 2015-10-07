package Sep3;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathCreatnTNG {
	FirefoxDriver driver;
    @BeforeMethod 
    public void setUp(){
    	driver=new FirefoxDriver();
    	driver.get("http://gmail.com");
    	//driver.findElement(By.linkText("signIn")).click();
    }

    @Test
public void xpathTest()
{
	//xpath of 'one google account for everything google'
	String Xpa=driver.findElement(By.xpath("//p[@class='tagline']")).getText();
	System.out.println(Xpa);
}

}
