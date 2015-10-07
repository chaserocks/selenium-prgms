package FW;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywrdGmaillgnusingxlfile {
		FirefoxDriver driver;
		public void launchBrowser(){
			driver=new FirefoxDriver();
		}
		public void navigate(){
			driver.get("http://gmail.com");
		}
		public void enterUsername(){
			driver.findElement(By.id("Email")).sendKeys("bharath.tester2365@gmail.com");
		}
		public void clickNext(){
			driver.findElement(By.id("next")).click();
		}
		public void enterPassword(){
			driver.findElement(By.id("Passwd")).sendKeys("capricorn235");
		}
		public void clickSignin(){
			driver.findElement(By.xpath("//*[@id='signIn']")).click();
		}
	}

