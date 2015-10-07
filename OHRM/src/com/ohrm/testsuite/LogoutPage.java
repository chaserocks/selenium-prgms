package com.ohrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	
	@FindBy(id="welcome")
	WebElement welcome;
	@FindBy(linkText="Change Password")
	WebElement changePassword;
	@FindBy(linkText="Logout")
	WebElement logout;
	public void logout() throws InterruptedException
	{
		welcome.click();
		Thread.sleep(4000);
		logout.click();
	}
	
	public void changePassword()
	{
		welcome.click();
		changePassword.click();
	}
	

}
