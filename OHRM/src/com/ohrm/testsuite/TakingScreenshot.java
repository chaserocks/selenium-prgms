package com.ohrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakingScreenshot extends Constants {

	@Test
	public void takieScrrenshot() throws IOException
	{
		String runmode=eo.getCellData(path2,0,3,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Skipped screenshot test");
		}
		else
		{
			sc.takingScreenshots(driver,"Addemp");
		}
	}
}
