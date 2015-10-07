package Aug25;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

//Alternate way by the use of ExceptionHandling
public class ScreenShotOnError2 {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		try
		{
			driver.findElement(By.linkText("Rajinikanth")).click();
		}
	catch(Exception e)
	{
		 File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(srcFile,new File("C:\\users\\Office\\desktop\\goglhex.png"));
		
	}

	}
	

}
