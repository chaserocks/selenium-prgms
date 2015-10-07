package Sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class Xpathcptrinpf {
		FirefoxDriver driver;
		@BeforeMethod
		public void setUp(){
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("MyMozillaff");
			driver=new FirefoxDriver(fp);
			driver.get("http://facebook.com");
		}
			@Test // out of 8 txt fileds,last 8th field is hidden one so it prints only 7 txt fields.
			public void inputBoxTest()
			{
				String[] str={"one","two","three","four","five","six","seven"};
				//Common xpath for all elements of type text,email,password
				List <WebElement> myinput=driver.findElements(By.xpath("//input[@type='text' or @type='password' or @type='email']"));
			    System.out.println(myinput.size());
			    for(int i=0;i<myinput.size();i++)
			    {
			    	myinput.get(i).sendKeys(str[i]);
			    }
		}
}
