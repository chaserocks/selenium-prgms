package Aug25;
//Prgm to open google & find/click on the link "Rajinikanth".If the link isn't present then take a screenshot.
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotOnError1 {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		List <WebElement> links=driver.findElements(By.linkText("Rajinikanth"));
		if (links.size()==0)
		{
		// code for taking the screen shot
	      File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(srcFile,new File("C:\\users\\Office\\desktop\\gogl.png"));
		}
	}

}

