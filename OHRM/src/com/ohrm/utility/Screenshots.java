package com.ohrm.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	public void takingScreenshots(WebDriver driver,String filename) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("E:\\August12Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots\\"+filename+".png"));
	}

}
