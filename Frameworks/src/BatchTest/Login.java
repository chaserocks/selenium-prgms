package BatchTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Launch{
	@Test
	public void loginTest(){
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
	}
	
}
