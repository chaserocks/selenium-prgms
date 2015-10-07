package com.ohrm.testsuite;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logout  extends Constants{
@Test
public void logoutTest() throws IOException, InterruptedException
{
	String runmode=eo.getCellData(path2,0,4, 2);
	if(runmode.equals("N"))
	{
		throw new SkipException("Skipped logout Test");
	}
	else
	{
		LogoutPage lp=PageFactory.initElements(driver,LogoutPage.class);
		
		lp.logout();
	}
}
}
