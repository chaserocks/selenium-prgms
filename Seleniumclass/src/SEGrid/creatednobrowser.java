package SEGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class creatednobrowser {
	 public void loginTest() throws MalformedURLException{
	DesiredCapabilities cap=null;
	cap=DesiredCapabilities.chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.45:3333"),cap); //use the ip address with port number of any of the system.
	driver.get("http://yahoomail.com");
	driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("mbc2389");
	driver.findElement(By.id("login-passwd")).sendKeys("chandras89");
	driver.findElement(By.name("signin")).click();	
 }
}
