package Sep22;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotTesting1 {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("upload-global-file")).click();
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_K);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_J);
		rb.keyRelease(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
