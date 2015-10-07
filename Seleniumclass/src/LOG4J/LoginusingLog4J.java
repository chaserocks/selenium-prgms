package LOG4J;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginusingLog4J {
	private static Logger log=Logger.getLogger(LoginusingLog4J.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser Launched");
		driver.get("http://yahoomail.com");
		log.info("Opened yahoomail");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("rbk.2389@yahoo.com");
		log.info("Entered Username");
		driver.findElement(By.id("login-passwd")).sendKeys("chandra23");
		log.info("Entered Password");
		driver.findElement(By.name("signin")).click();
		log.info("logged into the app successfully");
	}

}
