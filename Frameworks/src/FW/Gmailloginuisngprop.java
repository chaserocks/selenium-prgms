package FW;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmailloginuisngprop {
		FirefoxDriver driver;
		@BeforeMethod
		public void setUp(){
			driver=new FirefoxDriver();
			driver.get("http://gmail.com");
		}
		@Test
		public void loginTest() throws IOException, InterruptedException{
			FileInputStream f=new FileInputStream("E:\\Mystuff\\SELINUMWS\\Frameworks\\src\\FW\\GmailLogin.Properties");
			Properties pr=new Properties();
			pr.load(f);
			driver.findElement(By.id(pr.getProperty("txtusername"))).sendKeys("bharath.tester2365@gmail.com");
			driver.findElement(By.id(pr.getProperty("btnnext"))).click();
			Thread.sleep(3000);
			driver.findElement(By.id(pr.getProperty("txtpassword"))).sendKeys("capricorn235");
			driver.findElement(By.xpath(pr.getProperty("btnsignin"))).click();
			
		}
}
