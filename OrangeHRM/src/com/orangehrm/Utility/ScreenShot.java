package com.orangehrm.Utility;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	public class ScreenShot {
		public void getScreenshot(WebDriver driver,String filename) throws IOException
		{
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile,new File("E:\\Mystuff\\SELINUMWS\\OrangeHRM\\ScreenShots"+filename+".png"));
		}
	}

