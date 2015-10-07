package Sep22;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItTesting1 {


	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("upload-global-file")).click();
		Thread.sleep(2000);
		java.lang.Runtime.getRuntime().exec("E:\\uploadimge.exe");
	}

}
