package SEGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class yahoologin {
	@Test
	public void loginTest() throws MalformedURLException{
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.chrome(); // instead firefox(); working on chrome before that make changes in the cmd prmpt. 
		cap.setBrowserName("chrome"); //("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.45:2323/wd/hub"),cap); // use the newly created port where u have created the chrome and iexplore drivers.
		driver.get("http://yahoomail.com");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("mbc2389");
		driver.findElement(By.id("login-passwd")).sendKeys("chandras89");
		driver.findElement(By.name("signin")).click();		
	}
}
