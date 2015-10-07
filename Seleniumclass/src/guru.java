import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class guru {


	public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			String baseUrl ="http://www.demo.guru99.com/v4/";
			driver.get(baseUrl);

	}

}
