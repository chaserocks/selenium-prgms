package day24;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginusingLog4j {

	private static Logger log=Logger.getLogger(YahooLoginusingLog4j.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser launched");
		driver.get("http://yahoomail.com");
		log.info("navigated to the url");
		driver.findElement(By.name("username")).sendKeys("saikrishna");
		log.info("Entered the username");
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
		log.info("Entered the password");
		driver.findElement(By.id("login-signin")).click();
		log.info("Clicked on signin");

	}

}
