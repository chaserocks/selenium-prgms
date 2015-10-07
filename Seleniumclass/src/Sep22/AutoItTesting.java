package Sep22;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItTesting {

	
	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.47.1")).click();
		Thread.sleep(2000);
		java.lang.Runtime.getRuntime().exec("E:\\standlnedownload.exe");

	}

}
