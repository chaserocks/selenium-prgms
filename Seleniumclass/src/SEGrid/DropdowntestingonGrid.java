package SEGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DropdowntestingonGrid {
	@Parameters("browser")
	@Test
	public void dropdownTest(String b) throws MalformedURLException, Throwable
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),cap);
		driver.get("http://newtours.demoaut.com"); //Dropdown prgm copy paste.
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.name("country"));
		List <WebElement> dropdown=drop.findElements(By.tagName("option"));
        int a=MyRandomNo(dropdown.size()-1);
        	dropdown.get(a).click();
        if(dropdown.get(a).isSelected())
        	{
        	System.out.println(dropdown.get(a).getText()+"is active");
        	}
        else
        {
        	System.out.println(dropdown.get(a).getText()+"is not active");
        }
      }

	public static int MyRandomNo(int x)
	{
		double d=Math.random()*x;
		int a=(int)d;
		return a;		
	}

}
