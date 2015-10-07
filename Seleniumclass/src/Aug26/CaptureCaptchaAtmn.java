package Aug26;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;

// To Capture the Captcha in harvard.edu/feedback.
//(Captcha can be captured only to the text captcha(5+4=9) bt nt the captcha images).
public class CaptureCaptchaAtmn {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Q.SE\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Or ProfilesIni pr=new ProfilesIni();
		//FirefoxProfile fp=pr.getProfile("MyMozillaff");
		//FirefoxDriver driver=new FirefoxDriver(fp);
		for(long z=1;z<=99l;z++)
		{
		driver.get("http://harvard.edu/feedback");
		driver.findElement(By.id("edit-submitted-name")).sendKeys("Chaserockzzz");
		driver.findElement(By.id("edit-submitted-email")).sendKeys("tester1@gmail.com");
		driver.findElement(By.id("edit-submitted-my-comment-is-about")).sendKeys("Suggestion");
		driver.findElement(By.id("edit-submitted-comment")).sendKeys("Change the text captcha type to captcha image type");
		// Class of Math Question
		String x=driver.findElement(By.className("field-prefix")).getText();
		String[] a=x.split(" ");
		int i=Integer.parseInt(a[0]); // x is in string DT then the value of i should b changed to integer type. so use Int.parseint.
		int j=Integer.parseInt(a[2]);
		int k=i+j;
		String str=Integer.toString(k);// k is in integer DT then make it to string DT, by the use of Int.to String.
		//id of the Math Result
		driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
		Thread.sleep(6000);
		driver.navigate().refresh();
		//driver.findElement(By.name("op")).click();// comment on the for loop above if u use this.
		}
	}

}
