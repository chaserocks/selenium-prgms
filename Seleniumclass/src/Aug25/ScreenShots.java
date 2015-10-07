package Aug25;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShots {
	public static void main(String[] args) throws IOException {

	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://pvrcinemas.com");
	// code for taking the screen shot
      File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(srcFile,new File("C:\\users\\Office\\desktop\\pvr.png"));
	}
}